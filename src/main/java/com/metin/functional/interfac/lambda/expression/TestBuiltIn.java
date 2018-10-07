package com.metin.functional.interfac.lambda.expression;

public class TestBuiltIn {

    public static void main(String[] args) {

        // Before 1.8
        Runnable runnable1 = new Runnable() {

            @Override
            public void run() {

                System.out.println("Before 1.8");
            }
        };
        runnable1.run();

        // 1.8
        Runnable runnable2 = () -> System.out.println("1.8");
        runnable2.run();

    }
}
