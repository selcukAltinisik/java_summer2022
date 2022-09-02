package day03_scanner;

import java.util.Scanner;

public class day03_Odev05 {
    public static void main(String[] args) {
        /* Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
İsminiz : Mehmet
Soyisminiz : Bulut
Kursumuza katiliminiz alinmistir,tesekkur ederiz  */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz(Aralarda Enter'a basiniz)");
        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        System.out.println("Isminiz: "+isim+" \n"+"Soyisminiz : "+soyisim+" \n"+
                "Kursumuza katiliminiz alinmistir, tesekkur ederiz");
    }
}
