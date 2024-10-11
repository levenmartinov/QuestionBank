package day01_variables;

public class C02_concatination {
    public static void main(String[] args) {

        //Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        //Java da "+" sembolu iki String veya bir String ve bir sayi arasinda kullanilirsa "concatenation" islemi olur
        //"concatenation" islemi birlestirme yapar
        //Not: Concatenation islemlerinde Java matematikteki islem onceligini kullanir
        //Java daima yukarıdan asagıya ve soldan sag dogru ilerler islemleri yapar

        /*
        matematikteki islem oncelikleri :
        1)parantez ici islemleri yapar
        2)us alma islemleri yapılır
        3)carpma ve bolme islemleri
        4)toplama ve cıkarma islemleri
        5)eger ayni oncelige sahipse soldan saga dogru islemler sirasiyla yapılır.
         */

        String ifade1 = "Ali Can ";

        char ifade2 = '?';

        String ifade3 = "topu bana ";

        String ifade4 = " kere atar mısın";

        int ifade5 = 1;

        //yukarıdaki ifadelerle anlamlı bir cumle olusturalım

        System.out.println(ifade1 + ifade3 + ifade5 + ifade4 + ifade2);


    }
}
