package voronoiaoc.byg.common.biomes.biomes;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

public class TropicalFungalRainForest extends Biome {
    static final ConfiguredSurfaceBuilder SURFACE_BUILDER = new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG);
    static final Precipitation PRECIPATATION = Precipitation.RAIN;
    static final Category CATEGORY = Category.JUNGLE;
    static final double DEPTH = 0.2F;
    static final double SCALE = 0.25F;
    static final float TEMPERATURE = 0.95F;
    static final float DOWNFALL = 0.9F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;
    static final String PARENT = null;

    public TropicalFungalRainForest() {
        super(new Settings().surfaceBuilder(SURFACE_BUILDER).precipitation(PRECIPATATION).category(CATEGORY).depth((float) DEPTH).scale((float) SCALE).temperature(TEMPERATURE).downfall(DOWNFALL).parent(PARENT).effects((new BiomeEffects.Builder()).waterColor(WATER_COLOR).waterFogColor(WATER_FOG_COLOR).fogColor(12638463).moodSound(BiomeMoodSound.CAVE).build()));
        //this.addStructureFeature(Feature.JUNGLE_TEMPLE.configure(FeatureConfig.DEFAULT));
        //this.addStructureFeature(Feature.MINESHAFT.configure(new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL)));
        //this.addStructureFeature(Feature.STRONGHOLD.configure(FeatureConfig.DEFAULT));
//        DefaultBiomeFeatures.addLandCarvers(this);
//        //DefaultBiomeFeatures.addStructureFeatures(this);
//        DefaultBiomeFeatures.addDungeons(this);
//        DefaultBiomeFeatures.addMineables(this);
//        DefaultBiomeFeatures.addDefaultOres(this);
//        DefaultBiomeFeatures.addDefaultDisks(this);
//        DefaultBiomeFeatures.addExtraDefaultFlowers(this);
//        DefaultBiomeFeatures.addDefaultMushrooms(this);
//        DefaultBiomeFeatures.addDefaultVegetation(this);
//        DefaultBiomeFeatures.addSprings(this);
//        DefaultBiomeFeatures.addJungleVegetation(this);
//        DefaultBiomeFeatures.addFrozenTopLayer(this);
//       BYGTreeFeatures.addTropJungleTrees(this);
//        DefaultBiomeFeatures.addMushroomFieldsFeatures(this);
//        DefaultBiomeFeatures.addMushroomFieldsFeatures(this);
//        DefaultBiomeFeatures.addMushroomFieldsFeatures(this);
//        DefaultBiomeFeatures.addMushroomFieldsFeatures(this);
//        DefaultBiomeFeatures.addMushroomFieldsFeatures(this);
//        DefaultBiomeFeatures.addDefaultMushrooms(this);
//        DefaultBiomeFeatures.addDefaultMushrooms(this);
        //BYGFeatures.addTropFungalMushrooms(this);
//        //BYGFeatures.addivisPlants(this);
//        //BYGFeatures.addWeedGrass(this);
//        //BYGFeatures.addBYGTropicFlowers(this);
//        //BYGFeatures.addBYGMushrooms(this);
//        //BYGFeatures.addBYGMushrooms(this);
//        //BYGFeatures.addBYGMushrooms(this);


        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.PIG, 10, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.COW, 8, 4, 4));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.PARROT, 40, 1, 2));
        this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(SpawnGroup.AMBIENT, new SpawnEntry(EntityType.BAT, 10, 8, 8));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SPIDER, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ZOMBIE, 95, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SKELETON, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.CREEPER, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SLIME, 100, 4, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.WITCH, 5, 1, 1));
        this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.OCELOT, 2, 1, 1));

    }
}

