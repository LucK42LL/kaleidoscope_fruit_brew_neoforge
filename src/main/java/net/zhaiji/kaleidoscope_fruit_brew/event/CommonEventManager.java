package net.zhaiji.kaleidoscope_fruit_brew.event;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.loading.FMLEnvironment;

public class CommonEventManager {
   public static void init(IEventBus modBus, IEventBus forgeBus) {
      modBusListener(modBus);
      forgeBusListener(forgeBus);
   }

   public static void modBusListener(IEventBus modBus) {
      modBus.addListener(CommonEventHandler::addDrinkBlocks);
      modBus.addListener(CommonEventHandler::registerCapabilities);
      if (FMLEnvironment.dist == Dist.CLIENT) {
         modBus.addListener(ClientEventHandler::registerFluidExtensions);
      }
   }

   public static void forgeBusListener(IEventBus forgeBus) {
   }
}
