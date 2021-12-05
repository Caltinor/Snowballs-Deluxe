package dicemc.dicemcsnowball;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
	public static ForgeConfigSpec COMMON_CONFIG;
	
	public static ForgeConfigSpec.ConfigValue<Integer> FREEZE_ON_HIT;
	public static ForgeConfigSpec.ConfigValue<Double> STRAY_CHANCE;
	
	static {
		ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
		
		COMMON_BUILDER.comment("Mod Settings").push("Common");
		FREEZE_ON_HIT = COMMON_BUILDER.comment("How much should one snowball add to the freeze amount?",
							"140 is fully frozen.  50 is default.")
							.defineInRange("Freeze On Hit", 50, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.class);
		STRAY_CHANCE = COMMON_BUILDER.comment("Likelihood that a snowball will trigger skeleton conversion.")
							.defineInRange("Stray Chance", 0.3, 0d, 1d, Double.class);
		COMMON_BUILDER.pop();
		
		COMMON_CONFIG = COMMON_BUILDER.build();
	}
}
