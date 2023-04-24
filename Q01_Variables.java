package b151practices;

public class Q01_Variables {

    public static void main(String[] args) {

        //bir variable baslat
        int age = 32;
        int number = 55;
        System.out.println(age);
        System.out.println("number = " + number);
        String isim = "Ahmet";
        System.out.println("isim = " + isim);
        System.out.println("Ahmet");
        //variable degerini kopyala
        int hisAge = age;
        System.out.println(hisAge);
        //ayni satirda coklu variable deklere et
        int year =2022, month = 4, day = 12;
        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);
        System.out.println(year+month+day);
        System.out.println(year+" "+month+" "+day);
        //bir variable degerini guncelle
        year = 2023;
        System.out.println("year = " + year);
        age = 19;
        System.out.println(age);
        year = 2020+5;
        System.out.println("year = " + year);
        //bir variable deklere et :  x
        double x;
         //bir variable baslat : y
        double y = 10.23;
        //bir baska variable baslat: z
        short z = 345;
        //x degiskenini y degiskeni ile baslat
        x = y;

        //x degiskenini guncelle
        x=3.14;
        //degiskenleri yazdir
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }
}