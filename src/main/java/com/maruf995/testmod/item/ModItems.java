package com.maruf995.testmod.item;

import com.maruf995.testmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);

    public static final RegistryObject<Item> EXT_LUCEDIUM = ITEMS.register("extinguished_lucedium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FAC_LUCEDIUM = ITEMS.register("faceted_lucedium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEF_RING = ITEMS.register("def_ring",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POSOH = ITEMS.register("posoh",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RING = ITEMS.register("ring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STIK = ITEMS.register("stik",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
