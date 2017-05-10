package com.zerocool211.projectz.event;

import java.util.Random;
import com.zerocool211.projectz.common.ModItems;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModDropHandler
{

    public static Random random;
    public static int twoItemChance = 25;
    public static int chanceSkeleton = 50;
    public static int chanceCreeper = 70;
    public static int chanceZombie = 80;
    public static int chanceSpider = 80;

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

        if(event.getEntityLiving() instanceof EntityZombie && random.nextInt(101) < chanceZombie)
        {
            event.getEntityLiving().entityDropItem(new ItemStack(ModItems.essence, 1), 0);
        }

        if(event.getEntityLiving() instanceof EntitySpider && random.nextInt(101) < chanceSpider)
        {
            event.getEntityLiving().entityDropItem(new ItemStack(ModItems.essence, 1), 0);
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