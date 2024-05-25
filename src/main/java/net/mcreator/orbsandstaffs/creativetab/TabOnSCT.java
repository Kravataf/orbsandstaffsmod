
package net.mcreator.orbsandstaffs.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.orbsandstaffs.item.ItemOrbOfLightning;
import net.mcreator.orbsandstaffs.ElementsOnS;

@ElementsOnS.ModElement.Tag
public class TabOnSCT extends ElementsOnS.ModElement {
	public TabOnSCT(ElementsOnS instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabonsct") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemOrbOfLightning.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
