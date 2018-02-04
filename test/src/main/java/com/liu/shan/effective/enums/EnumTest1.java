package com.liu.shan.effective.enums;

import sun.jvm.hotspot.utilities.AssertionFailure;

/**
 * Description
 * <p>
 * </p>
 * DATE 2018/1/29.
 *
 * @author liuxin.
 */
public class EnumTest1 {

    public static void main(String[] args) {
        double x = 32;
        double y = 54;

        System.out.println(Opertion1.PLUS.ordinal() + " " + Opertion1.PLUS.apply(x, y));
        System.out.println(Opertion1.valueOf("TIMES").apply(x, y));

        System.out.println("============================payroll================================");
        System.out.println(PayrollDay.SUNDAY.pay(10, 2));
    }
}

enum Opertion {
    PLUS, MINUS, TIMES, DIVIDE, TEST;

    double appley(double x, double y) {
        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
        }
        throw new AssertionFailure("Unknown op:" + this);
    }
}

enum Opertion1 {
    PLUS {
        @Override double apply(double x, double y) {
            return x + y;
        }
    }, MINUS {
        @Override double apply(double x, double y) {
            return x - y;
        }
    }, TIMES {
        @Override double apply(double x, double y) {
            return x * y;
        }
    }, DIVIDE {
        @Override double apply(double x, double y) {
            return x / y;
        }
    };

    abstract double apply(double x, double y);
}

enum PayrollDay {

    MONDAY(PayType.WEEKDAY), TUESDAY(PayType.WEEKDAY), WEDNESDAY(PayType.WEEKDAY),STARUDAY(PayType.WEEKEND), SUNDAY(
            PayType.WEEKEND);

    private final PayType payType;

    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    double pay(double hoursWorked, double payRate) {
        return payType.pay(hoursWorked, payRate);
    }

    private enum PayType {
        WEEKDAY {
            @Override double overtimePay(double hours, double payRate) {
                return hours <= HOURS_PER_SHIFT ? 0 : (hours - HOURS_PER_SHIFT) * payRate / 2;
            }
        }, WEEKEND {
            @Override double overtimePay(double hours, double payRate) {
                return hours * payRate / 2;
            }
        };

        private static final int HOURS_PER_SHIFT = 9;

        abstract double overtimePay(double hours, double payRate);

        double pay(double hoursWorked, double payRate) {
            double basePay = hoursWorked * payRate;
            return basePay += overtimePay(hoursWorked, payRate);
        }
    }
}
