package net.origin.palerealm.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.origin.palerealm.block.ModBlocks;
import net.origin.palerealm.item.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.COBALT_BLOCK.get());
        dropSelf(ModBlocks.RAW_COBALT_BLOCK.get());

        add(ModBlocks.RESIN_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RESIN_ORE.get(), Items.BAMBOO_MOSAIC.asItem(), 1, 3));
        add(ModBlocks.COBALT_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.COBALT_ORE.get(), ModItems.RAW_COBALT.get(), 1, 3));
        add(ModBlocks.DEEPSLATE_COBALT_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_COBALT_ORE.get(), ModItems.RAW_COBALT.get(), 1, 3));
        //Temp Drop
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
