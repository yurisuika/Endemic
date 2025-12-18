package dev.yurisuika.endemic.world.level.sapling;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import dev.yurisuika.endemic.world.level.sapling.group.Group;

import java.util.List;

public record Sapling(List<Group> groups) {

    public static final Codec<Sapling> CODEC = RecordCodecBuilder.create(instance -> instance.group(Group.CODEC.listOf().fieldOf("group").forGetter(Sapling::groups)).apply(instance, Sapling::new));

}