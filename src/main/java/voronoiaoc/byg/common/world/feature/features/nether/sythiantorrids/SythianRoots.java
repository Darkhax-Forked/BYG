package voronoiaoc.byg.common.world.feature.features.nether.sythiantorrids;

import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.function.Function;

public class SythianRoots extends Feature<NoFeatureConfig> {
    public SythianRoots(Function<Dynamic<?>, ? extends NoFeatureConfig> config) {
        super(config);
    }

    public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        if (!worldIn.isAirBlock(pos) || worldIn.getBlockState(pos.down()).getBlock() != BYGBlockList.SYTHIAN_NYLIUM) {
            return false;
        } else {
            worldIn.setBlockState(pos, BYGBlockList.SYTHIAN_ROOTS.getDefaultState(), 10);
            return true;
        }
    }
}