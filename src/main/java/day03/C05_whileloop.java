package day03;

import java.util.Scanner;

public class C05_whileloop {
    public static void main(String[] args) {
       /*
      ternary-> kaç defa donecegi belli mi ? for : (en az bir kere calismasi gerekli mi ? do-while : while);
       while ile cozulen soruların bir cogu do while ilede cozulebilir fakat güvenlik acigi olusabilir!!!

        */
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin
        //1. adım
        Scanner input=new Scanner(System.in);
        //2. adım
        int sayi;
        int toplam=0;
        do {
            //3.adım bilgi verdim
            System.out.println("lütfen toplamak istediginiz sayilari giriniz siz 0'a basıncaya kadar toplamaya devam edicek");
            sayi= input.nextInt();
            toplam+=sayi;
        }while (sayi!=0);
        System.out.println("toplam = " + toplam);

    }
}