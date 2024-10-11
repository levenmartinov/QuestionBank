package day01_variables;

import java.util.Scanner;

public class C08_nestedIf {
    public static void main(String[] args) {

        // bir kisinin kan bagisinda bulunup bulunamayacigini kontrol ediniz .
        // yas:18 ve uzeri olmali
        // kilo : 50 dan ust olmali

        //1. adim scanner objei olusturmak
        Scanner input = new Scanner(System.in);

        //2. adim bilgi verelim
        System.out.println("Lutfen yasinizi giriniz");

        //3. adim yas biligini bir variable atayalim
        short yas = input.nextShort();

        //4. adim olarak once yas kontrolu
        if (yas >= 18) {
            System.out.println("Lutfen kilonuzu giriniz");
            float kilo = input.nextFloat();
            if (kilo > 50) {
                System.out.println("Lutfen kan vermek icin formu doldurunuz .....");
            }else {
                System.out.println("sağlığınız açısından kan vermek için kilonuz yeterli değildir");
            }
        } else
            System.out.println("Lutfen " + (18 - yas) + " yil sonra geliniz");

    }
}
