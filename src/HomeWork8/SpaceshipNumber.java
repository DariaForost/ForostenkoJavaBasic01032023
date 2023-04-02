package HomeWork8;

public class SpaceshipNumber {
    public static void main(String[] args) {

        int count = 0;
        for (int s = 1; s <= 100; s++) {
            if (s % 10 != 4 && s % 10 != 9 && s / 10 != 4 && s / 10 != 9) {
                System.out.println("Космічний шатл " + s);
                count++;
            }
        }
        System.out.println("Усього знайдено " + count + " шатлів без нещасливих чисел.");
    }
}