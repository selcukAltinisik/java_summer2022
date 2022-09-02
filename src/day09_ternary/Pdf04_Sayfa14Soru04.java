package day09_ternary;

import java.util.Scanner;

public class Pdf04_Sayfa14Soru04 {
    public static void main(String[] args) {

        //  Kullanicidan bir sayi alin
        //  Sayi pozitifse "Sayi pozitif" yazdirin,
        //  negatifse sayinin karesini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        double sayi=scan.nextDouble();

        System.out.println(sayi>=0 ? "Sayı pozitiftir" : "Sayının karesi : " + (sayi*sayi));
    }
}
