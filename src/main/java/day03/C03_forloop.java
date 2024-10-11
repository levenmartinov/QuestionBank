package day03;

import java.util.Scanner;

public class C03_forloop {
    public static void main(String[] args) {
        // kullanicidan 10'dan kucuk bir tam sayi isteyin ve girilen sayinin faktoryelini bulun.
        //1.adım
        Scanner input=new Scanner(System.in);
        //2.adım
        System.out.println("Lütfen 10'dan kucuk bir tam sayi giriniz");
        //3.adım
        byte sayi= input.nextByte();
        //4.adım nedir?
        int carpim=1;
        if (sayi<0||sayi>10){
            System.out.println("lütfen gecerli bir sayi giriniz");
        }else {
            for (int i = sayi; i >1 ; i--) {
                carpim*=i;
                System.out.println(carpim);
            }}

    }
}