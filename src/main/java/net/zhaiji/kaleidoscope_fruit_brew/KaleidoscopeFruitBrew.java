package net.zhaiji.kaleidoscope_fruit_brew;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.zhaiji.kaleidoscope_fruit_brew.event.CommonEventManager;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBBlock;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBCreativeModeTab;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBFluid;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBItem;
import org.slf4j.Logger;

@Mod("kaleidoscope_fruit_brew")
public class KaleidoscopeFruitBrew {
   public static final String MOD_ID = "kaleidoscope_fruit_brew";
   public static final Logger LOGGER = LogUtils.getLogger();

   public KaleidoscopeFruitBrew(IEventBus modBus) {
      IEventBus neoForgeBus = NeoForge.EVENT_BUS;
      KFBFluid.FLUID_TYPE.register(modBus);
      KFBFluid.FLUID.register(modBus);
      KFBBlock.BLOCK.register(modBus);
      KFBItem.ITEM.register(modBus);
      KFBCreativeModeTab.CREATIVE_MODE_TAB.register(modBus);
      CommonEventManager.init(modBus, neoForgeBus);
   }

   public static ResourceLocation of(String path) {
      return ResourceLocation.fromNamespaceAndPath("kaleidoscope_fruit_brew", path);
   }
}
