package dev.yurisuika.endemic.world.level;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import java.util.List;

public final class Group {

    public static final Codec<Group> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.fieldOf("weight").forGetter(Group::weight), Region.CODEC.fieldOf("region").forGetter(Group::region), Conditions.CODEC.fieldOf("conditions").forGetter(Group::conditions), Entry.CODEC.listOf().fieldOf("entries").forGetter(Group::entries)).apply(instance, Group::new));
    public final double weight;
    public final Region region;
    public final Conditions conditions;
    public final List<Entry> entries;

    public Group(double weight, Region region, Conditions conditions, List<Entry> entries) {
        this.weight = weight;
        this.region = region;
        this.conditions = conditions;
        this.entries = entries;
    }

    public double weight() {
        return weight;
    }

    public Region region() {
        return region;
    }

    public Conditions conditions() {
        return conditions;
    }

    public List<Entry> entries() {
        return entries;
    }

    public static final class Region {

        public static final Codec<Region> CODEC = RecordCodecBuilder.create(instance -> instance.group(Dimensions.CODEC.fieldOf("dimensions").forGetter(Region::dimensions), Biomes.CODEC.fieldOf("biomes").forGetter(Region::biomes)).apply(instance, Region::new));
        public final Dimensions dimensions;
        public final Biomes biomes;

        public Region(Dimensions dimensions, Biomes biomes) {
            this.dimensions = dimensions;
            this.biomes = biomes;
        }

        public Dimensions dimensions() {
            return dimensions;
        }

        public Biomes biomes() {
            return biomes;
        }

        public static final class Dimensions {

            public static final Codec<Dimensions> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.STRING.listOf().fieldOf("blacklist").forGetter(Dimensions::blacklist), Codec.STRING.listOf().fieldOf("whitelist").forGetter(Dimensions::whitelist)).apply(instance, Dimensions::new));
            public final List<String> blacklist;
            public final List<String> whitelist;

            public Dimensions(List<String> blacklist, List<String> whitelist) {
                this.blacklist = blacklist;
                this.whitelist = whitelist;
            }

            public List<String> blacklist() {
                return blacklist;
            }

            public List<String> whitelist() {
                return whitelist;
            }

        }

        public static final class Biomes {

            public static final Codec<Biomes> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.STRING.listOf().fieldOf("blacklist").forGetter(Biomes::blacklist), Codec.STRING.listOf().fieldOf("whitelist").forGetter(Biomes::whitelist)).apply(instance, Biomes::new));
            public final List<String> blacklist;
            public final List<String> whitelist;

            public Biomes(List<String> blacklist, List<String> whitelist) {
                this.blacklist = blacklist;
                this.whitelist = whitelist;
            }

            public List<String> blacklist() {
                return blacklist;
            }

            public List<String> whitelist() {
                return whitelist;
            }

        }

    }

    public static final class Conditions {

        public static final Codec<Conditions> CODEC = RecordCodecBuilder.create(instance -> instance.group(Location.CODEC.fieldOf("location").forGetter(Conditions::location), Climate.CODEC.fieldOf("climate").forGetter(Conditions::climate)).apply(instance, Conditions::new));
        public final Location location;
        public final Climate climate;

        public Conditions(Location location, Climate climate) {
            this.location = location;
            this.climate = climate;
        }

        public Location location() {
            return location;
        }

        public Climate climate() {
            return climate;
        }

        public static final class Location {

            public static final Codec<Location> CODEC = RecordCodecBuilder.create(instance -> instance.group(Elevation.CODEC.fieldOf("elevation").forGetter(Location::elevation), Brightness.CODEC.fieldOf("brightness").forGetter(Location::brightness)).apply(instance, Location::new));
            public final Elevation elevation;
            public final Brightness brightness;

            public Location(Elevation elevation, Brightness brightness) {
                this.elevation = elevation;
                this.brightness = brightness;
            }

            public Elevation elevation() {
                return elevation;
            }

            public Brightness brightness() {
                return brightness;
            }

            public static final class Elevation {

                public static final Codec<Elevation> CODEC = RecordCodecBuilder.create(instance -> instance.group(Optimum.CODEC.fieldOf("optimum").forGetter(Elevation::optimum), Tolerance.CODEC.fieldOf("tolerance").forGetter(Elevation::tolerance)).apply(instance, Elevation::new));
                public final Optimum optimum;
                public final Tolerance tolerance;

                public Elevation(Optimum optimum, Tolerance tolerance) {
                    this.optimum = optimum;
                    this.tolerance = tolerance;
                }

                public Optimum optimum() {
                    return optimum;
                }

                public Tolerance tolerance() {
                    return tolerance;
                }

                public static final class Optimum {

                    public static final Codec<Optimum> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.fieldOf("min").forGetter(Optimum::min), Codec.INT.fieldOf("max").forGetter(Optimum::max)).apply(instance, Optimum::new));
                    public final int min;
                    public final int max;

                    public Optimum(int min, int max) {
                        this.min = min;
                        this.max = max;
                    }

                    public int min() {
                        return min;
                    }

                    public int max() {
                        return max;
                    }

                }

                public static final class Tolerance {

                    public static final Codec<Tolerance> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.fieldOf("min").forGetter(Tolerance::min), Codec.INT.fieldOf("max").forGetter(Tolerance::max)).apply(instance, Tolerance::new));
                    public final int min;
                    public final int max;

                    public Tolerance(int min, int max) {
                        this.min = min;
                        this.max = max;
                    }

                    public int min() {
                        return min;
                    }

                    public int max() {
                        return max;
                    }

                }

            }

            public static final class Brightness {

                public static final Codec<Brightness> CODEC = RecordCodecBuilder.create(instance -> instance.group(Optimum.CODEC.fieldOf("optimum").forGetter(Brightness::optimum), Tolerance.CODEC.fieldOf("tolerance").forGetter(Brightness::tolerance)).apply(instance, Brightness::new));
                public final Optimum optimum;
                public final Tolerance tolerance;

                public Brightness(Optimum optimum, Tolerance tolerance) {
                    this.optimum = optimum;
                    this.tolerance = tolerance;
                }

                public Optimum optimum() {
                    return optimum;
                }

                public Tolerance tolerance() {
                    return tolerance;
                }

                public static final class Optimum {

                    public static final Codec<Optimum> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.fieldOf("min").forGetter(Optimum::min), Codec.INT.fieldOf("max").forGetter(Optimum::max)).apply(instance, Optimum::new));
                    public final int min;
                    public final int max;

                    public Optimum(int min, int max) {
                        this.min = min;
                        this.max = max;
                    }

                    public int min() {
                        return min;
                    }

                    public int max() {
                        return max;
                    }

                }

                public static final class Tolerance {

                    public static final Codec<Tolerance> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.fieldOf("min").forGetter(Tolerance::min), Codec.INT.fieldOf("max").forGetter(Tolerance::max)).apply(instance, Tolerance::new));
                    public final int min;
                    public final int max;

                    public Tolerance(int min, int max) {
                        this.min = min;
                        this.max = max;
                    }

                    public int min() {
                        return min;
                    }

                    public int max() {
                        return max;
                    }

                }

            }

        }

        public static final class Climate {

            public static final Codec<Climate> CODEC = RecordCodecBuilder.create(instance -> instance.group(Temperature.CODEC.fieldOf("temperature").forGetter(Climate::temperature), Downfall.CODEC.fieldOf("downfall").forGetter(Climate::downfall)).apply(instance, Climate::new));
            public final Temperature temperature;
            public final Downfall downfall;

            public Climate(Temperature temperature, Downfall downfall) {
                this.temperature = temperature;
                this.downfall = downfall;
            }

            public Temperature temperature() {
                return temperature;
            }

            public Downfall downfall() {
                return downfall;
            }

            public static final class Temperature {

                public static final Codec<Temperature> CODEC = RecordCodecBuilder.create(instance -> instance.group(Optimum.CODEC.fieldOf("optimum").forGetter(Temperature::optimum), Tolerance.CODEC.fieldOf("tolerance").forGetter(Temperature::tolerance)).apply(instance, Temperature::new));
                public final Optimum optimum;
                public final Tolerance tolerance;

                public Temperature(Optimum optimum, Tolerance tolerance) {
                    this.optimum = optimum;
                    this.tolerance = tolerance;
                }

                public Optimum optimum() {
                    return optimum;
                }

                public Tolerance tolerance() {
                    return tolerance;
                }

                public static final class Optimum {

                    public static final Codec<Optimum> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.fieldOf("min").forGetter(Optimum::min), Codec.DOUBLE.fieldOf("max").forGetter(Optimum::max)).apply(instance, Optimum::new));
                    public final double min;
                    public final double max;

                    public Optimum(double min, double max) {
                        this.min = min;
                        this.max = max;
                    }

                    public double min() {
                        return min;
                    }

                    public double max() {
                        return max;
                    }

                }

                public static final class Tolerance {

                    public static final Codec<Tolerance> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.fieldOf("min").forGetter(Tolerance::min), Codec.DOUBLE.fieldOf("max").forGetter(Tolerance::max)).apply(instance, Tolerance::new));
                    public final double min;
                    public final double max;

                    public Tolerance(double min, double max) {
                        this.min = min;
                        this.max = max;
                    }

                    public double min() {
                        return min;
                    }

                    public double max() {
                        return max;
                    }

                }

            }

            public static final class Downfall {

                public static final Codec<Downfall> CODEC = RecordCodecBuilder.create(instance -> instance.group(Optimum.CODEC.fieldOf("optimum").forGetter(Downfall::optimum), Tolerance.CODEC.fieldOf("tolerance").forGetter(Downfall::tolerance)).apply(instance, Downfall::new));
                public final Optimum optimum;
                public final Tolerance tolerance;

                public Downfall(Optimum optimum, Tolerance tolerance) {
                    this.optimum = optimum;
                    this.tolerance = tolerance;
                }

                public Optimum optimum() {
                    return optimum;
                }

                public Tolerance tolerance() {
                    return tolerance;
                }

                public static final class Optimum {

                    public static final Codec<Optimum> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.fieldOf("min").forGetter(Optimum::min), Codec.DOUBLE.fieldOf("max").forGetter(Optimum::max)).apply(instance, Optimum::new));
                    public final double min;
                    public final double max;

                    public Optimum(double min, double max) {
                        this.min = min;
                        this.max = max;
                    }

                    public double min() {
                        return min;
                    }

                    public double max() {
                        return max;
                    }

                }

                public static final class Tolerance {

                    public static final Codec<Tolerance> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.DOUBLE.fieldOf("min").forGetter(Tolerance::min), Codec.DOUBLE.fieldOf("max").forGetter(Tolerance::max)).apply(instance, Tolerance::new));
                    public final double min;
                    public final double max;

                    public Tolerance(double min, double max) {
                        this.min = min;
                        this.max = max;
                    }

                    public double min() {
                        return min;
                    }

                    public double max() {
                        return max;
                    }

                }

            }

        }

    }

    public static final class Entry {

        public static final Codec<Entry> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.STRING.fieldOf("feature").forGetter(Entry::feature), Codec.DOUBLE.fieldOf("weight").forGetter(Entry::weight), Neighbors.CODEC.fieldOf("neighbors").forGetter(Entry::neighbors)).apply(instance, Entry::new));
        public final String feature;
        public final double weight;
        public final Neighbors neighbors;

        public Entry(String feature, double weight, Neighbors neighbors) {
            this.feature = feature;
            this.weight = weight;
            this.neighbors = neighbors;
        }

        public String feature() {
            return feature;
        }

        public double weight() {
            return weight;
        }

        public Neighbors neighbors() {
            return neighbors;
        }

        public static final class Neighbors {

            public static final Codec<Neighbors> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.BOOL.fieldOf("flowers").forGetter(Neighbors::flowers), Codec.BOOL.fieldOf("saplings").forGetter(Neighbors::saplings)).apply(instance, Neighbors::new));
            public final boolean flowers;
            public final boolean saplings;

            public Neighbors(boolean flowers, boolean saplings) {
                this.flowers = flowers;
                this.saplings = saplings;
            }

            public boolean flowers() {
                return flowers;
            }

            public boolean saplings() {
                return saplings;
            }

        }

    }

}