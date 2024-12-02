package net.raiwonk.saomod.Item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.raiwonk.saomod.SAOMod;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SAOMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLUE_ROSE_CRYSTAL = ITEMS.register("blue_rose_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NIGHT_SKY_CRYSTAL = ITEMS.register("night_sky_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLUE_ROSE_SWORD = ITEMS.register("blue_rose_sword",
            () -> new SwordItem(ModTiers.BLUE_ROSE, 5, -2.0F, new Item.Properties()));

    public static final RegistryObject<Item> NIGHT_SKY_SWORD = ITEMS.register("night_sky_sword",
            () -> new SwordItem(ModTiers.NIGHT_SKY, 8, -2.0F, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}