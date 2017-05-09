package com.zerocool211.projectz.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class DirtTablet extends ModTablet
{

    public DirtTablet(String name)
    {
        super(name);
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        IBlockState iblockstate = world.getBlockState(pos);
        Block block = iblockstate.getBlock();

        if(player.inventory.hasItemStack(new ItemStack(fuelItem)) || player.isCreative())
        {
            if (block == Blocks.SNOW_LAYER && ((Integer)iblockstate.getValue(BlockSnow.LAYERS)).intValue() < 1)
            {
                facing = EnumFacing.UP;
            }
            else if (!block.isReplaceable(world, pos))
            {
                pos = pos.offset(facing);
            }

            if(player.canPlayerEdit(pos, facing, stack) && world.canBlockBePlaced(block, pos, false, facing, (Entity)null, stack))
            {
                if(!player.isCreative())
                {
                    random = new Random();
                    if(random.nextInt(101) < useChance)
                    {
                        removeItem(player, new ItemStack(fuelItem));
                    }
                }

                world.setBlockState(pos, Blocks.DIRT.getDefaultState());
                player.playSound(SoundEvents.BLOCK_GRAVEL_PLACE, 1.0F, 0.8F);
                return EnumActionResult.SUCCESS;
            }
        }
        return EnumActionResult.PASS;
    }

}
