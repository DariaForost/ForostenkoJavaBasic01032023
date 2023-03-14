package parallelepiped;
public class MyApp {
    public static void main(String[] args) {
        int ad = 10;
        int ab = 4;
        int ae = 7;
        int volume = ad * ab * ae;
        System.out.println("Volume of parallelepiped = " + volume);

        int length1 = (ad * 2) + (ae * 2);
        int length2 = (ab * 2) + (ae * 2);
        int length3 = (ab * 2) + (ad * 2);
        int length;
        length = (length1 * 2) + (length2 * 2) + (length3 * 2);
        System.out.println("Sum of lengths = " + length);
    }
}