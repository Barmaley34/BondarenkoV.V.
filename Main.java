package ru.vsuet.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Matrix matrix1 = new Matrix(size);
        matrix1.printMatrix();
        System.out.println("Произведение главной диагонали: " + matrix1.diagonalProizv());
        System.out.println("Сумма верхнего треугольника: " + matrix1.summa());
        System.out.println("Разность нижнего треугольника: " + matrix1.difference());
    }
}
