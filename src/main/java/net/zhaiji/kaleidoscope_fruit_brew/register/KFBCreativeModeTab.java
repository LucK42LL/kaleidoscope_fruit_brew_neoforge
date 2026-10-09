package net.zhaiji.kaleidoscope_fruit_brew.register;

import com.github.ysbbbbbb.kaleidoscopetavern.item.BottleBlockItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KFBCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "kaleidoscope_fruit_brew");
    public static final String TAB_TRANSLATABLE = "itemGroup.kaleidoscope_fruit_brew.tab";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> KALEIDOSCOPE_FRUIT_BREW_TAB = CREATIVE_MODE_TAB.register(
            "kaleidoscope_fruit_brew_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> ((Item)KFBItem.BAYBERRY_WINE.get()).getDefaultInstance())
                    .title(Component.translatable("itemGroup.kaleidoscope_fruit_brew.tab"))
                    .displayItems((parameters, output) -> KFBItem.ITEM.getEntries().forEach(holder -> {
                        if (holder.get() instanceof BottleBlockItem) {
                            DeferredItem<Item> deferred = (DeferredItem<Item>)holder;
                            output.accept(BottleBlockItem.getMaxLevelDrink(deferred));
                        } else {
                            output.accept((ItemLike)holder.get());
                        }
                    }))
                    .build()
    );
}
