package day02;

import java.util.Scanner;

public class C05_forloops {
    public static void main(String[] args) {

        /* Kullanicidan 100'den kucuk bir pozitif tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk pozitif bir tam sayi giriniz");

        byte sayi = input.nextByte();

        if (sayi < 0 || sayi > 100) {
            System.out.println("Lutfen 100'den kucuk bir pozitif tam sayi giriniz");
        }
        for (int i = 1; i <= sayi; i++) {

            if (i % 3 == 0) {

            }
            System.out.print(i + " ");

        }




    }
}
