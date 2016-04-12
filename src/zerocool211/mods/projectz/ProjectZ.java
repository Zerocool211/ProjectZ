package zerocool211.mods.projectz;

import zerocool211.mods.projectz.items.CoalFragment;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "projectz", name = "ProjectZ", version = "1.0")
public class ProjectZ {

	public static Item coalFragment;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
	    //Item/Block init and registering
    	//Config handling
    	
    	coalFragment = new CoalFragment().setUnlocalizedName("coalfragment").setTextureName("projectz:coalfragment");
    	GameRegistry.registerItem(coalFragment, coalFragment.getUnlocalizedName().substring(5));
    	
    }

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
	    //Proxy, TileEntity, entity, Gui and Packet Register
		
		GameRegistry.addShapelessRecipe(new ItemStack(coalFragment, 8), new Object[]{Items.coal});
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
