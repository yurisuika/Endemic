package dev.yurisuika.endemic.api;

import dev.yurisuika.endemic.registry.SaplingRegistry;
import dev.yurisuika.endemic.world.level.Group;
import dev.yurisuika.endemic.world.level.block.grower.WeightedTreeGrower;
import net.minecraft.resources.ResourceLocation;

public class EndemicApi {

    /**
     * <p>Registers a sapling config for the user to configure.
     *
     * <p>A default sapling configuration JSON is written under the respective namespace directory and path filename.
     *
     * @param name the registered block's {@link ResourceLocation} that will use the {@link WeightedTreeGrower} in place
     * of the vanilla grower
     * @param groups a {@link Group} array that the block may use for the grower
     */
    public static void register(ResourceLocation name, Group... groups) {
        SaplingRegistry.register(name, groups);
    }

}