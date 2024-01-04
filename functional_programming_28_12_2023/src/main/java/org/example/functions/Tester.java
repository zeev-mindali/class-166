package org.example.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Tester {
    public static void main(String[] args) {
        //old school
        int increment = incrementByOne(12);
        System.out.println(increment);

        //declarative approach
        Function<Integer, Integer> incrementByOneFunction = number->number+1;

        int increment2 = incrementByOneFunction.apply(10);
        System.out.println(increment2);

        Function<Integer,Integer> multiplyBy10Function = number->number*10;

        Function<Integer,Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction
                        .andThen(multiplyBy10Function)
                        .andThen(multiplyBy10Function);

        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction=
                (numberToIncrementByOne, numberToMultiplyBy)
                        -> (numberToIncrementByOne+1)*numberToMultiplyBy;

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(8,5));
    }

    static int incrementByOne(int number){
        return number+1;
    }
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number+1)*numToMultiplyBy;
    }
}
