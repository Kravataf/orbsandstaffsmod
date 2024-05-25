
package net.mcreator.orbsandstaffs.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.orbsandstaffs.item.ItemEnderiumIngot;
import net.mcreator.orbsandstaffs.block.BlockEnderium;
import net.mcreator.orbsandstaffs.ElementsOnS;

@ElementsOnS.ModElement.Tag
public class RecipeSmeltEnderiumIngot extends ElementsOnS.ModElement {
	public RecipeSmeltEnderiumIngot(ElementsOnS instance) {
		super(instance, 13);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockEnderium.block, (int) (1)), new ItemStack(ItemEnderiumIngot.block, (int) (1)), 1F);
	}
}
