package b151practices;

public class Q03_Ortalama {

/*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;
       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */

    public static void main(String[] args) {
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;
        double ortalama = (num1+num2+num4+num5)/5;
        System.out.println("ortalama = " + ortalama);

        /*

       int room1 = 23;
       int room2 = 24;
       int room3 = 12;
       int room4 = 450;
       int room5 = 23000;
       Bu sayilarin toplaminin yarisini alan bir kod yazin.

         */
        int room1 = 23;
        int room2 = 24;
        int room3 = 12;
        int room4 = 450;
        int room5 = 23000;
        int toplaminYarisi = (room1+room2+room3+room4+room5)/2;
        System.out.println("toplaminYarisi= " + toplaminYarisi);
        System.out.println("toplaminYarisi= " + toplaminYarisi + "degerini verdi");
        System.out.println(toplaminYarisi);


    }
}
