package net.origin.palerealm.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.origin.palerealm.PaleRealm;
import net.origin.palerealm.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PaleRealm.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.PALE_INGOT.get());
        basicItem(ModItems.CORRUPTED_PALE_INGOT.get());
        basicItem(ModItems.RAW_COBALT.get());
        basicItem(ModItems.COBALT_INGOT.get());
        basicItem(ModItems.CORRUPTED_COBALT_INGOT.get());
        basicItem(ModItems.KOHLRABI.get());
        basicItem(ModItems.STEAMED_KOHLRABI.get());
    }
}
