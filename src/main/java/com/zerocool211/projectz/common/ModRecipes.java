package com.zerocool211.projectz.common;

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
