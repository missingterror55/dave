
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theshitmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.theshitmod.TheShitModMod;

public class TheShitModModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, TheShitModMod.MODID);
	public static final RegistryObject<PaintingVariant> STONKS = REGISTRY.register("stonks", () -> new PaintingVariant(800, 450));
}
