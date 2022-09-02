package day09_ternary;

import java.util.Scanner;

public class Pdf04_Sayfa14Soru03 {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alın ve sayının mutlak degerini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        double sayi=scan.nextDouble();

        System.out.println("Sayinin mutlak degeri : " + (sayi>=0 ? sayi : -1*sayi));

    }
}
