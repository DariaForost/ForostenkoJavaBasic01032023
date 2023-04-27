package HomeWork14;

import java.time.LocalDate;

public class FitnessTracker {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;
    private int weight;
    private String bloodPressure;
    private int stepsPerDay;
    private int age;

    public FitnessTracker(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String email, String phoneNumber, int weight, String bloodPressure, int stepsPerDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsPerDay = stepsPerDay;
        calculateAge();
    }

    private void calculateAge() {
        this.age = 2020 - dateOfBirth.getYear();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getWeight() {
        return weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public void printAccountInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Weight: " + weight);
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Steps per Day: " + stepsPerDay);
        System.out.println("Age: " + age);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("Люся", "Денисенко", 1985, 6, 15, "lus85@gmail.com", "098-7878787", 80, "120/80", 5000);
        FitnessTracker user2 = new FitnessTracker("Петро", "Чародійко", 1990, 3, 28, "pet90@gmail.com", "066-5858585", 65, "110/70", 10000);
        FitnessTracker user3 = new FitnessTracker("Марк", "Ідейко", 1972, 12, 10, "mark72@gmail.com", "096-3332468", 90, "130/90", 2000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        user1.setWeight(180);
        user2.setStepsPerDay(6000);
        user3.setBloodPressure("120/80");

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}
