package dev.yurisuika.endemic.util;

public enum Transition {

    LINEAR {
        @Override
        public double transition(double x) {
            return x;
        }
    },
    EASE_IN_SINE {
        @Override
        public double transition(double x) {
            return 1.0D - Math.cos((x * Math.PI) / 2.0D);
        }
    },
    EASE_OUT_SINE {
        @Override
        public double transition(double x) {
            return Math.sin((x * Math.PI) / 2.0D);
        }
    },
    EASE_IN_OUT_SINE {
        @Override
        public double transition(double x) {
            return -(Math.cos(Math.PI * x) - 1.0D) / 2.0D;
        }
    },
    EASE_IN_QUAD {
        @Override
        public double transition(double x) {
            return x * x;
        }
    },
    EASE_OUT_QUAD {
        @Override
        public double transition(double x) {
            return 1.0D - (1.0D - x) * (1.0D - x);
        }
    },
    EASE_IN_OUT_QUAD {
        @Override
        public double transition(double x) {
            return x < 0.5D ? 2.0D * x * x : 1.0D - Math.pow(-2.0D * x + 2.0D, 2.0D) / 2.0D;
        }
    },
    EASE_IN_CUBIC {
        @Override
        public double transition(double x) {
            return x * x * x;
        }
    },
    EASE_OUT_CUBIC {
        @Override
        public double transition(double x) {
            return 1.0D - Math.pow(1.0D - x, 3.0D);
        }
    },
    EASE_IN_OUT_CUBIC {
        @Override
        public double transition(double x) {
            return x < 0.5D ? 4.0D * x * x * x : 1.0D - Math.pow(-2.0D * x + 2.0D, 3.0D) / 2.0D;
        }
    },
    EASE_IN_QUART {
        @Override
        public double transition(double x) {
            return x * x * x * x;
        }
    },
    EASE_OUT_QUART {
        @Override
        public double transition(double x) {
            return 1.0D - Math.pow(1.0D - x, 4.0D);
        }
    },
    EASE_IN_OUT_QUART {
        @Override
        public double transition(double x) {
            return x < 0.5D ? 8.0D * x * x * x * x : 1.0D - Math.pow(-2.0D * x + 2.0D, 4.0D) / 2.0D;
        }
    },
    EASE_IN_QUINT {
        @Override
        public double transition(double x) {
            return x * x * x * x * x;
        }
    },
    EASE_OUT_QUINT {
        @Override
        public double transition(double x) {
            return 1.0D - Math.pow(1.0D - x, 5.0D);
        }
    },
    EASE_IN_OUT_QUINT {
        @Override
        public double transition(double x) {
            return x < 0.5D ? 16.0D * x * x * x * x * x : 1.0D - Math.pow(-2.0D * x + 2.0D, 5.0D) / 2.0D;
        }
    },
    EASE_IN_EXPO {
        @Override
        public double transition(double x) {
            return x == 0.0D ? 0.0D : Math.pow(2.0D, 10.0D * x - 10.0D);
        }
    },
    EASE_OUT_EXPO {
        @Override
        public double transition(double x) {
            return x == 1.0D ? 1.0D : 1.0D - Math.pow(2.0D, -10.0D * x);
        }
    },
    EASE_IN_OUT_EXPO {
        @Override
        public double transition(double x) {
            return x == 0.0D ? 0.0D : x == 1.0D ? 1.0D : x < 0.5D ? Math.pow(2.0D, 20.0D * x - 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, -20.0D * x + 10.0D)) / 2.0D;
        }
    },
    EASE_IN_CIRC {
        @Override
        public double transition(double x) {
            return 1.0D - Math.sqrt(1.0D - Math.pow(x, 2.0D));
        }
    },
    EASE_OUT_CIRC {
        @Override
        public double transition(double x) {
            return Math.sqrt(1.0D - Math.pow(x - 1.0D, 2.0D));
        }
    },
    EASE_IN_OUT_CIRC {
        @Override
        public double transition(double x) {
            return x < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(2.0D * x, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(-2.0D * x + 2.0D, 2.0D)) + 1.0D) / 2.0D;
        }
    };

    public abstract double transition(double x);

}