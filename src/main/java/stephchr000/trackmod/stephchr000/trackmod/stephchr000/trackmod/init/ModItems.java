package stephchr000.trackmod.stephchr000.trackmod.stephchr000.trackmod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import stephchr000.trackmod.Reference;
import stephchr000.trackmod.stephchr000.trackmod.items.ItemCheese;

/**
 * Created by stephchr000 on 4/17/2017.
 */
public class ModItems {

    public static Item cheese;

    public static void init(){
cheese = new ItemCheese();
    }
    public static void register(){
        GameRegistry.register(cheese);
    }
    public static void registerRenders(){
registerRender(cheese);
    }
    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,new ModelResourceLocation(Reference.MOD_ID+":"+item.getUnlocalizedName().substring(5),"inventory"));
    }
}
