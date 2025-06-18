/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package crazyinc.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import crazyinc.CrazyincMod;

public class CrazyincModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CrazyincMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> CORRECT = REGISTRY.register("correct", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("crazyinc", "correct")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FALSE = REGISTRY.register("false", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("crazyinc", "false")));
}