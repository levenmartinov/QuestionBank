package day05;

import java.util.Arrays;

public class C04_odev {
    public static void main(String[] args) {
        // Integer[]array1={1,3,5,7,9};
        // String []array2={"Ali","Veli","Can","Huseyin","Omer"};
        // Double []array3={1.3,5.6,7.4,6.8,6.6,9.8,44.54,45.67,123.56,99.8};

        // Object[][]arrays={array1,array2,array3,{1,2,3,4}};
        // System.out.println(Arrays.deepToString(arrays));

         /*
         Asagidaki multi dimensional array'in
         ic array'lerindeki tum elemanlarin toplamini birer birer bulan
         ve herbir sonucu yeni bir array'in elemani yapan
         ve yeni array'i ekrana yazdiran bir program yaziniz
         Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
         */
        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7}};
        int[] yeniArray = new int[arr.length];
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int a : arr[i]) {
                toplam += a;
            }
            yeniArray[i] = toplam;
            toplam = 0;
        }
        System.out.println(Arrays.toString(yeniArray));


    }
}