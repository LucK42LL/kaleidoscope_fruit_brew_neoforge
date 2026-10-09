package net.zhaiji.kaleidoscope_fruit_brew.register;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.fluids.BaseFlowingFluid.Flowing;
import net.neoforged.neoforge.fluids.BaseFlowingFluid.Properties;
import net.neoforged.neoforge.fluids.BaseFlowingFluid.Source;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries.Keys;
import net.zhaiji.kaleidoscope_fruit_brew.fluid.KFBFluidType;

public class KFBFluid {
   public static final DeferredRegister<FluidType> FLUID_TYPE = DeferredRegister.create(Keys.FLUID_TYPES, "kaleidoscope_fruit_brew");
   public static final DeferredRegister<Fluid> FLUID = DeferredRegister.create(BuiltInRegistries.FLUID, "kaleidoscope_fruit_brew");
   public static final DeferredHolder<FluidType, FluidType> BAYBERRY_JUICE_TYPE = registerFluidType("bayberry_juice");
   public static final DeferredHolder<Fluid, Fluid> BAYBERRY_JUICE = FLUID.register("bayberry_juice", () -> new Source(KFBFluid.BAYBERRY_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_BAYBERRY_JUICE = FLUID.register(
           "flowing_bayberry_juice", () -> new Flowing(KFBFluid.BAYBERRY_JUICE_PROPERTIES)
   );
   public static final Properties BAYBERRY_JUICE_PROPERTIES = new Properties(BAYBERRY_JUICE_TYPE, BAYBERRY_JUICE, FLOWING_BAYBERRY_JUICE)
           .bucket(KFBItem.BAYBERRY_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> BLUEBERRY_JUICE_TYPE = registerFluidType("blueberry_juice");
   public static final DeferredHolder<Fluid, Fluid> BLUEBERRY_JUICE = FLUID.register("blueberry_juice", () -> new Source(KFBFluid.BLUEBERRY_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_BLUEBERRY_JUICE = FLUID.register(
           "flowing_blueberry_juice", () -> new Flowing(KFBFluid.BLUEBERRY_JUICE_PROPERTIES)
   );
   public static final Properties BLUEBERRY_JUICE_PROPERTIES = new Properties(BLUEBERRY_JUICE_TYPE, BLUEBERRY_JUICE, FLOWING_BLUEBERRY_JUICE)
           .bucket(KFBItem.BLUEBERRY_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> CACTUS_JUICE_TYPE = registerFluidType("cactus_juice");
   public static final DeferredHolder<Fluid, Fluid> CACTUS_JUICE = FLUID.register("cactus_juice", () -> new Source(KFBFluid.CACTUS_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_CACTUS_JUICE = FLUID.register(
           "flowing_cactus_juice", () -> new Flowing(KFBFluid.CACTUS_JUICE_PROPERTIES)
   );
   public static final Properties CACTUS_JUICE_PROPERTIES = new Properties(CACTUS_JUICE_TYPE, CACTUS_JUICE, FLOWING_CACTUS_JUICE).bucket(KFBItem.CACTUS_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> CRANBERRY_JUICE_TYPE = registerFluidType("cranberry_juice");
   public static final DeferredHolder<Fluid, Fluid> CRANBERRY_JUICE = FLUID.register("cranberry_juice", () -> new Source(KFBFluid.CRANBERRY_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_CRANBERRY_JUICE = FLUID.register(
           "flowing_cranberry_juice", () -> new Flowing(KFBFluid.CRANBERRY_JUICE_PROPERTIES)
   );
   public static final Properties CRANBERRY_JUICE_PROPERTIES = new Properties(CRANBERRY_JUICE_TYPE, CRANBERRY_JUICE, FLOWING_CRANBERRY_JUICE)
           .bucket(KFBItem.CRANBERRY_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> DURIAN_JUICE_TYPE = registerFluidType("durian_juice");
   public static final DeferredHolder<Fluid, Fluid> DURIAN_JUICE = FLUID.register("durian_juice", () -> new Source(KFBFluid.DURIAN_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_DURIAN_JUICE = FLUID.register(
           "flowing_durian_juice", () -> new Flowing(KFBFluid.DURIAN_JUICE_PROPERTIES)
   );
   public static final Properties DURIAN_JUICE_PROPERTIES = new Properties(DURIAN_JUICE_TYPE, DURIAN_JUICE, FLOWING_DURIAN_JUICE).bucket(KFBItem.DURIAN_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> FIG_JUICE_TYPE = registerFluidType("fig_juice");
   public static final DeferredHolder<Fluid, Fluid> FIG_JUICE = FLUID.register("fig_juice", () -> new Source(KFBFluid.FIG_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_FIG_JUICE = FLUID.register("flowing_fig_juice", () -> new Flowing(KFBFluid.FIG_JUICE_PROPERTIES));
   public static final Properties FIG_JUICE_PROPERTIES = new Properties(FIG_JUICE_TYPE, FIG_JUICE, FLOWING_FIG_JUICE).bucket(KFBItem.FIG_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> HAMIMELON_JUICE_TYPE = registerFluidType("hamimelon_juice");
   public static final DeferredHolder<Fluid, Fluid> HAMIMELON_JUICE = FLUID.register("hamimelon_juice", () -> new Source(KFBFluid.HAMIMELON_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_HAMIMELON_JUICE = FLUID.register(
           "flowing_hamimelon_juice", () -> new Flowing(KFBFluid.HAMIMELON_JUICE_PROPERTIES)
   );
   public static final Properties HAMIMELON_JUICE_PROPERTIES = new Properties(HAMIMELON_JUICE_TYPE, HAMIMELON_JUICE, FLOWING_HAMIMELON_JUICE)
           .bucket(KFBItem.HAMIMELON_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> HAWBERRY_JUICE_TYPE = registerFluidType("hawberry_juice");
   public static final DeferredHolder<Fluid, Fluid> HAWBERRY_JUICE = FLUID.register("hawberry_juice", () -> new Source(KFBFluid.HAWBERRY_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_HAWBERRY_JUICE = FLUID.register(
           "flowing_hawberry_juice", () -> new Flowing(KFBFluid.HAWBERRY_JUICE_PROPERTIES)
   );
   public static final Properties HAWBERRY_JUICE_PROPERTIES = new Properties(HAWBERRY_JUICE_TYPE, HAWBERRY_JUICE, FLOWING_HAWBERRY_JUICE)
           .bucket(KFBItem.HAWBERRY_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> KIWI_JUICE_TYPE = registerFluidType("kiwi_juice");
   public static final DeferredHolder<Fluid, Fluid> KIWI_JUICE = FLUID.register("kiwi_juice", () -> new Source(KFBFluid.KIWI_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_KIWI_JUICE = FLUID.register("flowing_kiwi_juice", () -> new Flowing(KFBFluid.KIWI_JUICE_PROPERTIES));
   public static final Properties KIWI_JUICE_PROPERTIES = new Properties(KIWI_JUICE_TYPE, KIWI_JUICE, FLOWING_KIWI_JUICE).bucket(KFBItem.KIWI_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> LEMON_JUICE_TYPE = registerFluidType("lemon_juice");
   public static final DeferredHolder<Fluid, Fluid> LEMON_JUICE = FLUID.register("lemon_juice", () -> new Source(KFBFluid.LEMON_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_LEMON_JUICE = FLUID.register(
           "flowing_lemon_juice", () -> new Flowing(KFBFluid.LEMON_JUICE_PROPERTIES)
   );
   public static final Properties LEMON_JUICE_PROPERTIES = new Properties(LEMON_JUICE_TYPE, LEMON_JUICE, FLOWING_LEMON_JUICE).bucket(KFBItem.LEMON_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> LYCHEE_JUICE_TYPE = registerFluidType("lychee_juice");
   public static final DeferredHolder<Fluid, Fluid> LYCHEE_JUICE = FLUID.register("lychee_juice", () -> new Source(KFBFluid.LYCHEE_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_LYCHEE_JUICE = FLUID.register(
           "flowing_lychee_juice", () -> new Flowing(KFBFluid.LYCHEE_JUICE_PROPERTIES)
   );
   public static final Properties LYCHEE_JUICE_PROPERTIES = new Properties(LYCHEE_JUICE_TYPE, LYCHEE_JUICE, FLOWING_LYCHEE_JUICE).bucket(KFBItem.LYCHEE_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> MANGO_JUICE_TYPE = registerFluidType("mango_juice");
   public static final DeferredHolder<Fluid, Fluid> MANGO_JUICE = FLUID.register("mango_juice", () -> new Source(KFBFluid.MANGO_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_MANGO_JUICE = FLUID.register(
           "flowing_mango_juice", () -> new Flowing(KFBFluid.MANGO_JUICE_PROPERTIES)
   );
   public static final Properties MANGO_JUICE_PROPERTIES = new Properties(MANGO_JUICE_TYPE, MANGO_JUICE, FLOWING_MANGO_JUICE).bucket(KFBItem.MANGO_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> MANGOSTEEN_JUICE_TYPE = registerFluidType("mangosteen_juice");
   public static final DeferredHolder<Fluid, Fluid> MANGOSTEEN_JUICE = FLUID.register(
           "mangosteen_juice", () -> new Source(KFBFluid.MANGOSTEEN_JUICE_PROPERTIES)
   );
   public static final DeferredHolder<Fluid, Fluid> FLOWING_MANGOSTEEN_JUICE = FLUID.register(
           "flowing_mangosteen_juice", () -> new Flowing(KFBFluid.MANGOSTEEN_JUICE_PROPERTIES)
   );
   public static final Properties MANGOSTEEN_JUICE_PROPERTIES = new Properties(MANGOSTEEN_JUICE_TYPE, MANGOSTEEN_JUICE, FLOWING_MANGOSTEEN_JUICE)
           .bucket(KFBItem.MANGOSTEEN_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> ORANGE_JUICE_TYPE = registerFluidType("orange_juice");
   public static final DeferredHolder<Fluid, Fluid> ORANGE_JUICE = FLUID.register("orange_juice", () -> new Source(KFBFluid.ORANGE_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_ORANGE_JUICE = FLUID.register(
           "flowing_orange_juice", () -> new Flowing(KFBFluid.ORANGE_JUICE_PROPERTIES)
   );
   public static final Properties ORANGE_JUICE_PROPERTIES = new Properties(ORANGE_JUICE_TYPE, ORANGE_JUICE, FLOWING_ORANGE_JUICE).bucket(KFBItem.ORANGE_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> PEACH_JUICE_TYPE = registerFluidType("peach_juice");
   public static final DeferredHolder<Fluid, Fluid> PEACH_JUICE = FLUID.register("peach_juice", () -> new Source(KFBFluid.PEACH_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_PEACH_JUICE = FLUID.register(
           "flowing_peach_juice", () -> new Flowing(KFBFluid.PEACH_JUICE_PROPERTIES)
   );
   public static final Properties PEACH_JUICE_PROPERTIES = new Properties(PEACH_JUICE_TYPE, PEACH_JUICE, FLOWING_PEACH_JUICE).bucket(KFBItem.PEACH_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> PEAR_JUICE_TYPE = registerFluidType("pear_juice");
   public static final DeferredHolder<Fluid, Fluid> PEAR_JUICE = FLUID.register("pear_juice", () -> new Source(KFBFluid.PEAR_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_PEAR_JUICE = FLUID.register("flowing_pear_juice", () -> new Flowing(KFBFluid.PEAR_JUICE_PROPERTIES));
   public static final Properties PEAR_JUICE_PROPERTIES = new Properties(PEAR_JUICE_TYPE, PEAR_JUICE, FLOWING_PEAR_JUICE).bucket(KFBItem.PEAR_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> PERSIMMON_JUICE_TYPE = registerFluidType("persimmon_juice");
   public static final DeferredHolder<Fluid, Fluid> PERSIMMON_JUICE = FLUID.register("persimmon_juice", () -> new Source(KFBFluid.PERSIMMON_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_PERSIMMON_JUICE = FLUID.register(
           "flowing_persimmon_juice", () -> new Flowing(KFBFluid.PERSIMMON_JUICE_PROPERTIES)
   );
   public static final Properties PERSIMMON_JUICE_PROPERTIES = new Properties(PERSIMMON_JUICE_TYPE, PERSIMMON_JUICE, FLOWING_PERSIMMON_JUICE)
           .bucket(KFBItem.PERSIMMON_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> PINEAPPLE_JUICE_TYPE = registerFluidType("pineapple_juice");
   public static final DeferredHolder<Fluid, Fluid> PINEAPPLE_JUICE = FLUID.register("pineapple_juice", () -> new Source(KFBFluid.PINEAPPLE_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_PINEAPPLE_JUICE = FLUID.register(
           "flowing_pineapple_juice", () -> new Flowing(KFBFluid.PINEAPPLE_JUICE_PROPERTIES)
   );
   public static final Properties PINEAPPLE_JUICE_PROPERTIES = new Properties(PINEAPPLE_JUICE_TYPE, PINEAPPLE_JUICE, FLOWING_PINEAPPLE_JUICE)
           .bucket(KFBItem.PINEAPPLE_BUCKET);
   public static final DeferredHolder<FluidType, FluidType> APPLE_JUICE_TYPE = registerFluidType("apple_juice");
   public static final DeferredHolder<Fluid, Fluid> APPLE_JUICE = FLUID.register("apple_juice", () -> new Source(KFBFluid.APPLE_JUICE_PROPERTIES));
   public static final DeferredHolder<Fluid, Fluid> FLOWING_APPLE_JUICE = FLUID.register(
           "flowing_apple_juice", () -> new Flowing(KFBFluid.APPLE_JUICE_PROPERTIES)
   );
   public static final Properties APPLE_JUICE_PROPERTIES = new Properties(APPLE_JUICE_TYPE, APPLE_JUICE, FLOWING_APPLE_JUICE).bucket(KFBItem.APPLE_BUCKET);

   public static DeferredHolder<FluidType, FluidType> registerFluidType(String name) {
      return FLUID_TYPE.register(name, () -> new KFBFluidType(name));
   }
}
