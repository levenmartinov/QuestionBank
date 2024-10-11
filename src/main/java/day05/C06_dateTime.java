package day05;

import java.time.LocalDate;
import java.util.Scanner;

public class C06_dateTime {
    public static void main(String[] args) {

        /*
        LocalDate->tarih objesi olusturmayi saglar
        LocalDateTime-> hem tarih hem saat objesi olusturmayi saglar
        LocalTime->saat objesi olusturmayi saglar
        icerisinde tarih ve saat icin gerekli methodlar bulunur
        DateTimeFormattir-> tarih ve saat objelerini istedigimiz formatta yazdırmayi saglar
        java'da normal kosullarda tarih objesi yıl/ay/gün olarak yazdılır
        biz istersek bunu formattir classımız ile degistirebiliriz
        */

           /*
       soru 1)
       -bugunun tarihini obje olusturarak yazdirin
       -bugun yilin kacinci gunu oldugunu yazdirin
       -hangi gunde oldugumuzu yazdirin
       -yılın bitmesine kac gun kaldıgını yazdırın
       -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
       -bugunden itibaren 2yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
       -bugunden itibaren 7yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
       -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
            */

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih); //2024-10-10

        System.out.println(tarih.getDayOfYear()); //284
        System.out.println(tarih.getDayOfWeek()); //THURSDAY

        //1. yol
        if (tarih.isLeapYear()){
            System.out.println(366 - tarih.getDayOfYear());
        }else {
            System.out.println(365 - tarih.getDayOfYear()); //82
        }

        //2.yol
        System.out.println(tarih.lengthOfYear() - tarih.getDayOfYear()); //82

        System.out.println("Stt : " + tarih.plusYears(3).plusMonths(5).plusDays(7)); //Stt : 2028-03-17

        System.out.println(tarih.plusYears(2).plusMonths(2).plusDays(2).getDayOfMonth()); //12

        System.out.println(tarih.plusYears(7).plusMonths(7).plusDays(7).getDayOfWeek()); //MONDAY

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz tarihin Gun bilgisini giriniz");

        int day = input.nextInt();
        System.out.println("Lutfen olusturmak istediginiz tarihin Ay bilgisini giriniz");

        int month = input.nextInt();
        System.out.println("Lutfen olusturmak istediginiz tarihin Yil bilgisini giriniz");

        int year = input.nextInt();
        LocalDate yeniTarih = LocalDate.of(year, month, day);
        System.out.println(yeniTarih);

        if (tarih.isBefore(yeniTarih)) {
            System.out.println(tarih);
        } else if (tarih.isAfter(yeniTarih)) {
            System.out.println(yeniTarih);
        }else {
            System.out.println("Bu iki tarih bir biri ile aynidir");
        }


        //soru 2)
        //-suanin saatini dakikasini ve saniyesini bize dondurun
        //-suanin saniyesini bize dondurun
        // -10000 saniye sonrasini bize dondurun
        //-200 dakika onceki saati bize dondurun
        //-bize saati 3 yapip yazdirin(dakika ve saniye degismeden)
        //Odev!!!!

        ///*
        //        soru 3)
        //        bize bugunun tarihini ve su anki saati dondurun
        //        bize 3 ay 100 saat sonraki tarih ve saati dondurun
        //        bize 100 gun once 100 saat sonraki tarihi dondurun
        //        bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
        //        bize sadece bugunun tarihi dondurun
        //        LocalDateTime kullanarak yapın tum hepsini
        //         */
        // Odev!!!

    }
}
