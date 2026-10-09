package net.zhaiji.kaleidoscope_fruit_brew.register;

import com.github.ysbbbbbb.kaleidoscopetavern.block.brew.DrinkBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;

public class KFBBlock {
   public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(BuiltInRegistries.BLOCK, "kaleidoscope_fruit_brew");
   public static final DeferredHolder<Block, Block> BAYBERRY_WINE = BLOCK.register("bayberry_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3, 12)).build());
   public static final DeferredHolder<Block, Block> BLUEBERRY_WINE = BLOCK.register("blueberry_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(2, 16)).build());
   public static final DeferredHolder<Block, Block> CRANBERRY_WINE = BLOCK.register("cranberry_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3, 14)).build());
   public static final DeferredHolder<Block, Block> DURIAN_WINE = BLOCK.register("durian_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3, 11)).build());
   public static final DeferredHolder<Block, Block> FIG_WINE = BLOCK.register("fig_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3, 11)).build());
   public static final DeferredHolder<Block, Block> GLOWBERRY_WINE = BLOCK.register("glowberry_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3, 11)).build());
   public static final DeferredHolder<Block, Block> HAMIMELON_WINE = BLOCK.register("hamimelon_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(2, 14)).build());
   public static final DeferredHolder<Block, Block> HAWBERRY_WINE = BLOCK.register("hawberry_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3, 13)).build());
   public static final DeferredHolder<Block, Block> KIWI_WINE = BLOCK.register("kiwi_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3, 11)).build());
   public static final DeferredHolder<Block, Block> LEMON_WINE = BLOCK.register("lemon_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(2, 11)).build());
   public static final DeferredHolder<Block, Block> LYCHEE_WINE = BLOCK.register("lychee_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3, 15)).build());
   public static final DeferredHolder<Block, Block> MANGO_WINE = BLOCK.register("mango_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3, 14)).build());
   public static final DeferredHolder<Block, Block> MANGOSTEEN_WINE = BLOCK.register(
      "mangosteen_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(2, 15)).build()
   );
   public static final DeferredHolder<Block, Block> ORANGE_WINE = BLOCK.register("orange_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3, 14)).build());
   public static final DeferredHolder<Block, Block> PEACH_WINE = BLOCK.register("peach_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3, 14)).build());
   public static final DeferredHolder<Block, Block> PEAR_WINE = BLOCK.register("pear_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3, 14)).build());
   public static final DeferredHolder<Block, Block> PERSIMMON_WINE = BLOCK.register("persimmon_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(2, 15)).build());
   public static final DeferredHolder<Block, Block> PINEAPPLE_WINE = BLOCK.register("pineapple_wine", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(2, 14)).build());
   public static final DeferredHolder<Block, Block> TEQUILA = BLOCK.register("tequila", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3, 16)).build());
   public static final DeferredHolder<Block, Block> APPLE_CIDER = BLOCK.register("apple_cider", DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(2, 16)).build());

   private static VoxelShape[] SHAPE_GEN(int size, int height) {
      return new VoxelShape[]{
         Block.box(8 - size, 0.0, 8 - size, 8 + size, height, 8 + size),
         Block.box(8 - size - 4, 0.0, 8 - size, 8 + size + 4, height, 8 + size),
         Shapes.or(
            Block.box(8 - size - 4, 0.0, 9.0, 8 + size + 4, height, 8 + size + 4),
            Block.box(8 - size, 0.0, 8 - size - 4, 8 + size, height, 8 + size + 4)
         ),
         Block.box(8 - size - 4, 0.0, 8 - size - 4, 8 + size + 4, height, 8 + size + 4)
      };
   }
}
