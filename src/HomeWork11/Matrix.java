package HomeWork11;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть кількість рядків (M): ");
        int m = input.nextInt();
        System.out.print("Введіть кількість стовпців/колонок (N): ");
        int n = input.nextInt();

        int[][] matrix = new int[m][n];  //оригінальна матриця
        int[][] transposedMatrix = new int[n][m]; //транспонована матриця

        System.out.println("Введіть елементи матриці:");
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                matrix[j][k] = input.nextInt();
            }
        }

        // транспонуємо матрицю
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                transposedMatrix[j][k] = matrix[k][j];
            }
        }

        // виводимо обидві матриці
        System.out.println("Матриця:");
        printMatrix(matrix);

        System.out.println("Транспонована матриця:");
        printMatrix(transposedMatrix);
    }

    // метод для друку матриці
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}