package day01_variables;

import java.util.Scanner;

public class C07_ifStatements {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin.
        // 50’den kucukse "D",
        // =50  <60 arasi "C",
        // =60  <80 arasi "B",
        // =80’nin uzerinde ise "A"

        //1. adım scanner objesi olusturmak
        Scanner input = new Scanner(System.in);

        //2. adim olarak kullaniciya bilgi vermek
        System.out.println("Lutfen 100 uzerinden notunuzu giriniz");

        //3. adim olarak uygun bir variable atama islemi
        float not = input.nextFloat();

        //4. adim kontrol etmek
        if (not < 0 || not > 100) {
            System.out.println("Lutfen gecerli bir not giriniz!!!");
        } else if (not < 50) {
            System.out.println("D");
        } else if (not < 60) {
            System.out.println("C");
        } else if (not < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }


    }
}
