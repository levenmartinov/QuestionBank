package day04;

public class C08_list {
    public static void main(String[] args) {
        //2) bir listedeki elemanlardan 5'e tam bolunenleri yazdiran bir method olusturun
        int[] sayi={454,212,83,0,47,5555,25,33,17,7,3,9,67,-93,-54};
        besebolunenleriYazdir(sayi);

    }
    public static void besebolunenleriYazdir(int[] sayi){
        for (int a:sayi) {
            if (a%5==0){
                System.out.println(a);
            }
        }
    }
}