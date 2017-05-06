package com.zerocool211.projectz.common;

import com.zerocool211.projectz.ProjectZ;
import com.zerocool211.projectz.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

import static net.minecraftforge.fml.common.registry.GameRegistry.register;

public class ModItems
{

    public static Item fakeDiamond;
    public static Item fakeDiamondSword;
    public static Item fakeDiamondShovel;
    public static Item fakeDiamondPickaxe;
    public static Item fakeDiamondAxe;
    public static Item fakeDiamondHoe;
    public static ItemArmor fakeDiamondHelmet;
    public static ItemArmor fakeDiamondChestplate;
    public static ItemArmor fakeDiamondLeggings;
    public static ItemArmor fakeDiamondBoots;
    public static Item blankTablet;
    public static Item destructionTablet;
    public static Item waterTablet;
    public static Item lavaTablet;
    public static Item cobblestoneTablet;
    public static Item dirtTablet;
    public static Item gravelTablet;
    public static Item reversingTablet;
    public static Item timeTablet;
    public static Item reverseTimeTablet;
    public static Item growthTablet;
    public static Item flightTablet;

    public static void preInit()
    {
        fakeDiamond = new ModItem("fake_diamond");
        fakeDiamondSword = new ModSword(ProjectZ.FAKEDIAMOND, "fake_diamond_sword");
        fakeDiamondShovel = new ModShovel(ProjectZ.FAKEDIAMOND, "fake_diamond_shovel");
        fakeDiamondPickaxe = new ModPickaxe(ProjectZ.FAKEDIAMOND, "fake_diamond_pickaxe");
        fakeDiamondAxe = new ModAxe(ProjectZ.FAKEDIAMOND, 8.0F, -3.0F, "fake_diamond_axe");
        fakeDiamondHoe = new ModHoe(ProjectZ.FAKEDIAMOND, "fake_diamond_hoe");
        fakeDiamondHelmet = register(new ModArmor(ProjectZ.FAKE_DIAMOND,EntityEquipmentSlot.HEAD, "fake_diamond_helmet"));
        fakeDiamondChestplate = register(new ModArmor(ProjectZ.FAKE_DIAMOND,EntityEquipmentSlot.CHEST, "fake_diamond_chestplate"));
        fakeDiamondLeggings = register(new ModArmor(ProjectZ.FAKE_DIAMOND,EntityEquipmentSlot.LEGS, "fake_diamond_leggings"));
        fakeDiamondBoots = register(new ModArmor(ProjectZ.FAKE_DIAMOND,EntityEquipmentSlot.FEET, "fake_diamond_boots"));
        blankTablet = new ModItem("blank_tablet");
        destructionTablet = new ModItem("destruction_tablet");

        waterTablet = new WaterTablet("water_tablet"); //
        lavaTablet = new LavaTablet("lava_tablet");
        cobblestoneTablet = new CobblestoneTablet("cobblestone_tablet");
        dirtTablet = new DirtTablet("dirt_tablet");
        gravelTablet = new GravelTablet("gravel_tablet");
        reversingTablet = new ModItem("reversing_tablet");
        timeTablet = new TimeTablet("time_tablet");
        reverseTimeTablet = new ReverseTimeTablet("reverse_time_tablet");
        growthTablet = new GrowthTablet("growth_tablet");
        flightTablet = new ModItem("flight_tablet"); //

        registerItems();
    }

    public static void registerItems()
    {
        register(fakeDiamond, new ResourceLocation(ProjectZ.MODID, "fake_diamond"));
        register(fakeDiamondSword, new ResourceLocation(ProjectZ.MODID, "fake_diamond_sword"));
        register(fakeDiamondShovel, new ResourceLocation(ProjectZ.MODID, "fake_diamond_shovel"));
        register(fakeDiamondPickaxe, new ResourceLocation(ProjectZ.MODID, "fake_diamond_pickaxe"));
        register(fakeDiamondAxe, new ResourceLocation(ProjectZ.MODID, "fake_diamond_axe"));
        register(fakeDiamondHoe, new ResourceLocation(ProjectZ.MODID, "fake_diamond_hoe"));
        register(blankTablet, new ResourceLocation(ProjectZ.MODID, "blank_tablet"));
        register(destructionTablet, new ResourceLocation(ProjectZ.MODID, "destruction_tablet"));
        register(waterTablet, new ResourceLocation(ProjectZ.MODID, "water_tablet"));
        register(lavaTablet, new ResourceLocation(ProjectZ.MODID, "lava_tablet"));
        register(cobblestoneTablet, new ResourceLocation(ProjectZ.MODID, "cobblestone_tablet"));
        register(dirtTablet, new ResourceLocation(ProjectZ.MODID, "dirt_tablet"));
        register(gravelTablet, new ResourceLocation(ProjectZ.MODID, "gravel_tablet"));
        register(reversingTablet, new ResourceLocation(ProjectZ.MODID, "reversing_tablet"));
        register(timeTablet, new ResourceLocation(ProjectZ.MODID, "time_tablet"));
        register(reverseTimeTablet, new ResourceLocation(ProjectZ.MODID, "reverse_time_tablet"));
        register(growthTablet, new ResourceLocation(ProjectZ.MODID, "growth_tablet"));
        register(flightTablet, new ResourceLocation(ProjectZ.MODID, "flight_tablet"));
    }

    public static void registerRenders()
    {
        registerRender(fakeDiamond);
        registerRender(fakeDiamondSword);
        registerRender(fakeDiamondShovel);
        registerRender(fakeDiamondPickaxe);
        registerRender(fakeDiamondAxe);
        registerRender(fakeDiamondHoe);
        registerRender(fakeDiamondHelmet);
        registerRender(fakeDiamondChestplate);
        registerRender(fakeDiamondLeggings);
        registerRender(fakeDiamondBoots);
        registerRender(blankTablet);
        registerRender(destructionTablet);
        registerRender(waterTablet);
        registerRender(lavaTablet);
        registerRender(cobblestoneTablet);
        registerRender(dirtTablet);
        registerRender(gravelTablet);
        registerRender(reversingTablet);
        registerRender(timeTablet);
        registerRender(reverseTimeTablet);
        registerRender(growthTablet);
        registerRender(flightTablet);
    }

    public static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ProjectZ.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
