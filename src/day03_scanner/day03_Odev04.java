package day03_scanner;

import java.util.Scanner;

public class day03_Odev04 {
    public static void main(String[] args) {
        /* Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
prizmanin hacmini hesaplayip yazdirin
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenler prizmasının kısa kenar, uzun kenar ve yuksekligini giriniz");
        double kisaKenar=scan.nextDouble();
        double uzunKenar=scan.nextDouble();
        double yukseklik= scan.nextDouble();
        System.out.println("Dikdortgenler prizmasinin hacmi : "+kisaKenar*uzunKenar*yukseklik);
    }
}
