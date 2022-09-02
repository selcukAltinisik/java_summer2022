package day12_stringManipulations;

import java.util.Scanner;

public class Pdf06_Sayfa25Soru07 {
    public static void main(String[] args) {

        /*  Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin
        ve asagidaki gibi yazdirin.

               isim-soyisim : M***** B********
               kart no : **** **** **** 1234
        */

        String isim= "Selcuk";
        String soyisim= "Altinisik";
        String kartNo= "1234 6589 7458 9658";

        String isimIlkHarf = isim.substring(0,1).toUpperCase();
        String isimGeriyeKalan = isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf = soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalan = isim.substring(1).replaceAll("\\w","*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar= " **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalan+" "+
                           soyisimIlkHarf+soyisimGeriyeKalan+ "\n" +
                           kkIlk4+kkGeriyeKalanlar);


    }
}

