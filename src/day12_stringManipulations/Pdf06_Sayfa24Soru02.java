package day12_stringManipulations;

public class Pdf06_Sayfa24Soru02 {
    public static void main(String[] args) {

        /*  Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        String str1 = “$13.99”
        String str2 = “$10.55”
        ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
        */

        String str1= "$13.99";
        String str2 = "$10.55";

        str1 = str1.substring(1);
        str2 =str2.substring(1);

        double sayi1 = Double.parseDouble(str1);
        double sayi2 = Double.parseDouble(str2);

        System.out.println("Toplam = $"+(sayi1+sayi2));



    }
}
