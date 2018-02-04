package com.liu.shan.effective.enums;

import java.util.Arrays;
import java.util.Collection;

public class Enum34 {

    public static void main(String[] args) {

        double x = 9;
        double y = 4;
        test(ExtendedOperation.class, x, y);
        test1(Arrays.asList(BasicOperation.values()), x, y);
    }

    private static <T extends Enum<T> & Operation> void test(
            Class<T> opSet, double x, double y) {
        for (Operation op : opSet.getEnumConstants())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }

    private static void test1(Collection<? extends Operation> opSet, double x, double y) {
        opSet.forEach(op ->{
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
        });
    }
}


// Emulated extensible enum using an interface
interface Operation {
    double apply(double x, double y);
}

enum BasicOperation implements Operation {
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };
    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}

// Emulated extension enum
enum ExtendedOperation implements Operation {
    EXP("^") {
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMAINDER("%") {
        public double apply(double x, double y) {
            return x % y;
        }
    };

    private final String symbol;

    ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}