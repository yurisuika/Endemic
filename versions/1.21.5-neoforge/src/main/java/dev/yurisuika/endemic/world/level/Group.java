package dev.yurisuika.endemic.world.level;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import java.util.List;

public record Group(double weight, Region region, Conditions conditions, List<Entry> entries) {

    public static final Codec<Group> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.fieldOf("weight").forGetter(Group::weight), Region.CODEC.fieldOf("region").forGetter(Group::region), Conditions.CODEC.fieldOf("conditions").forGetter(Group::conditions), Entry.CODEC.listOf().fieldOf("entries").forGetter(Group::entries)).apply(instance, Group::new));

    public record Region(Dimensions dimensions, Biomes biomes) {

        public static final Codec<Region> CODEC = RecordCodecBuilder.create(instance -> instance.group(Dimensions.CODEC.fieldOf("dimensions").forGetter(Region::dimensions), Biomes.CODEC.fieldOf("biomes").forGetter(Region::biomes)).apply(instance, Region::new));

        public record Dimensions(List<String> blacklist, List<String> whitelist) {

            public static final Codec<Dimensions> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.STRING.listOf().fieldOf("blacklist").forGetter(Dimensions::blacklist), Codec.STRING.listOf().fieldOf("whitelist").forGetter(Dimensions::whitelist)).apply(instance, Dimensions::new));

        }

        public record Biomes(List<String> blacklist, List<String> whitelist) {

            public static final Codec<Biomes> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.STRING.listOf().fieldOf("blacklist").forGetter(Biomes::blacklist), Codec.STRING.listOf().fieldOf("whitelist").forGetter(Biomes::whitelist)).apply(instance, Biomes::new));

        }

    }

    public record Conditions(Location location, Climate climate) {

        public static final Codec<Conditions> CODEC = RecordCodecBuilder.create(instance -> instance.group(Location.CODEC.fieldOf("location").forGetter(Conditions::location), Climate.CODEC.fieldOf("climate").forGetter(Conditions::climate)).apply(instance, Conditions::new));

        public record Location(Elevation elevation, Brightness brightness) {

            public static final Codec<Location> CODEC = RecordCodecBuilder.create(instance -> instance.group(Elevation.CODEC.fieldOf("elevation").forGetter(Location::elevation), Brightness.CODEC.fieldOf("brightness").forGetter(Location::brightness)).apply(instance, Location::new));

            public record Elevation(Optimum optimum, Tolerance tolerance) {

                public static final Codec<Elevation> CODEC = RecordCodecBuilder.create(instance -> instance.group(Optimum.CODEC.fieldOf("optimum").forGetter(Elevation::optimum), Tolerance.CODEC.fieldOf("tolerance").forGetter(Elevation::tolerance)).apply(instance, Elevation::new));

                public record Optimum(int min, int max) {

                    public static final Codec<Optimum> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.fieldOf("min").forGetter(Optimum::min), Codec.INT.fieldOf("max").forGetter(Optimum::max)).apply(instance, Optimum::new));

                }

                public record Tolerance(int min, int max) {

                    public static final Codec<Tolerance> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.fieldOf("min").forGetter(Tolerance::min), Codec.INT.fieldOf("max").forGetter(Tolerance::max)).apply(instance, Tolerance::new));

                }

            }

            public record Brightness(Optimum optimum, Tolerance tolerance) {

                public static final Codec<Brightness> CODEC = RecordCodecBuilder.create(instance -> instance.group(Brightness.Optimum.CODEC.fieldOf("optimum").forGetter(Brightness::optimum), Brightness.Tolerance.CODEC.fieldOf("tolerance").forGetter(Brightness::tolerance)).apply(instance, Brightness::new));

                public record Optimum(int min, int max) {

                    public static final Codec<Optimum> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.fieldOf("min").forGetter(Optimum::min), Codec.INT.fieldOf("max").forGetter(Optimum::max)).apply(instance, Optimum::new));

                }

                public record Tolerance(int min, int max) {

                    public static final Codec<Tolerance> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.fieldOf("min").forGetter(Tolerance::min), Codec.INT.fieldOf("max").forGetter(Tolerance::max)).apply(instance, Tolerance::new));

                }

            }

        }

        public record Climate(Temperature temperature, Downfall downfall) {

            public static final Codec<Climate> CODEC = RecordCodecBuilder.create(instance -> instance.group(Temperature.CODEC.fieldOf("temperature").forGetter(Climate::temperature), Downfall.CODEC.fieldOf("downfall").forGetter(Climate::downfall)).apply(instance, Climate::new));

            public record Temperature(Optimum optimum, Tolerance tolerance) {

                public static final Codec<Temperature> CODEC = RecordCodecBuilder.create(instance -> instance.group(Optimum.CODEC.fieldOf("optimum").forGetter(Temperature::optimum), Tolerance.CODEC.fieldOf("tolerance").forGetter(Temperature::tolerance)).apply(instance, Temperature::new));

                public record Optimum(double min, double max) {

                    public static final Codec<Optimum> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.fieldOf("min").forGetter(Optimum::min), Codec.DOUBLE.fieldOf("max").forGetter(Optimum::max)).apply(instance, Optimum::new));

                }

                public record Tolerance(double min, double max) {

                    public static final Codec<Tolerance> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.fieldOf("min").forGetter(Tolerance::min), Codec.DOUBLE.fieldOf("max").forGetter(Tolerance::max)).apply(instance, Tolerance::new));

                }

            }

            public record Downfall(Optimum optimum, Tolerance tolerance) {

                public static final Codec<Downfall> CODEC = RecordCodecBuilder.create(instance -> instance.group(Downfall.Optimum.CODEC.fieldOf("optimum").forGetter(Downfall::optimum), Downfall.Tolerance.CODEC.fieldOf("tolerance").forGetter(Downfall::tolerance)).apply(instance, Downfall::new));

                public record Optimum(double min, double max) {

                    public static final Codec<Optimum> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.fieldOf("min").forGetter(Optimum::min), Codec.DOUBLE.fieldOf("max").forGetter(Optimum::max)).apply(instance, Optimum::new));

                }

                public record Tolerance(double min, double max) {

                    public static final Codec<Tolerance> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.fieldOf("min").forGetter(Tolerance::min), Codec.DOUBLE.fieldOf("max").forGetter(Tolerance::max)).apply(instance, Tolerance::new));

                }

            }

        }

    }

    public record Entry(String feature, double weight, Neighbors neighbors) {

        public static final Codec<Entry> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.STRING.fieldOf("feature").forGetter(Entry::feature), Codec.DOUBLE.fieldOf("weight").forGetter(Entry::weight), Neighbors.CODEC.fieldOf("neighbors").forGetter(Entry::neighbors)).apply(instance, Entry::new));

        public record Neighbors(boolean flowers, boolean saplings) {

            public static final Codec<Neighbors> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.BOOL.fieldOf("flowers").forGetter(Neighbors::flowers), Codec.BOOL.fieldOf("saplings").forGetter(Neighbors::saplings)).apply(instance, Neighbors::new));

        }

    }

}