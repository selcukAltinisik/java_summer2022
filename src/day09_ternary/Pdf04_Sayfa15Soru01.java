package day09_ternary;

import java.util.Scanner;

public class Pdf04_Sayfa15Soru01 {
    public static void main(String[] args) {

        /* Kullanıcıdan bir tam sayı alın ve
        sayı 10'dan küçükse "Rakam",
        100'den küçükse "iki basamaklı sayı"
        değilse "Üç basamaklı veya daha büyük sayı yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz.");
        int sayi =scan.nextInt();

        System.out.println(sayi<10 ? "Rakam" : sayi<100 ? "İki basamaklı sayı" : "Üç basamaklı veya daha büyük sayı");








    }
}
