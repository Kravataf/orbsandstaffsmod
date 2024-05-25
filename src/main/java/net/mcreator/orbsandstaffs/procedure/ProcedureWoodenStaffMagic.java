package net.mcreator.orbsandstaffs.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.orbsandstaffs.item.ItemOrbOfLightning;
import net.mcreator.orbsandstaffs.item.ItemOrbOfGround;
import net.mcreator.orbsandstaffs.item.ItemOrbOfFire;
import net.mcreator.orbsandstaffs.ElementsOnS;

@ElementsOnS.ModElement.Tag
public class ProcedureWoodenStaffMagic extends ElementsOnS.ModElement {
	public ProcedureWoodenStaffMagic(ElementsOnS instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure WoodenStaffMagic!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WoodenStaffMagic!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if ((new ItemStack(ItemOrbOfLightning.block, (int) (1))
				.getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem())) {
			world.addWeatherEffect(
					new EntityLightningBolt(world,
							(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
									entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
											entity.getLook(1f).z * 100),
									false, false, true).getBlockPos().getX()),
							(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
									entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
											entity.getLook(1f).z * 100),
									false, false, true).getBlockPos().getY()),
							(int) (entity.world
									.rayTraceBlocks(entity.getPositionEyes(1f), entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100,
											entity.getLook(1f).y * 100, entity.getLook(1f).z * 100), false, false, true)
									.getBlockPos().getZ()),
							false));
		}
		if ((new ItemStack(ItemOrbOfFire.block, (int) (1))
				.getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem())) {
			{
				MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
				if (mcserv != null)
					mcserv.getPlayerList().sendMessage(new TextComponentString("zatial nefunguje(fire)"));
			}
		}
		if ((new ItemStack(ItemOrbOfGround.block, (int) (1))
				.getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem())) {
			{
				MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
				if (mcserv != null)
					mcserv.getPlayerList().sendMessage(new TextComponentString("zatial nefunguje(ground)"));
			}
		}
	}
}
