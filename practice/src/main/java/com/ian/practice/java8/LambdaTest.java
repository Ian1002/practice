package com.ian.practice.java8;

/**
 * lambda表达式测试
 *
 * @author YangJing
 * @date 2018年7月11日下午6:38:42
 */
public class LambdaTest {

    public static void main(String[] args) {

        LambdaTest tester = new LambdaTest();

        // 类型申明
//		MathOperation addition = (int a, int b) -> a + b;

        // 不用类型申明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (a, b) -> {
            return a * b;
        };

        // 没有大括号及返回语句
        MathOperation division = (a, b) -> a / b;

//		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

//		System.out.println(addition.operation(10, 2));

        System.out.println(subtraction.addition(10, 1));

        System.out.println(subtraction.operation(10, 3));

        GreetingService greeting = (message) -> System.out.println(message);

        greeting.sayMessage("ian");

        GreetingService greeting2 = message -> {
            System.out.println(message);
        };

        greeting2.sayMessage("echo");

    }

    interface MathOperation {
        int operation(int a, int b);

        default int addition(int a, int b) {

            return a + b;
        }
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

}
