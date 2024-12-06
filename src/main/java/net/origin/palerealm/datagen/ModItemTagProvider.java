package net.origin.palerealm.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.origin.palerealm.PaleRealm;
import net.origin.palerealm.item.ModItems;
import net.origin.palerealm.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, PaleRealm.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.PALE_INGOT)
                .add(ModItems.PALE_INGOT.get())
                .add(ModItems.CORRUPTED_PALE_INGOT.get());
        tag(ModTags.Items.COBALT_INGOT)
                .add(ModItems.COBALT_INGOT.get())
                .add(ModItems.CORRUPTED_COBALT_INGOT.get());
    }
}
