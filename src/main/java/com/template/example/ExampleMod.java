package com.template.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	public static final String MOD_ID = "modid";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//Example code, you can remove it
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(mod -> {
			ModMetadata meta = mod.getMetadata();
			LOGGER.info(meta.getName() + " " + meta.getVersion().getFriendlyString() + " got successfully initialized!");
		});
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
