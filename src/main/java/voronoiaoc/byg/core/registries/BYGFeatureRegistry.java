package voronoiaoc.byg.core.registries;

import net.minecraft.world.biome.provider.BiomeProviderType;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import voronoiaoc.byg.BYG;
import voronoiaoc.byg.common.world.dimension.end.EndDimensionHook;
import voronoiaoc.byg.core.byglists.BYGFeatureList;
import voronoiaoc.byg.core.byglists.BYGStructureList;

@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGFeatureRegistry {

    @SubscribeEvent
    public static void bygRegisterFeatures(RegistryEvent.Register<Feature<?>> event) {
        BYG.LOGGER.debug("BYG: Registering Features...");
        event.getRegistry().registerAll(
                //All BYG Tree Features use 1.14.4 Tree Mappings. See: `common/world/feature/tree/util`
                BYGFeatureList.BLUESPRUCE_TREE.setRegistryName("bluespruce_tree"),
                BYGFeatureList.BLUEGIANTSPUCE_TREE.setRegistryName("bluegiantspruce_tree"),
                BYGFeatureList.BOREAL_TREE.setRegistryName("boreal_tree"),
                BYGFeatureList.BOREAL_TREE2.setRegistryName("boreal_tree2"),
                BYGFeatureList.BIRCH_BROWN_TREE1.setRegistryName("brownbirch_tree"),
                BYGFeatureList.OAK_BROWN_TREE1.setRegistryName("brownoak_tree"),
                BYGFeatureList.DECIDUOUS_TREE.setRegistryName("deciduous_tree"),
                BYGFeatureList.GIANTORANGESPRUCE_TREE.setRegistryName("giantorangespruce_tree"),
                BYGFeatureList.GIANTREDSPRUCE_TREE.setRegistryName("giantredspruce_tree"),
                BYGFeatureList.GIANTYELLOWSPRUCE_TREE.setRegistryName("giantyellowspruce_tree"),
                BYGFeatureList.CYPRESS_TREE1.setRegistryName("hugecypress_tree"),
                BYGFeatureList.INDIGOJACARANDA_TREE.setRegistryName("jacaranda_tree"),
                BYGFeatureList.BIRCH_ORANGE_TREE1.setRegistryName("orangebirch_tree"),
                BYGFeatureList.DECIDUOUS_ORANGE_TREE.setRegistryName("orangedeciduous_tree"),
                BYGFeatureList.OAK_ORANGE_TREE1.setRegistryName("orangeoak_tree"),
                BYGFeatureList.ORANGESPRUCE_TREE.setRegistryName("orangespruce_tree"),
                BYGFeatureList.BIRCH_RED_TREE1.setRegistryName("redbirch_tree"),
                BYGFeatureList.DECIDUOUS_RED_TREE.setRegistryName("reddeciduous_tree"),
                BYGFeatureList.OAK_RED_TREE1.setRegistryName("redoak_tree"),
                BYGFeatureList.REDSPRUCE_TREE.setRegistryName("redspruce_tree"),
                BYGFeatureList.DECIDUOUS_SEASONAL_SHRUBS.setRegistryName("seasonal_shrubs"),
                BYGFeatureList.TROPICAL_SHORT_TREE1.setRegistryName("shorttropicalrainforest_tree"),
                BYGFeatureList.SHRUB.setRegistryName("shrub"),
                BYGFeatureList.SMALLBLUESPRUCE_TREE.setRegistryName("smallbluespruce_tree"),
                BYGFeatureList.SMALLORANGESPRUCE_TREE.setRegistryName("smallorangespruce_tree"),
                BYGFeatureList.SMALLREDSPRUCE_TREE.setRegistryName("smallredspruce_tree"),
                BYGFeatureList.SMALLYELLOWSPRUCE_TREE.setRegistryName("smallyellowspruce_tree"),
                BYGFeatureList.TALLBLUESPRUCE_TREE.setRegistryName("tallbluespruce_tree"),
                BYGFeatureList.TALLORANGESPRUCE_TREE.setRegistryName("tallorangespruce_tree"),
                BYGFeatureList.TALLREDSPRUCE_TREE.setRegistryName("tallredspruce_tree"),
                BYGFeatureList.TALLYELLOWSPRUCE_TREE.setRegistryName("tallyellowspruce_tree"),
                BYGFeatureList.TROPICAL_TREE1.setRegistryName("tropicalrainforest_tree"),
                BYGFeatureList.CONIFER_TREE8.setRegistryName("wideconiferous_tree"),
                BYGFeatureList.BIRCH_YELLOW_TREE1.setRegistryName("yellowbirch_tree"),
                BYGFeatureList.DECIDUOUS_YELLOW_TREE.setRegistryName("yellowdeciduous_tree"),
                BYGFeatureList.YELLOWSPRUCE_TREE.setRegistryName("yellowspruce_tree"),
                BYGFeatureList.BYGVILLAGE.setRegistryName("village"),
                BYGStructureList.RED_DESERT_PYRAMID.setRegistryName("red_desert_temple"),
                BYGFeatureList.SKYRISFORTRESS.setRegistryName("skyris_fortress")
        );
        BYGStructureList.structurePieces();

        BYG.LOGGER.info("BYG: Features Registered!");

    }

    @SubscribeEvent
    public static void bygRegisterBiomeProviderTypes(RegistryEvent.Register<BiomeProviderType<?, ?>> event) {
        event.getRegistry().registerAll(
                EndDimensionHook.BYG_END.setRegistryName("end_byg")
        );
    }
}