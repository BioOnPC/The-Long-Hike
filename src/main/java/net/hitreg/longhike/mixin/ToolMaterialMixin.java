package net.hitreg.longhike.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.item.ToolMaterials;

@Mixin(ToolMaterials.class)
public class ToolMaterialMixin{
	@Inject(method = "GOLD", at = @At("RETURN"), cancellable = true)
	private void onGold(CallbackInfo ci) {
		this.durability = 40;
	}
}
