package voronoiaoc.byg.common.world.feature.placements;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.decorator.CountDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DeadSeaSpikePlacer extends Decorator<CountDecoratorConfig> {
    public static final Decorator<CountDecoratorConfig> DEADSEASPIKE = new DeadSeaSpikePlacer(CountDecoratorConfig.field_24985);

    public DeadSeaSpikePlacer(Codec<CountDecoratorConfig> config) {
        super(config);
    }

    public Stream<BlockPos> getPositions(WorldAccess world, ChunkGenerator generator, Random random, CountDecoratorConfig config, BlockPos pos) {
        int i = random.nextInt(config.count);
        return IntStream.range(0, i).mapToObj((idx) -> {
            int j = random.nextInt(16) + pos.getX();
            int k = random.nextInt(16) + pos.getZ();
            int l = world.getTopY(Heightmap.Type.OCEAN_FLOOR_WG, j, k);
            return new BlockPos(j, l, k);
        });
    }
}