package com.NateDubs.DubMod.item;

import com.NateDubs.DubMod.DubMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DubMod.MOD_ID);


    // Note: keep name in ITEMS.register( ___, ...) lowercase otherwise mod will crash
    public static final RegistryObject<Item> DUBIUM = ITEMS.register("dubium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_DUBIUM = ITEMS.register("raw_dubium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANFACE = ITEMS.register("manface",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
