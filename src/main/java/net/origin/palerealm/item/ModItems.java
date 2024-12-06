package net.origin.palerealm.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.origin.palerealm.PaleRealm;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PaleRealm.MOD_ID);

    public static final DeferredItem<Item> PALE_INGOT = ITEMS.register("pale_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORRUPTED_PALE_INGOT = ITEMS.register("corrupted_pale_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORRUPTED_COBALT_INGOT = ITEMS.register("corrupted_cobalt_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> KOHLRABI = ITEMS.register("kohlrabi",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI)));
    public static final DeferredItem<Item> STEAMED_KOHLRABI = ITEMS.register("steamed_kohlrabi",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STEAMED_KOHLRABI)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
