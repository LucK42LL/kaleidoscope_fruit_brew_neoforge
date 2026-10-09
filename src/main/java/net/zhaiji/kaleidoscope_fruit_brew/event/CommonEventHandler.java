package net.zhaiji.kaleidoscope_fruit_brew.event;

import com.github.ysbbbbbb.kaleidoscopetavern.item.JuiceBucketItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBBlock;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBItem;

public class CommonEventHandler {

    // Corrige o crash ao colocar a bebida no chão
    public static void addDrinkBlocks(BlockEntityTypeAddBlocksEvent event) {
        var drinkBE = BuiltInRegistries.BLOCK_ENTITY_TYPE.get(
                ResourceLocation.fromNamespaceAndPath("kaleidoscope_tavern", "drink"));

        if (drinkBE == null) return;

        KFBBlock.BLOCK.getEntries().forEach(holder -> event.modify(drinkBE, holder.get()));
    }

    // Faz os baldes de suco serem reconhecidos como recipientes de fluido
    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        KFBItem.ITEM.getEntries().forEach(holder -> {
            if (holder.get() instanceof JuiceBucketItem bucket) {
                event.registerItem(Capabilities.FluidHandler.ITEM,
                        (stack, ctx) -> new FluidBucketWrapper(stack), bucket);
            }
        });
    }
}