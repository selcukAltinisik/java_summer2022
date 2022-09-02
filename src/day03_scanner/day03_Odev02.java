package day03_scanner;

import java.util.Scanner;

public class day03_Odev02 {
    public static void main(String[] args) {
    /* Soru 2) Kullanicidan karenin bir kenar uzunluğunu alin ve karenin cevresini ve alanini hesaplayip
yazdirin */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenarinin uzunlugunu giriniz");
        double kenar=scan.nextDouble();
        System.out.println("Karenin cevresi : "+4*kenar);
        System.out.println("Karenin alanı : "+kenar*kenar);
    }
}
