package betamindy.type;

import arc.func.*;
import betamindy.*;
import betamindy.world.blocks.storage.*;
import mindustry.type.*;

public class ShopItem {
    public String name;
    public int cost = 10;

    /** 0 = package, 1 = runnable*/
    public int type = 0;

    public Cons<Shop.ShopBuild> purchased;
    public ItemStack[] packageItems;

    public Boolf<Shop.ShopBuild> unlocked = e -> true;

    public ShopItem(String name, int cost){
        this.name = name;
        this.cost = cost;

        BetaMindy.shopItems.put(name, this);
    }
}
