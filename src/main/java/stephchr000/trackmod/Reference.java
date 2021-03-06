package stephchr000.trackmod;

/**
 * Created by stephchr000 on 4/13/2017.
 */
public class Reference {
    public static final String MOD_ID = "trackmod";
    public static final String NAME = "Track Mod";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_VERSIONS = "[1.11.2]";

    public static final String CLIENT_PROXY_CLASS = "stephchr000.trackmod.stephchr000.trackmod.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "stephchr000.trackmod..stephchr000.trackmod.proxy.ServerProxy";

    public static enum ModItems{
        CHEESE("cheese", "ItemCheese");
        private String unlocalizedName;
        private String registryName;
        ModItems(String unlocalizedName, String registryName){
this.unlocalizedName = unlocalizedName;
this.registryName = registryName;
        }

        public String getUnlocalizedName(){
            return unlocalizedName;
        }
        public String getRegistryName(){
            return registryName;
        }
    }

}
