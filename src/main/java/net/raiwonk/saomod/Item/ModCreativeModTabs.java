package net.raiwonk.saomod.Item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.raiwonk.saomod.SAOMod;


public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SAOMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RAIWONK_TAB = CREATIVE_MODE_TABS.register("raiwonk_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get())).title(Component.translatable("creativetab.raiwonk_tab"))
                    .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(ModItems.SAPPHIRE.get());
                            pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                            pOutput.accept(ModItems.BLUE_ROSE_SWORD.get());
                            pOutput.accept(ModItems.BLUE_ROSE_CRYSTAL.get());
                            pOutput.accept(ModItems.NIGHT_SKY_CRYSTAL.get());
                            pOutput.accept(ModItems.NIGHT_SKY_SWORD.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
