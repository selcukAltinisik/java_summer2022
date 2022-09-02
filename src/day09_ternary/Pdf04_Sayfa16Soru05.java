package day09_ternary;

import java.util.Scanner;

public class Pdf04_Sayfa16Soru05 {
    public static void main(String[] args) {
        //  Soru5 ) Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”,
        //  yoksa “Ucbasamakli degil” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz.");
        int sayi =scan.nextInt();

        System.out.println(sayi>=100 && sayi<=999 ? "Girdiğiniz sayı 3 basamaklı bir sayıdır." :
                                                    "Girdiğiniz sayı 3 basamaklı bir sayı değildir!!!");

    }
}
