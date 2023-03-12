package com.reman8683.ihatealarm;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.resource.PeriodicNotificationManager;
import net.minecraft.resource.ResourceReloader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IHateAlarm implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("ihatealarm");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fxxxing Alarm world!");
	}
}
