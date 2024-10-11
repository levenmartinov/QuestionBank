package day03;

public class C01_stringManipulation {
    public static void main(String[] args) {
        //Bir String' de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız
        String str="class ismini atarmısınız hocam";

        String bosStr="";
        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                bosStr+=str.charAt(i);
            }
        }
        System.out.println("sonuc : "+bosStr);
    }
}