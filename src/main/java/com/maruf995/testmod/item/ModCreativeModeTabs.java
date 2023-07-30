package com.maruf995.testmod.item;

import com.maruf995.testmod.TutorialMod;
import com.maruf995.testmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MODID);


    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FAC_LUCEDIUM.get()))
            .title(Component.translatable("creative.tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.FAC_LUCEDIUM.get());
                pOutput.accept(ModItems.EXT_LUCEDIUM.get());
                pOutput.accept(ModItems.DEF_RING.get());
                pOutput.accept(ModItems.POSOH.get());
                pOutput.accept(ModItems.RING.get());
                pOutput.accept(ModItems.STIK.get());

                pOutput.accept(ModBlocks.LUCEDIUM_ORE.get());
            })
            .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}