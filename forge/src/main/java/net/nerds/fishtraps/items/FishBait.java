package net.nerds.fishtraps.items;

import net.minecraft.item.Item;
import net.nerds.fishtraps.FishTrapsManager;
import net.nerds.fishtraps.Fishtraps;

public class FishBait extends Item {
    public FishBait() {
        super(new Item.Properties().defaultMaxDamage(400).group(FishTrapsManager.fishTrapItemGroup));
        this.setRegistryName(Fishtraps.MODID, "fish_trap_bait");
    }
}
