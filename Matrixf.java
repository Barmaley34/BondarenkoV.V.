package ru.vsuet.task1;

import java.util.Random;
import java.util.Scanner;
public class Matrix{
    int diagonalProizv = 1;
    int summa = 0;
    int difference = 0;
    public void creatMatrix(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер квадратичной матрицы ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

    public void matrix(int[][] matrix){
        this.matrix = matrix;
    }
    public void printMatrix() {
        System.out.println("Введите размер квадратичной матрицы ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(10) - 10;
                if ((size - j) == 1) {
                    System.out.println(matrix[i][j] + " ");
                } else System.out.print(matrix[i][j] + " ");
            }
        }
    }
    public int diagonalProizv() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    diagonalProizv *= matrix[i][j];
                }
            }
        }
    }
    public int summa() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < j) {
                    summa += matrix[i][j];
                }
            }
        }
    }
    public int difference()
    {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i > j) {
                    difference -= matrix[i][j];
                }
            }
        }
    }

}
