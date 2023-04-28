package HomeWork16;

public class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("Making a call on an iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Sending an SMS on an iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on an iPhone");
    }

    @Override
    public void applePay() {
        System.out.println("Using Apple Pay on an iPhone");
    }
}
