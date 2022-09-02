package day12_stringManipulations;

import java.util.Scanner;

public class Pdf06_Sayfa25Soru06 {

    public static void main(String[] args) {
        /*  Java_Batch59-60_DersNotlari_6.pdf    sayfa 123 / 252      soru 6
            Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
            “Sifre basari ile tanimlandi”,
            sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
                - Ilk harf buyuk harf olmali
                - Son harf kucuk harf olmali
                - Sifre bosluk icermemeli
                - Sifre uzunlugu en az 8 karakter olmali
       */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen şifrenizi giriniz : ");
        String sifre = scan.nextLine();

        char ilkHarf = sifre.charAt(0);
        char sonHarf = sifre.charAt(sifre.length() - 1);

        if (!(ilkHarf >= 'A' && ilkHarf <= 'Z') || (!(sonHarf >= 'a' && sonHarf <= 'z') ||
           sifre.contains(" ") || sifre.length() < 8)) {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }
        else {
            System.out.println("Sifre basari ile tanimlandi");
        }

    }
}