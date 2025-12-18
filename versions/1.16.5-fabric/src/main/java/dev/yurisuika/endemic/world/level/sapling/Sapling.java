package dev.yurisuika.endemic.world.level.sapling;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import dev.yurisuika.endemic.world.level.sapling.group.Group;

import java.util.List;

public final class Sapling {

    public static final Codec<Sapling> CODEC = RecordCodecBuilder.create(instance -> instance.group(Group.CODEC.listOf().fieldOf("group").forGetter(Sapling::groups)).apply(instance, Sapling::new));
    public final List<Group> groups;

    public Sapling(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> groups() {
        return groups;
    }

}