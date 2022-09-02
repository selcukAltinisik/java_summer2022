package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz. \nAralarda Enter tusuna basiniz");

        String isim = scan.nextLine();
        String soyIsim = scan.nextLine();
        int yas = scan.nextInt();
        System.out.println("Girilen bilgiler : "+isim+", "+soyIsim+", "+yas);
    }
}
