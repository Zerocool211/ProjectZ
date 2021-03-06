package com.zerocool211.projectz.common;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{

    public static void initRecipes()
    {
        //Fake Diamond Block Recipes
        GameRegistry.addRecipe(new ItemStack(ModBlocks.fakeDiamondBlock, 1), "DDD", "DDD", "DDD", 'D', ModItems.fakeDiamond);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fakeDiamond, 9), ModBlocks.fakeDiamondBlock);

        //Essence Block Recipes
        GameRegistry.addRecipe(new ItemStack(ModBlocks.essenceBlock, 1), "DDD", "DDD", "DDD", 'D', ModItems.essence);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essence, 9), ModBlocks.essenceBlock);

        //Fake Diamond Tool Recipes
        GameRegistry.addRecipe(new ItemStack(ModItems.fakeDiamondSword, 1), "D", "D", "S", 'D', ModItems.fakeDiamond, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ModItems.fakeDiamondShovel, 1), "D", "S", "S", 'D', ModItems.fakeDiamond, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ModItems.fakeDiamondPickaxe, 1), "DDD", " S ", " S ", 'D', ModItems.fakeDiamond, 'S', Items.STICK);
        addAxeRecipe(new ItemStack(ModItems.fakeDiamondAxe, 1), ModItems.fakeDiamond, Items.STICK);
        addHoeRecipe(new ItemStack(ModItems.fakeDiamondHoe, 1), ModItems.fakeDiamond, Items.STICK);

        //Fake Diamond Armor Recipes
        addHelmetRecipe(new ItemStack(ModItems.fakeDiamondHelmet, 1), ModItems.fakeDiamond);
        GameRegistry.addRecipe(new ItemStack(ModItems.fakeDiamondChestplate, 1), "D D", "DDD", "DDD", 'D', ModItems.fakeDiamond);
        GameRegistry.addRecipe(new ItemStack(ModItems.fakeDiamondLeggings, 1), "DDD", "D D", "D D", 'D', ModItems.fakeDiamond);
        addBootsRecipe(new ItemStack(ModItems.fakeDiamondBoots, 1), ModItems.fakeDiamond);

        //Tablet Recipes
        GameRegistry.addRecipe(new ItemStack(ModItems.blankTablet, 1), "SIS", "ISI", "SIS", 'S', new ItemStack(Blocks.STONE, 1, 0), 'I', new ItemStack(Items.DYE, 1, 0));
        GameRegistry.addRecipe(new ItemStack(ModItems.destructionTablet, 1), "SCS", "CTC", "DLD", 'S', Blocks.COBBLESTONE, 'D', Blocks.DIRT, 'C', Items.COAL, 'T', ModItems.blankTablet , 'L', Items.LAVA_BUCKET);
        GameRegistry.addRecipe(new ItemStack(ModItems.waterTablet, 1), "OBO", "BTB", "OBO", 'O', Blocks.OBSIDIAN, 'B', Items.WATER_BUCKET, 'T', ModItems.blankTablet);
        GameRegistry.addRecipe(new ItemStack(ModItems.lavaTablet, 1), "OBO", "BTB", "OBO", 'O', Blocks.OBSIDIAN, 'B', Items.LAVA_BUCKET, 'T', ModItems.blankTablet);
        GameRegistry.addRecipe(new ItemStack(ModItems.cobblestoneTablet, 1), "GBG", "BTB", "GBG", 'G', Items.GUNPOWDER, 'B', Blocks.COBBLESTONE, 'T', ModItems.blankTablet);
        GameRegistry.addRecipe(new ItemStack(ModItems.dirtTablet, 1), "GBG", "BTB", "GBG", 'G', Items.GUNPOWDER, 'B', Blocks.DIRT, 'T', ModItems.blankTablet);
        GameRegistry.addRecipe(new ItemStack(ModItems.gravelTablet, 1), "GBG", "BTB", "GBG", 'G', Items.GUNPOWDER, 'B', Blocks.GRAVEL, 'T', ModItems.blankTablet);
        GameRegistry.addRecipe(new ItemStack(ModItems.reversingTablet, 1), "LFL", "NTN", "LFL", 'L', Blocks.LAPIS_BLOCK, 'F', Items.FLINT, 'T', ModItems.blankTablet, 'N', Items.QUARTZ);
        GameRegistry.addRecipe(new ItemStack(ModItems.timeTablet, 1), "GLG", "CTC", "GSG", 'G', Blocks.GOLD_BLOCK, 'C', Items.CLOCK, 'T', ModItems.blankTablet, 'L', new ItemStack(Items.DYE, 1, 4), 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ModItems.reverseTimeTablet, 1), "GSG", "CTC", "GLG", 'G', Blocks.GOLD_BLOCK, 'C', Items.CLOCK, 'T', ModItems.blankTablet, 'L', new ItemStack(Items.DYE, 1, 4), 'S', Items.STICK);
        //GameRegistry.addRecipe(new ItemStack(ModItems.growthTablet, 1), "SBC", "MTM", "OBP", 'B', Items.BONE, 'M', new ItemStack(Items.DYE, 1, 15), 'T', ModItems.blankTablet, 'S', Items.WHEAT_SEEDS, 'C', Items.REEDS, 'O', new ItemStack(Blocks.SAPLING, 1, 0), 'P', Items.PUMPKIN_SEEDS);
        //GameRegistry.addRecipe(new ItemStack(ModItems.flightTablet, 1), "DND", "NTN", "DGD", 'D', Blocks.DIAMOND_BLOCK, 'G', Items.GHAST_TEAR, 'T', ModItems.blankTablet, 'N', Items.NETHER_STAR);
        GameRegistry.addRecipe(new ItemStack(ModItems.milkTablet, 1), "OBO", "BTB", "OBO", 'O', Blocks.OBSIDIAN, 'B', Items.MILK_BUCKET, 'T', ModItems.blankTablet);

        //Token Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cobblestoneToken, 1), ModItems.destructionTablet.setContainerItem(ModItems.destructionTablet), Blocks.COBBLESTONE, Items.GUNPOWDER);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.stoneToken, 1), ModItems.destructionTablet.setContainerItem(ModItems.destructionTablet), new ItemStack(Blocks.STONE, 1, 0), Items.GUNPOWDER);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dirtToken, 1), ModItems.destructionTablet.setContainerItem(ModItems.destructionTablet), Blocks.DIRT, Items.GUNPOWDER);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gravelToken, 1), ModItems.destructionTablet.setContainerItem(ModItems.destructionTablet), Blocks.GRAVEL, Items.GUNPOWDER);
    }

    public static void addAxeRecipe(ItemStack output, Item material, Item shaft)
    {
        GameRegistry.addRecipe(output, "MM", "MS", " S", 'M', material, 'S', shaft);
        GameRegistry.addRecipe(output, "MM", "SM", " S", 'M', material, 'S', shaft);
    }

    public static void addHoeRecipe(ItemStack output, Item material, Item shaft)
    {
        GameRegistry.addRecipe(output, "MM", " S", " S", 'M', material, 'S', shaft);
        GameRegistry.addRecipe(output, "MM", "S ", "S ", 'M', material, 'S', shaft);
    }

    public static void addHelmetRecipe(ItemStack output, Item material)
    {
        GameRegistry.addRecipe(output, "MMM", "M M", "   ", 'M', material);
        GameRegistry.addRecipe(output, "   ", "MMM", "M M", 'M', material);
    }

    public static void addBootsRecipe(ItemStack output, Item material)
    {
        GameRegistry.addRecipe(output, "M M", "M M", "   ", 'M', material);
        GameRegistry.addRecipe(output, "   ", "M M", "M M", 'M', material);
    }

}
