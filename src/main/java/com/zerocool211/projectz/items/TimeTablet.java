package com.zerocool211.projectz.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.util.Random;

public class TimeTablet extends ModTablet
{

    public TimeTablet(String name)
    {
        super(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand)
    {
        if(player.inventory.hasItemStack(new ItemStack(fuelItem)) && !player.isSneaking() || !player.isSneaking() && player.isCreative())
        {
            if(!player.isCreative())
            {
                removeFuelItem(player);
            }
            world.setWorldTime(world.getWorldTime() + 1000);
            return new ActionResult<>(EnumActionResult.SUCCESS, stack);
        }
        if(player.inventory.hasItemStack(new ItemStack(fuelItem)) && player.isSneaking() || player.isSneaking() && player.isCreative())
        {
            if(!player.isCreative())
            {
                removeFuelItem(player);
            }
            world.setWorldTime(world.getWorldTime() + 2000);
            return new ActionResult<>(EnumActionResult.SUCCESS, stack);
        }
        return new ActionResult<>(EnumActionResult.PASS, stack);
    }

}
