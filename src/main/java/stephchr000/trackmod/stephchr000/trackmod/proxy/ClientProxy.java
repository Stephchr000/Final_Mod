package stephchr000.trackmod.stephchr000.trackmod.proxy;

import stephchr000.trackmod.stephchr000.trackmod.stephchr000.trackmod.init.ModItems;

/**
 * Created by stephchr000 on 4/13/2017.
 */
public class ClientProxy implements CommonProxy {
    @Override
    public void init(){
        ModItems.registerRenders();
    }
}
