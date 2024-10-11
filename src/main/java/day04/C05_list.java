package day04;

import java.util.ArrayList;

public class C05_list {
    public static void main(String[] args) {
         /*
        soru 1) bir list olusturup eleman ekleyin ve yazdirin
        */
        ArrayList<Integer>mylist=new ArrayList<>();
        mylist.add(3);
        mylist.add(5);
        mylist.add(7);
        mylist.add(9);
        mylist.add(11);
        mylist.add(13);
        mylist.add(15);
        mylist.add(17);
        mylist.add(2,6);
        System.out.println(mylist);

    }
}