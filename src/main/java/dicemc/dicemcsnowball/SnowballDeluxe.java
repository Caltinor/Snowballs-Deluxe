package dicemc.dicemcsnowball;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SnowballDeluxe.MOD_ID)
public class SnowballDeluxe
{
	public static final String MOD_ID = "dicemcsnowball";
	
	public SnowballDeluxe() {
		 ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
	}
}
