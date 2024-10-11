package day05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C07_DateTimeFormattir {
    public static void main(String[] args) {
        /*
        bu yapı bizim icin tarih ve saat objesini istedigimiz sekilde yazdırmayi saglar!!!!
      HH : mm ==> 24'lu saat sistemi
      hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
      hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
      HH : mm : ss ==> saniyeyi gosterir
      HH : MM ==> yanlis format cunku MM aylar icin kullanilir
      "mm" "minute" demektir. "MM" "month" demektir.
      y->year
      d->day

         */

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("     HH:mm☺ \nd.MMMM.yy☻");
        LocalDateTime tarihSaat = LocalDateTime.of(2024, 10, 7, 9, 12);
        System.out.println(dtf.format(tarihSaat));


    }
}