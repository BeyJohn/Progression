package com.beyjohn.block;

import com.beyjohn.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

public class SilverBlock extends Block
{
	public static String name = "silverBlock";
	public SilverBlock()
	{
		super(Material.iron);
		this.setBlockName(RefStrings.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockTextureName(RefStrings.MODID + ":SilverBlock");
		this.setStepSound(Block.soundTypeMetal);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.0f);
		GameRegistry.registerBlock(this, name);
	}
}