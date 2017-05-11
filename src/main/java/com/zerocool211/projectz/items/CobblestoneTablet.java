package com.zerocool211.projectz.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class CobblestoneTablet extends ModTablet
{

    public CobblestoneTablet(String name)
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
                IBlockState iblockstate1;
                iblockstate1 = world.getBlockState(pos);

                if(!player.isCreative())
                {
                    removeFuelItem(player);
                }

                world.setBlockState(pos, Blocks.COBBLESTONE.getDefaultState());
                SoundType soundtype = iblockstate1.getBlock().getSoundType(iblockstate1, world, pos, player);
                world.playSound(player, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
                return EnumActionResult.SUCCESS;
            }
        }
        return EnumActionResult.PASS;
    }

}
