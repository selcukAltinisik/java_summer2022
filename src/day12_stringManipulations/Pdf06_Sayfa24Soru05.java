package day12_stringManipulations;

import java.util.Scanner;

public class Pdf06_Sayfa24Soru05 {
        /*
        Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
         */
        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.print("Lütfen 4 harfli bir kelime giriniz : ");
            String kelime=scan.next();
            String ters=kelime.substring(3)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime .substring(0,1);
            System.out.println("Girilen kelimenin tersten okunuşu : " + ters);




        }
}
