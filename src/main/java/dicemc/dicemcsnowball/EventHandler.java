package dicemc.dicemcsnowball;

import java.util.Random;

import dicemc.dicemcsnowball.mixin.SkeletonMixin;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=SnowballDeluxe.MOD_ID, bus=Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {
	private static Random rnd = new Random(1337);
	@SubscribeEvent
	public static void onSnowballHit(LivingAttackEvent event) {
		if (!event.getEntity().level.isClientSide && event.getSource().isProjectile()) {
			if (event.getSource().getDirectEntity() instanceof Snowball) {
				int ticksFrozen = event.getEntityLiving().getTicksFrozen();
				event.getEntityLiving().setIsInPowderSnow(true);
				event.getEntityLiving().setTicksFrozen(ticksFrozen + Config.FREEZE_ON_HIT.get());
				if (event.getEntityLiving() instanceof SkeletonMixin) {
					int rndValue = rnd.nextInt((int)(150d/ Config.STRAY_CHANCE.get()));
					System.out.println(rndValue);
					((SkeletonMixin)event.getEntityLiving()).setInPowderSnowTime(rndValue);
				}
			}
		}
	}
}
