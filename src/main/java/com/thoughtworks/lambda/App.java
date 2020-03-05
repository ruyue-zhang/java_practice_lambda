package com.thoughtworks.lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        getSquare(10,a -> Math.pow(a, 2) );
        getSquare2(20,number -> Math.pow(number, 2) );
        get("MyConsumer",str -> "*" + str + "*");
        get2("Consumer", str -> System.out.println("*" + str + "*") );
    }

    public static void getSquare(double a, MyFunction myFunction) {
        double result = myFunction.square(a);
        System.out.println(result);
    }

    public static void getSquare2(double a, Function<Double, Double> function) {
        double result = function.apply(a);
        System.out.println(result);
    }

    public static void get(String str, MyConsumer myConsumer) {
        String result = myConsumer.addStar(str);
        System.out.println(result);
    }

    public static void get2(String str, Consumer<String> consumer) {
        consumer.accept(str);
    }
}

