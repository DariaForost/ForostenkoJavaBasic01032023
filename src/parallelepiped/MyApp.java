package parallelepiped;
public class MyApp {
    public static void main(String[] args) {
        int ad = 10;
        int ab = 4;
        int ae = 7;
        int volume = ad * ab * ae;
        System.out.println("Volume of parallelepiped = " + volume);

        int length = 4 * (ad + ab + ae);
        System.out.println("Sum of lengths = " + length);
    }
}