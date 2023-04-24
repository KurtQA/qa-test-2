package b151practices;

public class Q02_KullaniciBilgileri {


       /*
    first name, last name, age, height ve weight değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
         First Name: ...
         Last Name: ...
         Age: ...
         Height: ...
         Weight: ...
    Not: Sadece bir adet "System.out.println(); kullanınız.
    */

    public static void main(String[] args) {
        String firstName = "Ali";
        String lastName = "Can";
        int age = 12;
        double height = 1.4;
        double weight = 43.5;

        System.out.println("First Name:" + firstName + "Last Name:" + lastName + "Age:" + age + "Height:" + height + "Weight:" + weight);
        System.out.println("First Name:" + firstName + "\nLast Name:" + lastName + "\nAge:" + age + "\nHeight:" + height + "\nWeight:" + weight);
        System.out.println("First Name:" + firstName + "Last Name\n:" + lastName + "Age\n:" + age + "Height:" + height + "Weight:" + weight);
     int numberOfSchools = 24;
     double metreOfRooms = 75.8;
     String nameOfSchool = "Ali Pasa";
     char initial = 'A';
     boolean isClosed = false;
        System.out.println("numberOfSchools: " + numberOfSchools + "\nmetreOfRooms:" + metreOfRooms + "\nnameOfSchool:" + nameOfSchool + "\ninitial:" + initial + "\nisClosed:" + isClosed );


    }
}

