package dicemc.dicemcsnowball;

import net.minecraft.world.entity.projectile.Snowball;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=SnowballDeluxe.MOD_ID, bus=Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {
	@SubscribeEvent
	public static void onSnowballHit(LivingHurtEvent event) {
		if (!event.getEntityLiving().level.isClientSide && event.getSource().isProjectile()) {
			if (event.getSource().getDirectEntity() instanceof Snowball) {
				int ticksFrozen = event.getEntityLiving().getTicksFrozen();
				event.getEntityLiving().setTicksFrozen(ticksFrozen + 50);
			}
		}
	}
}
