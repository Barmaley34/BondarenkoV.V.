package ru.vsuet.task1;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class UsingLambad {
    int size;
    int diagonal = 1;
    int summa = 0;
    int dif = 0;
    int matrix[][];

    void calc() {
        calculate(new BiFunction<Integer, Integer, Boolean>() {
            @Override
            public Boolean apply(Integer i, Integer j) {
                return Objects.equals(i ,j);
            }
        });
    }

    void calc1() {
        calculate(new BiFunction<Integer, Integer, Boolean>() {
            @Override
            public Boolean apply(Integer i, Integer j) {
                return Integer.valueOf(i)>Integer.valueOf(j);
            }
        });
    }

    void calc2() {
        calculate(new BiFunction<Integer, Integer, Boolean>() {
            @Override
            public Boolean apply(Integer i, Integer j) {
                return Integer.valueOf(i)<Integer.valueOf(j);
            }
        });
    }

    void calculate(BiFunction<Integer,Integer, Boolean> condition) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (condition.apply(i, j)){

                }
            }

        }
    }
}