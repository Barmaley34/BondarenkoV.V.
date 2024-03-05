package ru.vsuet.task1;

import java.util.Random;

public class Matrix {
    Random random = new Random();
    int[][] matrix;
    int size;

    public Matrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];
    }

    int diagonal = 1;
    int summa = 0;
    int dif = 0;

    public int diagonalProizv() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    diagonal *= matrix[i][j];
                }
            }
        }
        return diagonal;
    }

    public int summa() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < j) {
                    summa += matrix[i][j];
                }
            }
        }
        return summa;
    }

    public int difference() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i > j) {
                    dif -= matrix[i][j];
                }
            }
        }
        return dif;
    }

    public void printMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(10) - 10;
                if ((size - j) == 1) {
                    System.out.println(matrix[i][j] + " ");
                } else System.out.print(matrix[i][j] + " ");
            }
        }
    }


}
