
package net.mcreator.orbsandstaffs.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.orbsandstaffs.item.ItemOrbiumIngot;
import net.mcreator.orbsandstaffs.block.BlockOrbiumOre;
import net.mcreator.orbsandstaffs.ElementsOnS;

@ElementsOnS.ModElement.Tag
public class RecipeSmeltOrbiumIngot extends ElementsOnS.ModElement {
	public RecipeSmeltOrbiumIngot(ElementsOnS instance) {
		super(instance, 9);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockOrbiumOre.block, (int) (1)), new ItemStack(ItemOrbiumIngot.block, (int) (1)), 1F);
	}
}
