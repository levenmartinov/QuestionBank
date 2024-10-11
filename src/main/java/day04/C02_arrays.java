package day04;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        /*
 2.soru bir array olusturun ve
 olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
*/

        int[] sayi={454,212,83,0,47,5555,25,33,17,7,3,9,67,-93,-54};
        //kendi sıralamısını yapan bir method olusturun
        Arrays.sort(sayi);
        System.out.println(Arrays.toString(sayi));
    }
}
