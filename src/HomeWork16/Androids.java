package HomeWork16;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Making a call on an Android phone");
    }

    @Override
    public void sms() {
        System.out.println("Sending an SMS on an Android phone");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on an Android phone");
    }

    @Override
    public void openSource() {
        System.out.println("Using open source software on an Android phone");
    }
}
