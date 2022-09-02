package day12_stringManipulations;

import java.util.Scanner;

public class Pdf06_Sayfa24Soru03 {
    public static void main(String[] args) {

        /*  Kullanicidan isim isteyin. Eger
        - isim "a" harfi içeriyorsa "Girdiğiniz isim a harfi içeriyor"
        - isim "Z" harfi içeriyorsa "Girdiğiniz isim Z harfi içeriyor"
        - ikisi de yoksa "Girdiğiniz isim "a" veya "Z" harfi içermiyor" yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();

        if (isim.contains("Z") && isim.contains("a")) {
            System.out.println("Girdiğiniz isim Z ve a harflerini içeriyor");
        }
        else if (isim.contains("Z")) {
        System.out.println("Girdiğiniz isim Z harfi içeriyor");
        }
        else if
        (isim.contains("a")) {
            System.out.println("Girdiğiniz isim a harfi içeriyor");
        }
        else {
            System.out.println("Girdiğiniz isim a veya Z harfi içermiyor");
        }
    }
}
