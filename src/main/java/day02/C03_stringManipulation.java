package day02;

import java.util.Scanner;

public class C03_stringManipulation {
    public static void main(String[] args) {
          /*
    Kullanicidan email adresini girmesini isteyin,
    mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
    @gmail.com ile bitiyorsa "Email adresiniz kaydedildi"
    @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
    odev!! bosluk karakteri varsada hata mesaji verin//ne zaman yapılcagi
*/

        //1. adım
        Scanner input =new Scanner(System.in);
        //2. adım
        System.out.println("Lütfen bir email adresi giriniz ☻");
        //3. adım
        String email=input.nextLine();
        System.out.println("email = " + email);

        //4. adım
        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");
        }else if (email.contains(" ")) {
            System.out.println("email bosluk karakteri iceremez");
        }else if (email.split("@")[0].length()==0){
            System.out.println("Lütfen yazımı kontrol ediniz");
        }else if (email.endsWith("@gmail.com")){
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lütfen yazimi kontrol ediniz");
        }

    }
}