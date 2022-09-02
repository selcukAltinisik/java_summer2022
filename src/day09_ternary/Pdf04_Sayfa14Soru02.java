package day09_ternary;

import java.util.Scanner;

public class Pdf04_Sayfa14Soru02 {
    public static void main(String[] args) {
        // Kullanıcıdan bir tam sayı alın ve
        // sayının tek veya çift olduğunu yazdırın.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi=scan.nextInt();

        System.out.println("Girdiğiniz sayi : " + ((sayi%2==0) ? "Çift bir sayıdır." : "Tek bir sayidir."));



    }
}
