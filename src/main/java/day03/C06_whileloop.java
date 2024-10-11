package day03;

import java.util.Scanner;

public class C06_whileloop {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar pozitif sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin
        //1.adım
        Scanner input=new Scanner(System.in);
        //2.adım
        int toplam=0;
        do{
            System.out.println("Lütfen toplamak istediginiz sayilari giriniz");
            int sayi= input.nextInt();
            toplam+=sayi;
        }while (toplam<500);
        System.out.println("artik yeter cok sayi girdin, toplam "+toplam+ " oldu");


        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        // odev!!!kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin

    }
}