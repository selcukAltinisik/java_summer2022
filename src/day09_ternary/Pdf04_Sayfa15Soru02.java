package day09_ternary;

import java.util.Scanner;

public class Pdf04_Sayfa15Soru02 {
    public static void main(String[] args) {
        // Soru2 : Kullanicidan bir harf isteyin
        // kucuk harf ise consola “Kucuk Harf” ,
        // buyuk harfse consola “Buyuk Harf”
        // yoksa “girdiginiz karakter harf degil” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz.");
        char harf=scan.next().charAt(0);

        System.out.println(harf>='a' && harf<='z' ? "Girilen karakter küçük harftir." :
                           harf>='A' && harf<='Z' ? "Girilen karakter büyük harftir." : "Girilen karakter harf değildir.");

    }
}
