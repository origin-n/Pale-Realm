package net.origin.palerealm.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.origin.palerealm.PaleRealm;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(PaleRealm.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> PALE_INGOT = createTag("pale_ingot");
        public static final TagKey<Item> COBALT_INGOT = createTag("cobalt_ingot");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(PaleRealm.MOD_ID, name));
        }
    }
}
