package day03;

public class C02_forloop {
    public static void main(String[] args){

          /*
         soru 1) belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
           */
        int sayi=6;
        /*
        1 * 6 = 6
        2 * 6 = 12
        ...
        10 * 6 = 60
         */
        //for (int i = 1; i <11 ; i++) {
        //    System.out.println(i+" * "+ sayi +" = "+i*sayi);
        //}

        //Güncelleme lütfen 10x10lük bir carpim tablosunu olusturunuz
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i+" * "+ j +" = "+i*j+"   |  ");

            }
            System.out.println();
        }

    }
}