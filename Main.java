package ru.vsuet.list;

public class Main {

    public static void main(String[] args) {
        IList list = new ILinkedList();
        list.add(10);
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(12);
        list.add(15);

        System.out.println(list);

        list.remove(4);
        System.out.println(list);

        list.remove(x -> x < 5);
        System.out.println(list);

        System.out.println("Size=" + list.size());
    }
}
