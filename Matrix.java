import java.util.Scanner;
import java.util.Random;

public class Matrix {
    static void main(String[] args) {
        Random random = new  Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int size = scanner.nextInt();
        
        int[][] matrix = new int[size][size];

        System.out.println("Начальная матрица:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(21)-10;
                if ((size - j) == 1){
                    System.out.println(matrix[i][j] + " ");
                }
                else{
                    System.out.print(matrix[i][j] + " ");
                }
            }

        }
    static void calculating(String[] args){
        
        int diagonalProizv = 1;
        int summa = 0;
        int raznost = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    diagonalProizv *= matrix[i][j];
                }
                if (i < j) {
                    summa += matrix[i][j];
                }
                if (i > j) {
                    raznost -= matrix[i][j];
                }
            }
        }
        System.out.println("Произведение элементов по диагонали: " + diagonalProizv);
        System.out.println("Сумма элементов в правом верхнем углу: " + summa);
        System.out.println("Разность элементов в левом нижнем углу: " + raznost);
    }
    }
}
