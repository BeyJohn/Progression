package com.beyjohn.Main;

import com.beyjohn.block.LeadBlock;
import com.beyjohn.item.Graphene;
import com.beyjohn.lib.*;
import com.beyjohn.misc.WorldGen;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry 
{
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	
	@EventHandler // The preInit is for adding blocks, items, worldgen and much more - See more at: http://www.orangetutorial.com/basic-mod-file/#sthash.fWio9dvE.dpuf
	public static void PreLoad(FMLPreInitializationEvent PreEvent)
	{
		proxy.registerRenderInfo();
		ModBlocks.init();
		ModItems.init();
		GameRegistry.registerWorldGenerator(new WorldGen(), 1);
	}
	@EventHandler // Init is for adding TileEntities, events, rendererís
	public static void Load(FMLInitializationEvent Event)
	{
		
	}
	@EventHandler // PostInit is for addons for other mods.
	public static void PostLoad(FMLPostInitializationEvent PostEvent)
	{
		
	}
}
