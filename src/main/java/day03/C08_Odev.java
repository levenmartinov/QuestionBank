package day03;

import java.util.Random;
import java.util.Scanner;

public class C08_Odev {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        // odev!!!kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin
        Random rnd=new Random();
        int rndsayi=rnd.nextInt(101);//bu sayıyı bilgisayar kendisi uretiyor

        Scanner input=new Scanner(System.in);
        int tahminHakki=5;
        while (tahminHakki>0){
            System.out.println("Lütfen tahminde bulunmak icin 1-100 arasında bir sayi giriniz : ");
            int number=input.nextInt();
            if (rndsayi>number){
                System.out.println("lütfen daha büyük bir sayi giriniz");
            } else if (rndsayi<number) {
                System.out.println("Lütfen daha küçük bir sayi giriniz");
            }else {
                System.out.println("Tebrikler doğru tahminde bulundunuz ☺");
                break;
            }
            tahminHakki--;
            System.out.println("Kalan tahmin hakkınız : "+tahminHakki);
            if (tahminHakki==0){
                System.out.println("Tahmin hakkınız bitmiştir yeni 3 tahmin hakkı icin 100 coin vermek ister misiniz" +
                        " \nevet icin 'e' \nhayır icin 'h'");
                String str=input.next();
                if (str.equals("e")){
                    tahminHakki+=3;
                }else {
                    System.out.println("Görüşmek üzere tekrar bekleriz ♥");
                }
            }
        }


    }
}