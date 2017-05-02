package com.zerocool211.projectz.event;

import com.zerocool211.projectz.common.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.entity.player.PlayerPickupXpEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class ModEventHandler
{

    //Commented Code Is For Testing Purposes Only.

    @SubscribeEvent
    public void entityJoinWorld(EntityJoinWorldEvent event)
    {
        //if(event.getEntity() instanceof EntityPlayer)
        //{
            //EntityPlayer player = (EntityPlayer) event.getEntity();
            //player.inventory.addItemStackToInventory(new ItemStack(Items.NETHER_STAR, 1));
            //if(event.getWorld().isRemote)
            //{
                //player.addChatComponentMessage(new TextComponentString("Welcome To This World..."));
            //}
        //}
    }

    @SubscribeEvent
    public void livingHurt(LivingHurtEvent event)
    {
        //if(event.getSource().getEntity() instanceof EntityPlayer)
        //{
            //EntityPlayer player = (EntityPlayer) event.getSource().getEntity();
            //if(player.getHeldItemMainhand() != null)
            //{
                //if(player.getHeldItemMainhand().getItem() == ModItems.fakeDiamond)
                //{
                    //event.setAmount(10);
                    //event.getEntity().setFire(10);
                //}
            //}
        //}
    }

    @SubscribeEvent
    public void itemPickup(PlayerEvent.ItemPickupEvent event)
    {
        InventoryPlayer inventory = event.player.inventory;
        if (inventory.hasItemStack(new ItemStack(ModItems.baseTablet)))
        {
            //removeItem(event.player, new ItemStack(Blocks.COBBLESTONE));
        }
    }

    public void removeItem(EntityPlayer ep, ItemStack removeitem) {
        IInventory inv = ep.inventory;
        for(int i=0; i < inv.getSizeInventory(); i++)
        {
            if(inv.getStackInSlot(i) != null)
            {
                ItemStack j = inv.getStackInSlot(i);
                if(j.getItem() != null && j.getItem() == removeitem.getItem())
                {
                    inv.setInventorySlotContents(i, null);
                }
            }
        }
    }

    @SubscribeEvent
    public void livingUpdate(LivingEvent.LivingUpdateEvent event)
    {
        //if(event.getEntity() instanceof EntityPlayer)
        //{
            //EntityPlayer player = (EntityPlayer) event.getEntity();
            //if(player.getHeldItemMainhand() != null)
            //{
                //if(player.getHeldItemMainhand().getItem() == Items.APPLE)
                //{
                    //player.setFire(1);
                    //player.addExperienceLevel(1);
                //}
            //}

        //}
    }

    @SubscribeEvent
    public void itemTooltip(ItemTooltipEvent event)
    {
        //if(event.getItemStack().getItem() == Items.DIAMOND)
        //{
            //event.getToolTip().add("Real Deal");
        //}
    }

    @SubscribeEvent
    public void blockBreak(BlockEvent.BreakEvent event)
    {
        //event.setExpToDrop(10);
        //if(event.getState().getBlock() == Blocks.DIRT)
        //{
            //event.setExpToDrop(10);
            //BlockPos pos = event.getPos();
            //event.getPlayer().setGameType(GameType.CREATIVE);
            //event.getWorld().spawnEntityInWorld(new EntityZombie(event.getWorld())); //Does Not Work
            //event.getWorld().spawnEntityInWorld(new EntityItem(event.getWorld(), pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.NETHER_STAR)));
        //}
    }

    @SubscribeEvent
    public void onPlayerPickupXP(PlayerPickupXpEvent event)
    {
        //event.getOrb().xpValue *= 2;
    }

}
