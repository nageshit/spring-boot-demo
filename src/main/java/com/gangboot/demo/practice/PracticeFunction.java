package com.gangboot.demo.practice;

import java.util.Optional;
import java.util.function.Function;

public class PracticeFunction {

    public static void main(String[] args) {
        Function<Integer, Integer> function1 = t -> (t - 5);
        Function<Integer, Integer> function2 = t -> (t * 2);

        //Using andThen() method
        int a=function1.andThen(function2).apply(50);
        System.out.println(a);

        //Using compose function
        int c=function1.compose(function2).apply(50);
        System.out.println(c);


    }
}
