package day07_ifStatements;
import java.util.Scanner;
public class C05_IfElseStatements {
    public static void main(String[] args) {
        /*
        IfElseStatement

        SAYFA-5 / SORU-2
        Kullanicidan bir karakter girmesini isteyin
        ve girilen karakterin harf olup olmadigini yazdirin
         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);

        if ((karakter>='a' && karakter<='z') || (karakter>='A' && karakter<='Z')) {
            System.out.println("Girilen karakter bir harftir.");
        }
        else {
            System.out.println("Girilen karakter bir harf değildir.");











        }
    }
}
        //  YAZDIRINCA

        //  Lutfen bir karakter giriniz
        //  b
        //  Girilen karakter bir harf

        //  Lutfen bir karakter giriniz
        //  1
        //  Girilen karakter bir harf degil

        /*  Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char harf=scan.next().charAt(0);

        if ((harf>='a' && harf<='z') || (harf>='A' && harf<='Z')){
            System.out.println("Girilen karakter bir harf");
        }
        else {System.out.println("Girilen karakter bir harf degil"); */