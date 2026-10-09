package net.zhaiji.kaleidoscope_fruit_brew.fluid;

import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.fluids.FluidType.Properties;
import net.zhaiji.kaleidoscope_fruit_brew.KaleidoscopeFruitBrew;

public class KFBFluidType extends FluidType {
   private final ResourceLocation stillTexture;
   private final ResourceLocation flowingTexture;

   public KFBFluidType(String id) {
      super(
              Properties.create()
                      .descriptionId(Util.makeDescriptionId("block", KaleidoscopeFruitBrew.of(id)))
                      .fallDistanceModifier(0.0F)
                      .canExtinguish(true)
                      .canConvertToSource(false)
                      .supportsBoating(true)
                      .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                      .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
                      .canHydrate(true)
      );
      this.stillTexture = KaleidoscopeFruitBrew.of("block/juice/" + id + "_still");
      this.flowingTexture = KaleidoscopeFruitBrew.of("block/juice/" + id + "_flow");
   }

   public ResourceLocation getStillTexture() {
      return this.stillTexture;
   }

   public ResourceLocation getFlowingTexture() {
      return this.flowingTexture;
   }
}
