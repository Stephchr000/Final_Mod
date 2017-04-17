package stephchr000.trackmod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import stephchr000.trackmod.stephchr000.trackmod.proxy.CommonProxy;
import stephchr000.trackmod.stephchr000.trackmod.stephchr000.trackmod.init.ModItems;

@Mod(modid = Reference.MOD_ID, name= Reference.NAME,version = Reference.VERSION,acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class TrackMod {
@Mod.Instance
    public static TrackMod instance;

@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
public static CommonProxy proxy;

@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
System.out.println("PreInit");
    ModItems.init();
    ModItems.register();


}

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Init");
        proxy.init();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("PostInit");
    }


}
