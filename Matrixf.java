import java.util.Arrays;
import java.util.Random;

public class Matrixf {
    int size;
    int diagonal = 1;
    int summa = 0;
    int dif = 0;
    int matrix[][];

    private void randomFilling() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Random random = new Random();   
                matrix[i][j] = random.nextInt(1, 10);
            }
        }
    }

    public Matrixf(int size){
        this.size = size;
        matrix = new int[size][size];
        randomFilling();
    }

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

    public int summa () {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < j) {
                    summa += matrix[i][j];
                }
            }
        }
        return summa;
    }

    public int difference()
    {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i > j) {
                    dif -= matrix[i][j];
                }
            }
        }
        return dif;
    }

    public String toString () {
        return " " + 
            
            
            
            
            
            Arrays.deepToString(matrix).replace("]", "]\n").replace("[", "").replace("]", "").replace(",","");
    }
}
