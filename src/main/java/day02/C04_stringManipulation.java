package day02;

public class C04_stringManipulation {
    public static void main(String[] args) {

        /*
        Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
        */

        //1. adim
        String isim1 = "Ali Can";
        String isim2 = "Omer Faruk Can";
        String isim3 = "Veli Can";

        isim1 = isim1.replace(" ", "");
        System.out.println("isim1 = " + isim1);

        isim2 = isim2.replace(" ", "");
        System.out.println("isim2 = " + isim2);

        isim3 = isim3.replace(" ", "");
        System.out.println("isim3 = " + isim3);

        int length1 = isim1.length();
        int length2 = isim2.length();
        int length3 = isim3.length();

        System.out.println("Can ailesinin isimlerinin toplam harf sayisi : " + (length1 + length2 + length3));

    }
}
