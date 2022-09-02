package day09_ternary;

import java.util.Scanner;

public class Pdf04_Sayfa16Soru04 {
    public static void main(String[] args) {

        //  Soru4 ) Kullanicidan dikdortgenin uzunluğunu ve genisligini alin, girilen degerlere
        // gore dikdorgenin kare olup olmadigini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin uzunluğunu giriniz, enter'a bastıktan sonra ise genişliğini giriniz.");
        double uzunluk=scan.nextDouble();
        double genislik=scan.nextDouble();

        System.out.println(uzunluk==genislik ? "Bu dikdörtgen bir karedir." : "Bu dikdörgen bir kare değildir!!!");


    }
}
