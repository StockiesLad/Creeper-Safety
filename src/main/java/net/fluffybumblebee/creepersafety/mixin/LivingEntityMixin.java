package net.fluffybumblebee.creepersafety.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.CreeperEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    private void saveCreepersFromExplosion(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        if(source.isExplosive() && (Object)this instanceof CreeperEntity) {
            cir.setReturnValue(false);
        }
    }
}
