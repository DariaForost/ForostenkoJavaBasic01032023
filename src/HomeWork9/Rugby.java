package HomeWork9;

import java.util.Random;
public class Rugby {
    public static void main(String[] args) {
        Random rand = new Random();

        int teamSize = 25;
        int minAge = 18;
        int maxAge = 40;
        int[] team1 = new int[teamSize];
        int[] team2 = new int[teamSize];

        System.out.println("Команда 1:");
        int sum1 = 0;
        for (int i = 0; i < teamSize; i++) {
            team1[i] = rand.nextInt(maxAge - minAge + 1) + minAge;
            System.out.print(team1[i] + " ");
            sum1 += team1[i];
        }
        System.out.println("\nСередній вік команди 1: " + (double) sum1 / teamSize);

        System.out.println("\nКоманда 2:");
        int sum2 = 0;
        for (int i = 0; i < teamSize; i++) {
            team2[i] = rand.nextInt(maxAge - minAge + 1) + minAge;
            System.out.print(team2[i] + " ");
            sum2 += team2[i];
        }
        System.out.println("\nСередній вік команди 2: " + (double) sum2 / teamSize);

    }
}