package com.zerocool211.projectz.drops;

import java.util.Random;
import com.zerocool211.projectz.common.ModItems;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropHandler
{

    public static Random random;
    public static int twoItemChance = 25;
    public static int chanceSkeleton = 50;
    public static int chanceCreeper = 70;

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event)
    {
        random = new Random();

        if(event.getEntityLiving() instanceof EntityCreeper && random.nextInt(101) < chanceCreeper)
        {
            event.getEntityLiving().entityDropItem(new ItemStack(ModItems.fakeDiamond, amount(twoItemChance, 1, 2)), 0);
        }

        if(event.getEntityLiving() instanceof EntitySkeleton && random.nextInt(101) < chanceSkeleton)
        {
            event.getEntityLiving().entityDropItem(new ItemStack(ModItems.fakeDiamond, amount(twoItemChance, 1, 2)), 0);
        }
    }

    public int amount(int chance, int lowerAmount, int higherAmount)
    {
        random = new Random();
        int amount = lowerAmount;

        if(random.nextInt(101) < chance)
        {
            amount = higherAmount;
        }
        return amount;
    }

}