package com.liu.shan.effective.enums;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Description
 * <p>
 * </p>
 * DATE 2018/2/6.
 *
 * @author liuxin.
 */
public class Annotation34 {

    public static void main(String[] args) throws ClassNotFoundException {

        int tests = 0;
        int passed = 0;
        Class testClass = Class.forName("com.liu.shan.effective.enums.Sample");
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedEx) {
                    Throwable exc = wrappedEx.getCause();
                    Class<? extends Exception> excType =
                            m.getAnnotation(ExceptionTest.class).value();
                    if (excType.isInstance(exc)) {
                        passed++;
                    } else {
                        System.out.printf(
                                "Test %s failed: expected %s, got %s%n",
                                m, excType.getName(), exc);
                    }
                } catch (Exception exc) {
                    System.out.println("INVALID @Test: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n",
                passed, tests - passed);
    }

}

class Sample {
    @ExceptionTest(ArithmeticException.class) public static void m1() {
        System.out.println("m1 run");
    } // Test should pass
    public static void m2() {}
    @ExceptionTest(ArithmeticException.class) public static void m3() {
        throw new RuntimeException("Boom");
    }
    public static void m4() {}
    @ExceptionTest(ArithmeticException.class) public void m5() {
        System.out.println("m5 run");
    } // INVALID USE: nonstatic method
    public static void m6() {}
    @ExceptionTest(ArithmeticException.class) public static void m7() {  // Test should fail
        throw new RuntimeException("Crash");
    }
    public static void m8() {}
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ExceptionTest {

    Class<? extends Exception> value();

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test {
}