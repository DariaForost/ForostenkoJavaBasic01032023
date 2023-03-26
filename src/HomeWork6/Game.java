package HomeWork6;

import java.util.Scanner; // імпорт сканера для використання класу Scanner; у данному варіанті є мінус з методами .nextLine та .nextInt, потрібно виводити прінт, якщо дані не підходять під Int чи Line

public class Game {
    public static void main(String[] args) {
        Scanner inConsole = new Scanner(System.in);  // оголосили назву змінної inConsole до класу Scanner

        System.out.print("Введіть ім'я першої команди: "); // ввід даних про першу команду
        String firstTeamName = inConsole.nextLine(); //зчитати назву першої команди з консолі

        int firstTeamScore = 0; // оголошення змінної, що зберігатиме суму балів першої команди
        for (int i = 1; i <= 5; i++) {
            System.out.print("Введіть кількість фрагів гравця " + i + " команди " + firstTeamName + ": ");
            firstTeamScore += inConsole.nextInt();  // зчитати к-кість фрагів з консолі
        }
        inConsole.nextLine(); // використовуємо цей метод, щоб очистити буфер введення

        System.out.print("Введіть ім'я другої команди: "); // ввід даних про другу команду
        String secondTeamName = inConsole.nextLine(); //зчитати назву другої команди з консолі

        int secondTeamScore = 0; // оголошення змінної, що зберігатиме суму балів другої команди
        for (int i = 1; i <= 5; i++) {
            System.out.print("Введіть кількість фрагів гравця " + i + " команди " + secondTeamName + ": ");
            secondTeamScore += inConsole.nextInt();
        }

        double firstTeamAverageScore = (double) firstTeamScore / 5; // середнє арифметичне по балах для кожної команди
        double secondTeamAverageScore = (double) secondTeamScore / 5;

        String winner; // визначення результатів
        int result;
        if (firstTeamAverageScore > secondTeamAverageScore) {
            winner = firstTeamName;
            result = firstTeamScore;
        } else if (firstTeamAverageScore < secondTeamAverageScore) {
            winner = secondTeamName;
            result = secondTeamScore;
        } else {
            System.out.println("Вітаємо, у вас нічия!");
            return; // закінчення
        }

        System.out.println("Атата, перемогла команда " + winner + " набрала " + result + " очків"); // виведення результатів
    }
}
