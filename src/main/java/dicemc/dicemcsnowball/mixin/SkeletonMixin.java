package dicemc.dicemcsnowball.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.world.entity.monster.Skeleton;

@Mixin(Skeleton.class)
public interface SkeletonMixin {
	@Accessor("inPowderSnowTime")
	public void setInPowderSnowTime(int timeInSnow);
}
