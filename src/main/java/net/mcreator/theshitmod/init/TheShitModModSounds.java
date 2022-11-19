
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theshitmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.theshitmod.TheShitModMod;

public class TheShitModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheShitModMod.MODID);
	public static final RegistryObject<SoundEvent> ERROR = REGISTRY.register("error",
			() -> new SoundEvent(new ResourceLocation("the_shit_mod", "error")));
}
