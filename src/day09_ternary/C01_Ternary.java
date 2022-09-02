package day09_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

    // TERNARY OPERATOR PDF'İ SAYFA: 14 SORU:3
    //Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        System.out.println("Girdiğiniz sayının mutlak değeri : " +(sayi>=0 ? sayi : (-1*sayi)));


}
}