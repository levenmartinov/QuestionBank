package day03;

public class C07_Odev {
    public static void main(String[] args) {
        /*
         *
         * *
         *****
         *     *
         *       *
         */
        int satir = 5;
        for (int bulSatir = 1; bulSatir <= satir; bulSatir++) {
            for (int bosluk = satir - bulSatir; bosluk > 0; bosluk--) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= bulSatir * 2 - 1; yildiz++) {
                if (yildiz == 1 || yildiz == bulSatir * 2 - 1 || bulSatir == satir / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        // E harfi odev
    }
}