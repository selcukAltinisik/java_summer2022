package day12_stringManipulations;

import java.util.Scanner;

public class Pdf06_Sayfa24Soru04 {
    public static void main(String[] args) {
        /*Soru 4) Kullanicidan isim ve soyismini isteyin ve
        hangisinin daha uzun oldugunu yazdirin.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz : ");
        String isim=scan.nextLine();
        System.out.print("Lütfen soyisminizi giriniz : ");
        String soyisim=scan.nextLine();

        System.out.println(isim.length()>soyisim.length() ? "İsminiz karakter sayısı bakımından soyisminizden daha uzundur." :
                                                            "Soyisminiz karakter sayısı bakımından isminizden daha uzundur.");
    }
}
