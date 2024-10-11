package day01_variables;

import java.util.Scanner;

public class C06_ifStatements {
    public static void main(String[] args) {

        //if eger demektir else degilse demektir

        //Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        //1. adim scanner objesi olusturmak
        Scanner input = new Scanner(System.in);

        //2. adim kullaniciya bilgi vermek
        System.out.println("Lutfen bir tam sayi giriniz");

        //3. adim uygun bir kavanoza koyali
        int sayi = input.nextInt();

        //4. adim kontrol etmek
        if (sayi % 2 == 0) { //% bolumunden kalani verir
            System.out.println("Bir cift sayidir");
        } else {
            System.out.println("Bir tek sayidir");
        }

        //else if : degilse eger

        //Kullanicidan alinan bir sayinin pozitif,
        //negatif veya notr oldugunu kontrol eden kodu yaziniz

        //1. adim scanner objesi olusturmak fakat hali hazirda zaten bir tane bulunuyor
        // o zmn bir tane daha olusturmamiza gerek yok

        //2. adim bilgi ver ki bilgi alabil
        System.out.println("Lutfen bir sayi giriniz");

        //3. adim varible a atmak
        double number = input.nextDouble();

        //4. adim kotrol edelim!!!
        if (number > 0) {
            System.out.println("Bu sayi pozitiftir");
        } else if (number < 0) {
            System.out.println("Bu sayi negatiftir");
        } else {
            System.out.println("BU sayi noturdur!!!");
        }


    }
}
