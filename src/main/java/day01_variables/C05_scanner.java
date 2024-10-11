package day01_variables;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {

        //Soru : Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini(uzun*kısa*yukselik) hesaplayip yazdirin

        //1. adim scanner ogjesi olusturmak
        Scanner input = new Scanner(System.in);


       // //----------------------------------
       //  */
       // //1. yol
       // //2. adim kullaniciya bilgi vermek
       // System.out.println("Lutfen hesaplamak istediginiz dikdortgenin uzun kenerini giriniz ");
//
       // //3. adim bir variabl e atmak
       // double uzunKenar = input.nextDouble();
//
       // //2. adima tekrar donuyoruz ve tekrar bilgi
       // System.out.println("Lutfen hesaplamak istediginiz dikdortgenin kisa kenerini giriniz ");
//
       // //3. adim bir variabl e atmak
       // double kisaKenar = input.nextDouble();
//
       // //2. adim kullaniciya bilgi vermek
       // System.out.println("Lutfen hesaplamak istediginiz dikdortgenin yuksekligi giriniz ");
//
       // //3. adim bir variabl e atmak
       // double yukseklik = input.nextDouble();
       //

        //4. adim heseplayip yazdirmak
        //System.out.println("Hacmi = " + uzunKenar * kisaKenar * yukseklik);

        //2.yol
        System.out.println("Lütfen sırasıyla kısa , uzun kenarı ve yukselikligi giriniz : ");
        double kisaKenar= input.nextDouble();
        double uzunKenar= input.nextDouble();
        double yukseklik= input.nextDouble();
        System.out.println("Hacmi = "+uzunKenar*kisaKenar*yukseklik); //Hacmi = 187650.0

    }
}
