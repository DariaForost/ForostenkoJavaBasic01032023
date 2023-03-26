package HomeWork7;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(11); // вибираємо випадкове число від 0 до 10, де 11 - межа
        int numberOfGuess = 0;

        System.out.println("Я загадав число від 0 до 10. У Вас є 3 спроби, аби вгадати.");

        while (numberOfGuess < 3) { // доки є спроби
            System.out.print("Введіть число: ");
            int guess = input.nextInt();
            numberOfGuess++;

            if (guess == randomNumber) {
                System.out.println("Вау, Ви відгадали число " + randomNumber + " за " + numberOfGuess + " спроб.");
                return;
            }
        }

        System.out.println("На жаль, Ви не вгадали із 3-х спроб. Я загадав число " + randomNumber);
    }
}
