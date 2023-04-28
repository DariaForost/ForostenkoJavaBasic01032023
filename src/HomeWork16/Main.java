package HomeWork16;

public class Main {
    public static void main(String[] args) {
        Smartphones androidPhone = new Androids();
        Smartphones iPhone = new iPhones();

        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        ((LinuxOS) androidPhone).openSource();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        ((iOS) iPhone).applePay();
    }
}
