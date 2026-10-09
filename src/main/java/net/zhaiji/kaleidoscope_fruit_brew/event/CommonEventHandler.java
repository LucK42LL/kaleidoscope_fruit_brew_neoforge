package net.zhaiji.kaleidoscope_fruit_brew.event;

import com.github.ysbbbbbb.kaleidoscopetavern.item.JuiceBucketItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities.FluidHandler;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBBlock;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBItem;

public class CommonEventHandler {
    public static void addDrinkBlocks(BlockEntityTypeAddBlocksEvent event) {
        BlockEntityType<?> drinkBE = (BlockEntityType<?>)BuiltInRegistries.BLOCK_ENTITY_TYPE
                .get(ResourceLocation.fromNamespaceAndPath("kaleidoscope_tavern", "drink"));
        if (drinkBE != null) {
            KFBBlock.BLOCK.getEntries().forEach(holder -> event.modify(drinkBE, new Block[]{(Block)holder.get()}));
        }
    }

    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        KFBItem.ITEM.getEntries().forEach(holder -> {
            if (holder.get() instanceof JuiceBucketItem bucket) {
                event.registerItem(FluidHandler.ITEM, (stack, ctx) -> new FluidBucketWrapper(stack), new ItemLike[]{bucket});
            }
        });
    }
}
