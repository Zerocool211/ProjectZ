package com.zerocool211.projectz;

import com.zerocool211.projectz.common.ModBlocks;
import com.zerocool211.projectz.common.ModItems;
import com.zerocool211.projectz.common.ModCT;
import com.zerocool211.projectz.common.ModRecipes;
import com.zerocool211.projectz.event.ModDropHandler;
import com.zerocool211.projectz.event.ModEventHandler;
import com.zerocool211.projectz.items.ModTablet;
import com.zerocool211.projectz.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = ProjectZ.MODID, version = ProjectZ.VERSION, name = ProjectZ.NAME)
public class ProjectZ
{

    public static final String MODID = "projectz";
    public static final String VERSION = "1.0.1";
    public static final String NAME = "ProjectZ";

    @SidedProxy(clientSide = "com.zerocool211.projectz.proxy.ClientProxy", serverSide = "com.zerocool211.projectz.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static ProjectZ instance;

    public static ModCT tabProjectZ;

    public static Item.ToolMaterial FAKEDIAMOND = EnumHelper.addToolMaterial("FAKEDIAMOND",3, 104, 8.0F, 3.0F, 10);
    public static ItemArmor.ArmorMaterial FAKE_DIAMOND = EnumHelper.addArmorMaterial("FAKE_DIAMOND", "projectz:fake_diamond", 7, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        tabProjectZ = new ModCT(CreativeTabs.getNextID(), "tab_projectz");
        ModItems.preInit();
        ModTablet.initTabletValues();
        ModBlocks.preInit();
        ModRecipes.initRecipes();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        MinecraftForge.EVENT_BUS.register(new ModDropHandler());
        MinecraftForge.EVENT_BUS.register(new ModEventHandler());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

}
