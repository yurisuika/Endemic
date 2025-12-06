package dev.yurisuika.endemic.world.level;

import java.util.List;

public class Group {

    public double weight;
    public Region region;
    public Conditions conditions;
    public Entry[] entries;

    public Group(double weight, Region region, Conditions conditions, Entry... entries) {
        setWeight(weight);
        setRegion(region);
        setConditions(conditions);
        setEntries(entries);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
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

    public static class Region {

        public Dimensions dimensions;
        public Biomes biomes;

        public Region(Dimensions dimensions, Biomes biomes) {
            setDimensions(dimensions);
            setBiomes(biomes);
        }

        public Dimensions getDimensions() {
            return dimensions;
        }

        public void setDimensions(Dimensions dimensions) {
            this.dimensions = dimensions;
        }

        public Biomes getBiomes() {
            return biomes;
        }

        public void setBiomes(Biomes biomes) {
            this.biomes = biomes;
        }

        public static class Dimensions {

            public List<String> blacklist;
            public List<String> whitelist;

            public Dimensions(List<String> blacklist, List<String> whitelist) {
                setBlacklist(blacklist);
                setWhitelist(whitelist);
            }

            public List<String> getBlacklist() {
                return blacklist;
            }

            public void setBlacklist(List<String> blacklist) {
                this.blacklist = blacklist;
            }

            public List<String> getWhitelist() {
                return whitelist;
            }

            public void setWhitelist(List<String> whitelist) {
                this.whitelist = whitelist;
            }

        }

        public static class Biomes {

            public List<String> blacklist;
            public List<String> whitelist;

            public Biomes(List<String> blacklist, List<String> whitelist) {
                setBlacklist(blacklist);
                setWhitelist(whitelist);
            }

            public List<String> getBlacklist() {
                return blacklist;
            }

            public void setBlacklist(List<String> blacklist) {
                this.blacklist = blacklist;
            }

            public List<String> getWhitelist() {
                return whitelist;
            }

            public void setWhitelist(List<String> whitelist) {
                this.whitelist = whitelist;
            }

        }

    }

    public static class Conditions {

        public Location location;
        public Climate climate;

        public Conditions(Location location, Climate climate) {
            setLocation(location);
            setClimate(climate);
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

        public static class Location {

            public Elevation elevation;
            public Brightness brightness;

            public Location(Elevation elevation, Brightness brightness) {
                setElevation(elevation);
                setBrightness(brightness);
            }

            public Elevation getElevation() {
                return elevation;
            }

            public void setElevation(Elevation elevation) {
                this.elevation = elevation;
            }

            public Brightness getBrightness() {
                return brightness;
            }

            public void setBrightness(Brightness brightness) {
                this.brightness = brightness;
            }

            public static class Elevation {

                public Optimum optimum;
                public Tolerance tolerance;

                public Elevation(Optimum optimum, Tolerance tolerance) {
                    setOptimum(optimum);
                    setTolerance(tolerance);
                }

                public Optimum getOptimum() {
                    return optimum;
                }
                
                public void setOptimum(Optimum optimum) {
                    this.optimum = optimum;
                }

                public Tolerance getTolerance() {
                    return tolerance;
                }
                
                public void setTolerance(Tolerance tolerance) {
                    this.tolerance = tolerance;
                }

                public static class Optimum {

                    public int min;
                    public int max;

                    public Optimum(int min, int max) {
                        setMin(min);
                        setMax(max);
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

                public static class Tolerance {

                    public int min;
                    public int max;

                    public Tolerance(int min, int max) {
                        setMin(min);
                        setMax(max);
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

            public static class Brightness {

                public Optimum optimum;
                public Tolerance tolerance;

                public Brightness(Optimum optimum, Tolerance tolerance) {
                    setOptimum(optimum);
                    setTolerance(tolerance);
                }

                public Optimum getOptimum() {
                    return optimum;
                }

                public void setOptimum(Optimum optimum) {
                    this.optimum = optimum;
                }

                public Tolerance getTolerance() {
                    return tolerance;
                }

                public void setTolerance(Tolerance tolerance) {
                    this.tolerance = tolerance;
                }

                public static class Optimum {

                    public int min;
                    public int max;

                    public Optimum(int min, int max) {
                        setMin(min);
                        setMax(max);
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

                public static class Tolerance {

                    public int min;
                    public int max;

                    public Tolerance(int min, int max) {
                        setMin(min);
                        setMax(max);
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

        }

        public static class Climate {

            public Temperature temperature;
            public Downfall downfall;

            public Climate(Temperature temperature, Downfall downfall) {
                setTemperature(temperature);
                setDownfall(downfall);
            }

            public Temperature getTemperature() {
                return temperature;
            }

            public void setTemperature(Temperature temperature) {
                this.temperature = temperature;
            }

            public Downfall getDownfall() {
                return downfall;
            }

            public void setDownfall(Downfall downfall) {
                this.downfall = downfall;
            }

            public static class Temperature {

                public Optimum optimum;
                public Tolerance tolerance;

                public Temperature(Optimum optimum, Tolerance tolerance) {
                    setOptimum(optimum);
                    setTolerance(tolerance);
                }

                public Optimum getOptimum() {
                    return optimum;
                }

                public void setOptimum(Optimum optimum) {
                    this.optimum = optimum;
                }

                public Tolerance getTolerance() {
                    return tolerance;
                }

                public void setTolerance(Tolerance tolerance) {
                    this.tolerance = tolerance;
                }

                public static class Optimum {

                    public double min;
                    public double max;

                    public Optimum(double min, double max) {
                        setMin(min);
                        setMax(max);
                    }

                    public double getMin() {
                        return min;
                    }

                    public void setMin(double min) {
                        this.min = min;
                    }

                    public double getMax() {
                        return max;
                    }

                    public void setMax(double max) {
                        this.max = max;
                    }

                }

                public static class Tolerance {

                    public double min;
                    public double max;

                    public Tolerance(double min, double max) {
                        setMin(min);
                        setMax(max);
                    }

                    public double getMin() {
                        return min;
                    }

                    public void setMin(double min) {
                        this.min = min;
                    }

                    public double getMax() {
                        return max;
                    }

                    public void setMax(double max) {
                        this.max = max;
                    }

                }

            }

            public static class Downfall {

                public Optimum optimum;
                public Tolerance tolerance;

                public Downfall(Optimum optimum, Tolerance tolerance) {
                    setOptimum(optimum);
                    setTolerance(tolerance);
                }

                public Optimum getOptimum() {
                    return optimum;
                }

                public void setOptimum(Optimum optimum) {
                    this.optimum = optimum;
                }

                public Tolerance getTolerance() {
                    return tolerance;
                }

                public void setTolerance(Tolerance tolerance) {
                    this.tolerance = tolerance;
                }

                public static class Optimum {

                    public double min;
                    public double max;

                    public Optimum(double min, double max) {
                        setMin(min);
                        setMax(max);
                    }

                    public double getMin() {
                        return min;
                    }

                    public void setMin(double min) {
                        this.min = min;
                    }

                    public double getMax() {
                        return max;
                    }

                    public void setMax(double max) {
                        this.max = max;
                    }

                }

                public static class Tolerance {

                    public double min;
                    public double max;

                    public Tolerance(double min, double max) {
                        setMin(min);
                        setMax(max);
                    }

                    public double getMin() {
                        return min;
                    }

                    public void setMin(double min) {
                        this.min = min;
                    }

                    public double getMax() {
                        return max;
                    }

                    public void setMax(double max) {
                        this.max = max;
                    }

                }

            }

        }

    }

    public static class Entry {

        public String feature;
        public double weight;
        public Neighbors neighbors;

        public Entry(String feature, double weight, Neighbors neighbors) {
            setFeature(feature);
            setWeight(weight);
            setNeighbors(neighbors);
        }

        public String getFeature() {
            return feature;
        }

        public void setFeature(String feature) {
            this.feature = feature;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public Neighbors getNeighbors() {
            return neighbors;
        }

        public void setNeighbors(Neighbors neighbors) {
            this.neighbors = neighbors;
        }

        public static class Neighbors {

            public boolean flowers;
            public boolean saplings;

            public Neighbors(boolean flowers, boolean saplings) {
                setFlowers(flowers);
                setSaplings(saplings);
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