package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin
        // sayi poztifse sayiyi yazdirin
        // sayi negatifse, bir sayi daha isteyin ve ikisinin carpimini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        if (sayi>1) {
            System.out.println(sayi);
        }
        else{
            System.out.println("Lütfen bir sayi daha giriniz");
            double sayi2=scan.nextDouble();
            System.out.println(sayi*sayi2);

        }
    }
}
