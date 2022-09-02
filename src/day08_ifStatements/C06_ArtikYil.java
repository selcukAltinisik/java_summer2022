package day08_ifStatements;
import java.util.Scanner;
public class C06_ArtikYil {
    public static void main(String[] args) {
        /* 1) 4 e bölünebiliyorsa artık yıl
           2) Sadece 100'e bölünebiliyorsa artık yıl değil
           3) 400'e bölünebiliyorsa artık yıldır.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yil giriniz");
        int yil= scan.nextInt();
        if (yil%4 != 0){
            System.out.println("Artik yil degil");
        } else if(yil%100 !=0){
            System.out.println("artik yil");
        } else if (yil%400 !=0){
            System.out.println("Artik yil degil");
        } else {
            System.out.println("artik yil");
        }
    }
}