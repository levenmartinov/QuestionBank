package day04;

import java.util.Arrays;

public class C01_arrays {
    public static void main(String[] args) {
    /*
    1.soru bir array olusturun ve olusturdugunuz arraydeki
    tum elemanları yazdırın
    */
        String[] isimler={"Züleyha","Ummuhan","Alper","Melek","Yuşa","Neslihan","Ali Can"};
        System.out.println(Arrays.toString(isimler));//Arrays classı yardımcı class
        for (String s:isimler) {
            System.out.println(s);
        }

    }
}