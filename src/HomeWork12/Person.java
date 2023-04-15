package HomeWork12;

public class Person {
        public String personInfo(String firstName, String lastName, String city, String phone) {
            String info = "Зателефонувати громадянину " + firstName + " " + lastName + " із міста " + city + " можна за номером " + phone + ".";
            return info;
        }

        public static void main(String[] args) {
            Person person = new Person();

            String person1 = person.personInfo ("Will", "Smith", "New York", "2936729462846");
            String person2 = person.personInfo("Jackie", "Chan", "Shanghai", "12312412412");
            String person3 = person.personInfo("Sherlock", "Holmes", "London", "37742123513");

            System.out.println(person1);
            System.out.println(person2);
            System.out.println(person3);
        }
    }
