package day02;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {

            /*
            Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
            değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
            Sesli harfler: a,e,i,o,u
            */

        //1. adim
        Scanner input = new Scanner(System.in);

        //2. adim
        System.out.println("Lutfen kontrol etmek istediginiz harfi giriniz : ");

        //3. adim
        String harf = input.nextLine().toLowerCase();

        //4. adim kontrol edicez!!!
        harf = harf.replaceAll("[^a-z]", "*");
        harf = harf.replaceAll("[aeiou]", "a");

        if (harf.contains("*") || harf.length() != 1) { //--> kesinlikle harf disinda bir yapidir
            System.out.println("Hatalidir");
        } else {
            //sesli mi sessiz mi diye control edicez
            if (harf.equals("a")) {
                System.out.println("Sesli harftir");
            } else {
                System.out.println("Sessiz harftir");
            }

        }

        //ternary'e cevirme
        String sonuc = harf.contains("*") || harf.length() != 1?
                ("Girdiginiz karakter gecersizdir")
                :
                (harf.equals("a") ?
                        "Sesli harftir" //True kodu
                        :
                        "Sessiz harftir" //false kodu
                ); //false kodu
        System.out.println("sonuc = " + sonuc);

    }
}
