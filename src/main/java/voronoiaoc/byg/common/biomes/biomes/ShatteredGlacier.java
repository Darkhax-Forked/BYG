package voronoiaoc.byg.common.biomes.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import voronoiaoc.byg.common.world.feature.biomefeatures.BYGFeatures;
import voronoiaoc.byg.core.byglists.BYGFeatureList;
import voronoiaoc.byg.core.byglists.BYGSBList;

public class ShatteredGlacier extends Biome {
    static final ConfiguredSurfaceBuilder SURFACE_BUILDER = new ConfiguredSurfaceBuilder<>(BYGSBList.SHATTEREDGLACIER_SB2, new SurfaceBuilderConfig(Blocks.SNOW_BLOCK.getDefaultState(), Blocks.SNOW_BLOCK.getDefaultState(), Blocks.SNOW_BLOCK.getDefaultState()));
    static final RainType PRECIPATATION = RainType.SNOW;
    static final Category CATEGORY = Category.ICY;
    static final double DEPTH = 0.1F;
    static final double SCALE = 0.36F;
    static final float TEMPERATURE = -0.5F;
    static final float DOWNFALL = 0.9F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;
    static final String PARENT = null;

    public ShatteredGlacier() {
        super(new Builder().surfaceBuilder(SURFACE_BUILDER).precipitation(PRECIPATATION).category(CATEGORY).depth((float) DEPTH).waterColor(WATER_COLOR).scale((float) SCALE).temperature(TEMPERATURE).downfall(DOWNFALL).waterFogColor(WATER_FOG_COLOR).parent(PARENT));
        this.addStructure(Feature.IGLOO.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
        this.addStructure(Feature.MINESHAFT.withConfiguration(new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL)));
        this.addStructure(Feature.STRONGHOLD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
        this.addStructure(Feature.PILLAGER_OUTPOST.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
        DefaultBiomeFeatures.addCarvers(this);
        DefaultBiomeFeatures.addStructures(this);
        DefaultBiomeFeatures.addMonsterRooms(this);
        DefaultBiomeFeatures.addTaigaLargeFerns(this);
        DefaultBiomeFeatures.addStoneVariants(this);
        DefaultBiomeFeatures.addOres(this);
        DefaultBiomeFeatures.addSedimentDisks(this);
        DefaultBiomeFeatures.addDefaultFlowers(this);
        DefaultBiomeFeatures.addTaigaGrassAndMushrooms(this);
        DefaultBiomeFeatures.addMushrooms(this);
        DefaultBiomeFeatures.addReedsAndPumpkins(this);
        BYGFeatures.addWinterGrass(this);
        BYGFeatures.addWinterRose(this);
        BYGFeatures.addFrostMagmaLakes(this);
        this.addFeature(GenerationStage.Decoration.TOP_LAYER_MODIFICATION, BYGFeatureList.BLACKICESNOW.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));

        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.RABBIT, 10, 2, 3));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.POLAR_BEAR, 1, 1, 2));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SNOW_GOLEM, 1, 1, 2));
        this.addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.BAT, 10, 8, 8));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SPIDER, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE, 95, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.CREEPER, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SLIME, 100, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ENDERMAN, 10, 1, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.WITCH, 5, 1, 1));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SKELETON, 20, 4, 4));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.STRAY, 80, 4, 4));

    }

    @Override
    public Biome getRiver() {
        return this;
    }
}
