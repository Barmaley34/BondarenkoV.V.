package ru.vsuet.list;

import java.util.function.Predicate;

public interface IList {

    void add(int value);
    void add(int idx, int value);
    int get(int idx);
    void remove(int idx);
    void remove(Predicate<Integer> condition);

    int size();
}
