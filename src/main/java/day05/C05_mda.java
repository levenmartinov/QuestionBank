package day05;

public class C05_mda {
    public static void main(String[] args) {

         /*
        Verilen bir multi dimensional array'in
        her array'ini ayri ayri ele alarak inner indexindeki elamanlarinin ortalamasından
        büyük elemanlari yazdıran bir kod yazınız.
         */

        int sayilar[][] = {{8, 57, 37}, {99, 88, 11}, {32, 34, 15, 12}, {2, 3, 5, 1}};

        double toplam = 0;
        double ort = 0;

        for (int[] a : sayilar) { //toplami bulmak icin olusturdugumuz for dongusu

            for (int w : a) { //kontrol amacli olusturuldu
                toplam += w;
            }
            ort = toplam / a.length;
            System.out.println("Bu array'deki ort :" + ort);

            for (int w : a)
                if (w > ort){
                    System.out.println("Bu sayi ortalmadan buyuktur : " + w);
                }
            toplam = 0;
            ort = 0;
            System.out.println("Siradaki arraye gecis yapilmistir");
        }

    }
}
