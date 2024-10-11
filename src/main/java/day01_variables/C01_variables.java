package day01_variables;

public class C01_variables {
    public static void main(String[] args) {

        /*
        2 tanedirler primitive ve non-primitive olmak üzere icerisinde kücük degerler saklanır
        pasif özellikler
         */

        /*
        Not 1 : primitive data type'larini java tarafında olusturulmustur, biz olusturamayiz
        Not 2 : primitive data type'larinin isimlerinin tüm harfleri kücük harften olusur
        Not 3 : primitive data type'lar her biri memory(Hafıza)'da farklı yer kaplar
        Not 4 : primitive data type'lar sadece icine atanan degeri korur başka bir iş yapmaz

        Tam Sayilar:
        byte
        short
        int
        long

        Ondalıklı Sayilar:
        double
        float

        Karakter icin:
        char

        Mantıksal operator:
        boolean

        */

        //iki sayinin toplamini yeni bir degere atayanizi ve yazdiriniz

        int a = 75;
        double b = 86.7;
        double toplam = a + b;

        //eger ondalıklı sayi ile işlem yapılıyorsa double dondurur
        //eger tam sayilarla işlem yapıyorsa int dondurur
        //byte x=5;
        //byte y=10;

        //byte sum=x+y;

        System.out.println("Toplam = " + toplam); //161.7

        //------------------------------------------------
        //ayni sayilari toplayip sadece tam kismini alin

        int toplam2 = a + (int) b;
        System.out.println("toplam2 = " + toplam2); //161

        double c = 44.7;
        double d = 55.8;

        int toplam3 = (int) c + (int) d;
        System.out.println("toplam3 = " + toplam3);//99

        int toplam4 = (int) (c + d);
        System.out.println("toplam4 = " + toplam4);//100

        double toplam5 = c + d;
        System.out.println("toplam5 = " + toplam5);//100.5

        int toplam6 = (int) toplam5;
        System.out.println("toplam6 = " + toplam6);//100



    }
}
