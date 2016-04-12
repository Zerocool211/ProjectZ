package zerocool211.mods.projectz.common;

import zerocool211.mods.projectz.ProjectZ;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {

	@Override
    public int getBurnTime(ItemStack fuel) {
    Block blockFuel = Block.getBlockFromItem(fuel.getItem());
    Item itemFuel = fuel.getItem();

	if (itemFuel == ProjectZ.coalFragment)
	{
	    return 200; 
	    }else{
	    return 0;
	}
    }
}
