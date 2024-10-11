package day05;

import java.util.*;

public class C03_odev {
    public static void main(String[] args) {

            /*
            icinde 200 tane farkli 1000'den kucuk pozitif tamsayi olan bir list olusturun
            kullanicidan bir sayi isteyip
            listede var olup olmadigini kullaniciya yazin
            */

        Random rnd = new Random();

        int sayi;

        List<Integer> mylist = new ArrayList<>();

       /* for (int i = 0; i < 200; i++) { //totelde 200 tane don
            sayi = rnd.nextInt(1000);

            if (!mylist.contains(sayi)) {
                mylist.add(sayi);
            }
        }
        System.out.println(mylist.size()); //178 ,180, 184*/

        //for dongusu kullandıgımızda dongu tam olarak 200 tane doner bu sansa baglı olarak random objeler ayni objeleri uretebilir
        // bundan kaynaklı olarak eleman sayısında degisiklik olabilir ama while dongusu istedigimiz kosula gore doner bundan dolayi tam 200 eleman olusur

        while (mylist.size() < 200) {
            sayi = rnd.nextInt(1000);

            if (!mylist.contains(sayi)) {
                mylist.add(sayi);
            }
        }
        System.out.println(mylist.size());
        Collections.sort(mylist);
        System.out.println(mylist);

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen listede kontrol etmek istediginiz sayiyi giriniz");

        sayi = input.nextInt();

        if (mylist.contains(sayi)) {
            System.out.println("Evet listede bu sayi bulunmaktadir");
        }else {
            System.out.println("Hayir listede bu sayi bulunmamaktadir");
        }


    }
}
