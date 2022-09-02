package day03_scanner;

import java.util.Scanner;

public class day03_Odev06 {
    public static void main(String[] args) {
        /* Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde
yazdirin
Isim — soyisim : Mehmet Bulutluoz */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        String isim_soyisim=scan.nextLine();
        System.out.println("Isim - Soyisim : "+isim_soyisim);

    }
}
