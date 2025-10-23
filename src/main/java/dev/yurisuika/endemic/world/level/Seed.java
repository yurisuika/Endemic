package dev.yurisuika.endemic.world.level;

import java.util.List;

public class Seed {

    public Conditions conditions;
    public Entry[] entries;

    public Seed(Conditions conditions, Entry... entries) {
        this.conditions = conditions;
        this.entries = entries;
    }

    public Conditions getConditions() {
        return conditions;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public Entry[] getEntries() {
        return entries;
    }

    public void setEntries(Entry... entries) {
        this.entries = entries;
    }

    public static class Conditions {

        public Region region;
        public Location location;
        public Climate climate;

        public Conditions(Region region, Location location, Climate climate) {
            this.region = region;
            this.location = location;
            this.climate = climate;
        }

        public Region getRegion() {
            return region;
        }

        public void setRegion(Region region) {
            this.region = region;
        }

        public Location getLocation() {
            return  location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public Climate getClimate() {
            return climate;
        }

        public void setClimate(Climate climate) {
            this.climate = climate;
        }

        public static class Region {

            public List<String> dimensions;
            public List<String> biomes;

            public Region(List<String> dimensions, List<String> biomes) {
                this.dimensions = dimensions;
                this.biomes = biomes;
            }

            public List<String> getDimensions() {
                return dimensions;
            }

            public void setDimensions(List<String> dimensions) {
                this.dimensions = dimensions;
            }

            public List<String> getBiomes() {
                return biomes;
            }

            public void setBiomes(List<String> biomes) {
                this.biomes = biomes;
            }

        }

        public static class Location {

            public Elevation elevation;
            public Luminance luminance;

            public Location(Elevation elevation, Luminance luminance) {
                this.elevation = elevation;
                this.luminance = luminance;
            }

            public Elevation getElevation() {
                return elevation;
            }

            public void setElevation(Elevation elevation) {
                this.elevation = elevation;
            }

            public Luminance getLuminance() {
                return luminance;
            }

            public void setLuminance(Luminance luminance) {
                this.luminance = luminance;
            }

            public static class Elevation {

                public int min;
                public int max;

                public Elevation(int min, int max) {
                    this.min = min;
                    this.max = max;
                }

                public int getMin() {
                    return min;
                }

                public void setMin(int min) {
                    this.min = min;
                }

                public int getMax() {
                    return max;
                }

                public void setMax(int max) {
                    this.max = max;
                }

            }

            public static class Luminance {

                public int min;
                public int max;

                public Luminance(int min, int max) {
                    this.min = min;
                    this.max = max;
                }

                public int getMin() {
                    return min;
                }

                public void setMin(int min) {
                    this.min = min;
                }

                public int getMax() {
                    return max;
                }

                public void setMax(int max) {
                    this.max = max;
                }

            }

        }

        public static class Climate {

            public Temperature temperature;
            public Precipitation precipitation;

            public Climate(Temperature temperature, Precipitation precipitation) {
                this.temperature = temperature;
                this.precipitation = precipitation;
            }

            public Temperature getTemperature() {
                return temperature;
            }

            public void setTemperature(Temperature temperature) {
                this.temperature = temperature;
            }

            public Precipitation getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(Precipitation precipitation) {
                this.precipitation = precipitation;
            }

            public static class Temperature {

                public float min;
                public float max;

                public Temperature(float min, float max) {
                    this.min = min;
                    this.max = max;
                }

                public float getMin() {
                    return min;
                }

                public void setMin(float min) {
                    this.min = min;
                }

                public float getMax() {
                    return max;
                }

                public void setMax(float max) {
                    this.max = max;
                }

            }

            public static class Precipitation {

                public float min;
                public float max;

                public Precipitation(float min, float max) {
                    this.min = min;
                    this.max = max;
                }

                public float getMin() {
                    return min;
                }

                public void setMin(float min) {
                    this.min = min;
                }

                public float getMax() {
                    return max;
                }

                public void setMax(float max) {
                    this.max = max;
                }

            }

        }

    }

    public static class Entry {

        public String feature;
        public int weight;
        public Proximity proximity;

        public Entry(String feature, int weight, Proximity proximity) {
            this.feature = feature;
            this.weight = weight;
            this.proximity = proximity;
        }

        public String getFeature() {
            return feature;
        }

        public void setFeature(String feature) {
            this.feature = feature;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Proximity getProximity() {
            return proximity;
        }

        public void setProximity(Proximity proximity) {
            this.proximity = proximity;
        }

        public static class Proximity {

            public boolean flowers;
            public boolean saplings;

            public Proximity(boolean flowers, boolean saplings) {
                this.flowers = flowers;
                this.saplings = saplings;
            }

            public boolean getFlowers() {
                return flowers;
            }

            public void setFlowers(boolean flowers) {
                this.flowers = flowers;
            }

            public boolean getSaplings() {
                return saplings;
            }

            public void setSaplings(boolean saplings) {
                this.saplings = saplings;
            }

        }

    }

}