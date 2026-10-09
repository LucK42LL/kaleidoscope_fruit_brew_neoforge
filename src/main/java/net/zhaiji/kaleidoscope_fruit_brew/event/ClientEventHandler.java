package net.zhaiji.kaleidoscope_fruit_brew.event;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.fluids.FluidType;
import net.zhaiji.kaleidoscope_fruit_brew.fluid.KFBFluidType;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBFluid;

public class ClientEventHandler {
    public static void registerFluidExtensions(RegisterClientExtensionsEvent event) {
        KFBFluid.FLUID_TYPE.getEntries().forEach(holder -> {
            if (holder.get() instanceof KFBFluidType type) {
                event.registerFluidType(new IClientFluidTypeExtensions() {
                    public ResourceLocation getStillTexture() {
                        return type.getStillTexture();
                    }

                    public ResourceLocation getFlowingTexture() {
                        return type.getFlowingTexture();
                    }
                }, new FluidType[]{type});
            }
        });
    }
}
