package net.origin.palerealm.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.origin.palerealm.PaleRealm;
import net.origin.palerealm.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PaleRealm.MOD_ID);

    public static final Supplier<CreativeModeTab> PALE_REALM_TAB = CREATIVE_MODE_TAB.register("pale_realm_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CORRUPTED_PALE_INGOT.get()))
                    .title(Component.translatable("creativetab.palerealm.pale_realm_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PALE_INGOT);
                        output.accept(ModItems.CORRUPTED_PALE_INGOT);
                        output.accept(ModItems.COBALT_INGOT);
                        output.accept(ModItems.CORRUPTED_COBALT_INGOT);
                        output.accept(ModItems.RAW_COBALT);
                        output.accept(ModItems.KOHLRABI);
                        output.accept(ModItems.STEAMED_KOHLRABI);

                        output.accept(ModBlocks.COBALT_BLOCK);
                        output.accept(ModBlocks.RAW_COBALT_BLOCK);
                        output.accept(ModBlocks.COBALT_ORE);
                        output.accept(ModBlocks.DEEPSLATE_COBALT_ORE);
                        output.accept(ModBlocks.RESIN_ORE);
                    }).build());

    public static void regiser(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }


}
