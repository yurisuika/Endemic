package dev.yurisuika.endemic.world.level.sapling.group;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import java.util.Arrays;
import java.util.List;

public record Group(double weight, Region region, Conditions conditions, List<Entry> entries) {

    public static final Codec<Group> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.optionalFieldOf("weight", 1.0D).forGetter(Group::weight), Region.CODEC.optionalFieldOf("region", Region.DEFAULT).forGetter(Group::region), Conditions.CODEC.optionalFieldOf("conditions", Conditions.DEFAULT).forGetter(Group::conditions), Entry.CODEC.listOf().fieldOf("entries").forGetter(Group::entries)).apply(instance, Group::new));

    public record Region(Dimensions dimensions, Biomes biomes) {

        public static final Codec<Region> CODEC = RecordCodecBuilder.create(instance -> instance.group(Dimensions.CODEC.optionalFieldOf("dimensions", new Dimensions(Arrays.asList(), Arrays.asList())).forGetter(Region::dimensions), Biomes.CODEC.optionalFieldOf("biomes", new Biomes(Arrays.asList(), Arrays.asList())).forGetter(Region::biomes)).apply(instance, Region::new));
        public static final Region DEFAULT = new Region(Dimensions.DEFAULT, Biomes.DEFAULT);

        public record Dimensions(List<ResourceLocation> blacklist, List<ResourceLocation> whitelist) {

            public static final Codec<Dimensions> CODEC = RecordCodecBuilder.create(instance -> instance.group(ResourceLocation.CODEC.listOf().optionalFieldOf("blacklist", Arrays.asList()).forGetter(Dimensions::blacklist), ResourceLocation.CODEC.listOf().optionalFieldOf("whitelist", Arrays.asList()).forGetter(Dimensions::whitelist)).apply(instance, Dimensions::new));
            public static final Dimensions DEFAULT = new Dimensions(Arrays.asList(), Arrays.asList());

        }

        public record Biomes(List<ResourceLocation> blacklist, List<ResourceLocation> whitelist) {

            public static final Codec<Biomes> CODEC = RecordCodecBuilder.create(instance -> instance.group(ResourceLocation.CODEC.listOf().optionalFieldOf("blacklist", Arrays.asList()).forGetter(Biomes::blacklist), ResourceLocation.CODEC.listOf().optionalFieldOf("whitelist", Arrays.asList()).forGetter(Biomes::whitelist)).apply(instance, Biomes::new));
            public static final Biomes DEFAULT = new Biomes(Arrays.asList(), Arrays.asList());

        }

    }

    public record Conditions(Location location, Climate climate) {

        public static final Codec<Conditions> CODEC = RecordCodecBuilder.create(instance -> instance.group(Location.CODEC.optionalFieldOf("location", Location.DEFAULT).forGetter(Conditions::location), Climate.CODEC.optionalFieldOf("climate", Climate.DEFAULT).forGetter(Conditions::climate)).apply(instance, Conditions::new));
        public static final Conditions DEFAULT = new Conditions(Location.DEFAULT, Climate.DEFAULT);

        public record Location(Elevation elevation, Brightness brightness) {

            public static final Codec<Location> CODEC = RecordCodecBuilder.create(instance -> instance.group(Elevation.CODEC.optionalFieldOf("elevation", Elevation.DEFAULT).forGetter(Location::elevation), Brightness.CODEC.optionalFieldOf("brightness", Brightness.DEFAULT).forGetter(Location::brightness)).apply(instance, Location::new));
            public static final Location DEFAULT = new Location(Elevation.DEFAULT, Brightness.DEFAULT);

            public record Elevation(Optimum optimum, Tolerance tolerance) {

                public static final Codec<Elevation> CODEC = RecordCodecBuilder.create(instance -> instance.group(Optimum.CODEC.optionalFieldOf("optimum", Optimum.DEFAULT).forGetter(Elevation::optimum), Tolerance.CODEC.optionalFieldOf("tolerance", Tolerance.DEFAULT).forGetter(Elevation::tolerance)).apply(instance, Elevation::new));
                public static final Elevation DEFAULT = new Elevation(Optimum.DEFAULT, Tolerance.DEFAULT);

                public record Optimum(int min, int max) {

                    public static final Codec<Optimum> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.optionalFieldOf("min", -2048).forGetter(Optimum::min), Codec.INT.optionalFieldOf("max", 2048).forGetter(Optimum::max)).apply(instance, Optimum::new));
                    public static final Optimum DEFAULT = new Optimum(-2048, 2048);

                }

                public record Tolerance(int min, int max) {

                    public static final Codec<Tolerance> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.optionalFieldOf("min", -2048).forGetter(Tolerance::min), Codec.INT.optionalFieldOf("max", 2048).forGetter(Tolerance::max)).apply(instance, Tolerance::new));
                    public static final Tolerance DEFAULT = new Tolerance(-2048, 2048);

                }

            }

            public record Brightness(Optimum optimum, Tolerance tolerance) {

                public static final Codec<Brightness> CODEC = RecordCodecBuilder.create(instance -> instance.group(Brightness.Optimum.CODEC.optionalFieldOf("optimum", Optimum.DEFAULT).forGetter(Brightness::optimum), Brightness.Tolerance.CODEC.optionalFieldOf("tolerance", Tolerance.DEFAULT).forGetter(Brightness::tolerance)).apply(instance, Brightness::new));
                public static final Brightness DEFAULT = new Brightness(Optimum.DEFAULT, Tolerance.DEFAULT);

                public record Optimum(int min, int max) {

                    public static final Codec<Optimum> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.optionalFieldOf("min", 0).forGetter(Optimum::min), Codec.INT.optionalFieldOf("max", 15).forGetter(Optimum::max)).apply(instance, Optimum::new));
                    public static final Optimum DEFAULT = new Optimum(0, 15);

                }

                public record Tolerance(int min, int max) {

                    public static final Codec<Tolerance> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.optionalFieldOf("min", 0).forGetter(Tolerance::min), Codec.INT.optionalFieldOf("max", 15).forGetter(Tolerance::max)).apply(instance, Tolerance::new));
                    public static final Tolerance DEFAULT = new Tolerance(0, 15);

                }

            }

        }

        public record Climate(Temperature temperature, Downfall downfall) {

            public static final Codec<Climate> CODEC = RecordCodecBuilder.create(instance -> instance.group(Temperature.CODEC.optionalFieldOf("temperature", Temperature.DEFAULT).forGetter(Climate::temperature), Downfall.CODEC.optionalFieldOf("downfall", Downfall.DEFAULT).forGetter(Climate::downfall)).apply(instance, Climate::new));
            public static final Climate DEFAULT = new Climate(Temperature.DEFAULT, Downfall.DEFAULT);

            public record Temperature(Optimum optimum, Tolerance tolerance) {

                public static final Codec<Temperature> CODEC = RecordCodecBuilder.create(instance -> instance.group(Optimum.CODEC.optionalFieldOf("optimum", Optimum.DEFAULT).forGetter(Temperature::optimum), Tolerance.CODEC.optionalFieldOf("tolerance", Tolerance.DEFAULT).forGetter(Temperature::tolerance)).apply(instance, Temperature::new));
                public static final Temperature DEFAULT = new Temperature(Optimum.DEFAULT, Tolerance.DEFAULT);

                public record Optimum(double min, double max) {

                    public static final Codec<Optimum> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.optionalFieldOf("min", -2.0D).forGetter(Optimum::min), Codec.DOUBLE.optionalFieldOf("max", 2.0D).forGetter(Optimum::max)).apply(instance, Optimum::new));
                    public static final Optimum DEFAULT = new Optimum(-2.0D, 2.0D);

                }

                public record Tolerance(double min, double max) {

                    public static final Codec<Tolerance> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.optionalFieldOf("min", -2.0D).forGetter(Tolerance::min), Codec.DOUBLE.optionalFieldOf("max", 2.0D).forGetter(Tolerance::max)).apply(instance, Tolerance::new));
                    public static final Tolerance DEFAULT = new Tolerance(-2.0D, 2.0D);

                }

            }

            public record Downfall(Optimum optimum,Tolerance tolerance) {

                public static final Codec<Downfall> CODEC = RecordCodecBuilder.create(instance -> instance.group(Downfall.Optimum.CODEC.optionalFieldOf("optimum", Optimum.DEFAULT).forGetter(Downfall::optimum), Downfall.Tolerance.CODEC.optionalFieldOf("tolerance", Tolerance.DEFAULT).forGetter(Downfall::tolerance)).apply(instance, Downfall::new));
                public static final Downfall DEFAULT = new Downfall(Optimum.DEFAULT, Tolerance.DEFAULT);

                public record Optimum(double min, double max) {

                    public static final Codec<Optimum> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.optionalFieldOf("min", 0.0D).forGetter(Optimum::min), Codec.DOUBLE.optionalFieldOf("max", 1.0D).forGetter(Optimum::max)).apply(instance, Optimum::new));
                    public static final Optimum DEFAULT = new Optimum(0.0D, 1.0D);

                }

                public record Tolerance(double min, double max) {

                    public static final Codec<Tolerance> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.optionalFieldOf("min", 0.0D).forGetter(Tolerance::min), Codec.DOUBLE.optionalFieldOf("max", 1.0D).forGetter(Tolerance::max)).apply(instance, Tolerance::new));
                    public static final Tolerance DEFAULT = new Tolerance(0.0D, 1.0D);

                }

            }

        }

    }

    public record Entry(double weight, ResourceLocation feature, Surroundings surroundings) {

        public static final Codec<Entry> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.optionalFieldOf("weight", 1.0D).forGetter(Entry::weight), ResourceLocation.CODEC.fieldOf("feature").forGetter(Entry::feature), Surroundings.CODEC.optionalFieldOf("surroundings", Surroundings.DEFAULT).forGetter(Entry::surroundings)).apply(instance, Entry::new));

        public record Surroundings(boolean requiresFlowersNearby, boolean requiresAdjacentSaplings) {

            public static final Codec<Surroundings> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.BOOL.optionalFieldOf("requires_flowers_nearby", false).forGetter(Surroundings::requiresFlowersNearby), Codec.BOOL.optionalFieldOf("requires_adjacent_saplings", false).forGetter(Surroundings::requiresAdjacentSaplings)).apply(instance, Surroundings::new));
            public static final Surroundings DEFAULT = new Surroundings(false, false);

        }

        public static class Builder {

            private final ResourceLocation feature;
            private double weight = 1.0D;
            private boolean requiresFlowersNearby = false;
            private boolean requiresAdjacentSaplings = false;

            public Builder(String feature) {
                this.feature = ResourceLocation.tryParse(feature);
            }

            public Builder(ResourceKey<?> feature) {
                this.feature = feature.location();
            }

            public Builder(ResourceLocation feature) {
                this.feature = feature;
            }

            public Builder weight(double weight) {
                this.weight = weight;
                return this;
            }

            public Builder surroundings(boolean requiresFlowersNearby, boolean requiresAdjacentSaplings) {
                this.requiresFlowersNearby = requiresFlowersNearby;
                this.requiresAdjacentSaplings = requiresAdjacentSaplings;
                return this;
            }

            public Builder requiresFlowersNearby() {
                this.requiresFlowersNearby = true;
                return this;
            }

            public Builder requiresAdjacentSaplings() {
                this.requiresAdjacentSaplings = true;
                return this;
            }

            public Entry build() {
                return new Entry(
                        weight,
                        feature,
                        new Surroundings(requiresFlowersNearby, requiresAdjacentSaplings)
                );
            }

        }

    }

    public static class Builder {

        private double weight = 1.0D;
        private List<ResourceLocation> dimensionBlacklist = Arrays.asList();
        private List<ResourceLocation> dimensionWhitelist = Arrays.asList();
        private List<ResourceLocation> biomeBlacklist = Arrays.asList();
        private List<ResourceLocation> biomeWhitelist = Arrays.asList();
        private int elevationOptimumMin = -2048;
        private int elevationOptimumMax = 2048;
        private int elevationToleranceMin = -2048;
        private int elevationToleranceMax = 2048;
        private int brightnessOptimumMin = 0;
        private int brightnessOptimumMax = 15;
        private int brightnessToleranceMin = 0;
        private int brightnessToleranceMax = 15;
        private double temperatureOptimumMin = -2.0D;
        private double temperatureOptimumMax = 2.0D;
        private double temperatureToleranceMin = -2.0D;
        private double temperatureToleranceMax = 2.0D;
        private double downfallOptimumMin = 0.0D;
        private double downfallOptimumMax = 1.0D;
        private double downfallToleranceMin = 0.0D;
        private double downfallToleranceMax = 1.0D;
        private final List<Entry> entries;

        public Builder(Entry... entries) {
            this.entries = Arrays.asList(entries);
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder dimensionBlacklist(String... dimensions) {
            this.dimensionBlacklist = Arrays.asList((ResourceLocation[]) Arrays.stream(dimensions).map(ResourceLocation::tryParse).toArray());
            return this;
        }

        public Builder dimensionBlacklist(ResourceKey<?>... dimensions) {
            this.dimensionBlacklist = Arrays.asList((ResourceLocation[]) Arrays.stream(dimensions).map(ResourceKey::location).toArray());
            return this;
        }

        public Builder dimensionBlacklist(ResourceLocation... dimensions) {
            this.dimensionBlacklist = Arrays.asList(dimensions);
            return this;
        }

        public Builder dimensionWhitelist(String... dimensions) {
            this.dimensionWhitelist = Arrays.asList((ResourceLocation[]) Arrays.stream(dimensions).map(ResourceLocation::tryParse).toArray());
            return this;
        }

        public Builder dimensionWhitelist(ResourceKey<?>... dimensions) {
            this.dimensionWhitelist = Arrays.asList((ResourceLocation[]) Arrays.stream(dimensions).map(ResourceKey::location).toArray());
            return this;
        }

        public Builder dimensionWhitelist(ResourceLocation... dimensions) {
            this.dimensionWhitelist = Arrays.asList(dimensions);
            return this;
        }

        public Builder biomeBlacklist(String... biomes) {
            this.biomeBlacklist = Arrays.asList((ResourceLocation[]) Arrays.stream(biomes).map(ResourceLocation::tryParse).toArray());
            return this;
        }

        public Builder biomeBlacklist(ResourceKey<?>... biomes) {
            this.biomeBlacklist = Arrays.asList((ResourceLocation[]) Arrays.stream(biomes).map(ResourceKey::location).toArray());
            return this;
        }

        public Builder biomeBlacklist(ResourceLocation... biomes) {
            this.biomeBlacklist = Arrays.asList(biomes);
            return this;
        }

        public Builder biomeWhitelist(String... biomes) {
            this.biomeWhitelist = Arrays.asList((ResourceLocation[]) Arrays.stream(biomes).map(ResourceLocation::tryParse).toArray());
            return this;
        }

        public Builder biomeWhitelist(ResourceKey<?>... biomes) {
            this.biomeWhitelist = Arrays.asList((ResourceLocation[]) Arrays.stream(biomes).map(ResourceKey::location).toArray());
            return this;
        }

        public Builder biomeWhitelist(ResourceLocation... biomes) {
            this.biomeWhitelist = Arrays.asList(biomes);
            return this;
        }

        public Builder elevationOptimum(int elevationOptimumMin, int elevationOptimumMax) {
            this.elevationOptimumMin = elevationOptimumMin;
            this.elevationOptimumMax = elevationOptimumMax;
            return this;
        }

        public Builder elevationOptimumMin(int elevationOptimumMin) {
            this.elevationOptimumMin = elevationOptimumMin;
            return this;
        }

        public Builder elevationOptimumMax(int elevationOptimumMax) {
            this.elevationOptimumMax = elevationOptimumMax;
            return this;
        }

        public Builder elevationTolerance(int elevationToleranceMin, int elevationToleranceMax) {
            this.elevationToleranceMin = elevationToleranceMin;
            this.elevationToleranceMax = elevationToleranceMax;
            return this;
        }

        public Builder elevationToleranceMin(int elevationToleranceMin) {
            this.elevationToleranceMin = elevationToleranceMin;
            return this;
        }

        public Builder elevationToleranceMax(int elevationToleranceMax) {
            this.elevationToleranceMax = elevationToleranceMax;
            return this;
        }

        public Builder brightnessOptimum(int brightnessOptimumMin, int brightnessOptimumMax) {
            this.brightnessOptimumMin = brightnessOptimumMin;
            this.brightnessOptimumMax = brightnessOptimumMax;
            return this;
        }

        public Builder brightnessOptimumMin(int brightnessOptimumMin) {
            this.brightnessOptimumMin = brightnessOptimumMin;
            return this;
        }

        public Builder brightnessOptimumMax(int brightnessOptimumMax) {
            this.brightnessOptimumMax = brightnessOptimumMax;
            return this;
        }

        public Builder brightnessTolerance(int brightnessToleranceMin, int brightnessToleranceMax) {
            this.brightnessToleranceMin = brightnessToleranceMin;
            this.brightnessToleranceMax = brightnessToleranceMax;
            return this;
        }

        public Builder brightnessToleranceMin(int brightnessToleranceMin) {
            this.brightnessToleranceMin = brightnessToleranceMin;
            return this;
        }

        public Builder brightnessToleranceMax(int brightnessToleranceMax) {
            this.brightnessToleranceMax = brightnessToleranceMax;
            return this;
        }

        public Builder temperatureOptimum(double temperatureOptimumMin, double temperatureOptimumMax) {
            this.temperatureOptimumMin = temperatureOptimumMin;
            this.temperatureOptimumMax = temperatureOptimumMax;
            return this;
        }

        public Builder temperatureOptimumMin(double temperatureOptimumMin) {
            this.temperatureOptimumMin = temperatureOptimumMin;
            return this;
        }

        public Builder temperatureOptimumMax(double temperatureOptimumMax) {
            this.temperatureOptimumMax = temperatureOptimumMax;
            return this;
        }

        public Builder temperatureTolerance(double temperatureToleranceMin, double temperatureToleranceMax) {
            this.temperatureToleranceMin = temperatureToleranceMin;
            this.temperatureToleranceMax = temperatureToleranceMax;
            return this;
        }

        public Builder temperatureToleranceMin(double temperatureToleranceMin) {
            this.temperatureToleranceMin = temperatureToleranceMin;
            return this;
        }

        public Builder temperatureToleranceMax(double temperatureToleranceMax) {
            this.temperatureToleranceMax = temperatureToleranceMax;
            return this;
        }

        public Builder downfallOptimum(double downfallOptimumMin, double downfallOptimumMax) {
            this.downfallOptimumMin = downfallOptimumMin;
            this.downfallOptimumMax = downfallOptimumMax;
            return this;
        }

        public Builder downfallOptimumMin(double downfallOptimumMin) {
            this.downfallOptimumMin = downfallOptimumMin;
            return this;
        }

        public Builder downfallOptimumMax(double downfallOptimumMax) {
            this.downfallOptimumMax = downfallOptimumMax;
            return this;
        }

        public Builder downfallTolerance(double downfallToleranceMin, double downfallToleranceMax) {
            this.downfallToleranceMin = downfallToleranceMin;
            this.downfallToleranceMax = downfallToleranceMax;
            return this;
        }

        public Builder downfallToleranceMin(double downfallToleranceMin) {
            this.downfallToleranceMin = downfallToleranceMin;
            return this;
        }

        public Builder downfallToleranceMax(double downfallToleranceMax) {
            this.downfallToleranceMax = downfallToleranceMax;
            return this;
        }

        public Group build() {
            return new Group(
                    weight,
                    new Region(
                            new Region.Dimensions(dimensionBlacklist, dimensionWhitelist),
                            new Region.Biomes(biomeBlacklist, biomeWhitelist)
                    ),
                    new Conditions(
                            new Conditions.Location(
                                    new Conditions.Location.Elevation(
                                            new Conditions.Location.Elevation.Optimum(elevationOptimumMin, elevationOptimumMax),
                                            new Conditions.Location.Elevation.Tolerance(elevationToleranceMin, elevationToleranceMax)
                                    ),
                                    new Conditions.Location.Brightness(
                                            new Conditions.Location.Brightness.Optimum(brightnessOptimumMin, brightnessOptimumMax),
                                            new Conditions.Location.Brightness.Tolerance(brightnessToleranceMin, brightnessToleranceMax)
                                    )
                            ),
                            new Conditions.Climate(
                                    new Conditions.Climate.Temperature(
                                            new Conditions.Climate.Temperature.Optimum(temperatureOptimumMin, temperatureOptimumMax),
                                            new Conditions.Climate.Temperature.Tolerance(temperatureToleranceMin, temperatureToleranceMax)
                                    ),
                                    new Conditions.Climate.Downfall(
                                            new Conditions.Climate.Downfall.Optimum(downfallOptimumMin, downfallOptimumMax),
                                            new Conditions.Climate.Downfall.Tolerance(downfallToleranceMin, downfallToleranceMax)
                                    )
                            )
                    ),
                    entries
            );
        }

    }

}