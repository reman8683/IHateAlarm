package com.reman8683.ihatealarm.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "net.minecraft.client.resource.PeriodicNotificationManager$NotifyTask")
public class NoAlarm {
	@Inject(at = @At("HEAD"), cancellable = true, method = "Lnet/minecraft/client/resource/PeriodicNotificationManager$NotifyTask;run()V")
	private void run(CallbackInfo info) {
		info.cancel();
	}
}
