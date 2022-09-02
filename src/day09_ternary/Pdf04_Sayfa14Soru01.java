package day09_ternary;

import java.util.Scanner;

public class Pdf04_Sayfa14Soru01 {
    public static void main(String[] args) {
        // Kullanicidan 2 sayi alin ve
        // buyuk olmayan sayiyi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 sayı giriniz. Birinci sayıyı girdikten sonra enter'a basarak 2. sayiyi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println(sayi1<sayi2 ? sayi1 : sayi2);



    }
}
