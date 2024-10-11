package day01_variables;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {

        //Kullanicidan yaricap isteyip cemberin cevresini ve
        //dairenin alanini hesaplayip yazdirin cevre formulu 2πrdir
        //(pi sayisini 3 alabilirsiniz)dairenin alani ise π r²dir(pi sayisini 3 alabilirsiniz)

        //1. adim scanner objesi olusturma
        Scanner input = new Scanner(System.in);

        //2. adim kullanicidan bilgi almak icin bilgi vermeliyiz
        System.out.println("Lutfen hesaplamak istediginiz dairenin yari capini giriniz ");

        //3. adim aldigimiz bilgiyi bir kavanoza (variable) koymamiz gerekiyor
        double r = input.nextDouble();

        //4. adim hesaplama islemi yapicaz
        System.out.println("Cevre = " + 2 * Math.PI * r);
        System.out.println("Alani = " +Math.PI * Math.pow(r,2)); //("Alani = " +3 * r * r)
        System.out.println("Çevre = "+String.format("%.2f",2*Math.PI*r));

    }
}
