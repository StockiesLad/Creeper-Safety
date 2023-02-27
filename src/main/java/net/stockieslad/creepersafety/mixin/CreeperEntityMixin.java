package net.stockieslad.creepersafety.mixin;

import net.stockieslad.creepersafety.ExplodeOnFire;
import net.minecraft.entity.mob.CreeperEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(CreeperEntity.class)
public class CreeperEntityMixin implements ExplodeOnFire {
    @Shadow
    public void ignite() {}
    @Override
    public void explodeOnFire() {
        ignite();
    }
}
