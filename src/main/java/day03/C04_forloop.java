package day03;

public class C04_forloop {
    public static void main(String[] args) {
        /*

        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .

        */
        int satir=10;

        for (int bulunSatir = 1; bulunSatir <=satir ; bulunSatir++) {
            for (int yildiz = satir-bulunSatir; yildiz>0 ; yildiz--) {
                System.out.print("* ");
            }
            for (int nokta = bulunSatir; nokta >0 ; nokta--) {
                System.out.print(". ");
            }

            System.out.println();

        }
        /*
         *
         * *
         *****
         *     *
         *       *
         */



    }
}