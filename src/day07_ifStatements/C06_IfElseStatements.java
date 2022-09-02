package day07_ifStatements;
import java.util.Scanner;
public class C06_IfElseStatements {
    public static void main(String[] args) {
        /*

        C06_IfElseStatements
        SAYFA-5 / SORU-3

        Soru 3) Kullaniciya yasini sorun,
        eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
        65’e esit veya buyukse “Emekli olabilirsin” yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<65){
            System.out.println("Emekli olamazsın. " +(65-yas)+" yıl daha çalışmalısın.");
        } else {
            System.out.println("Yasin gelmis, artik emekli olabilirsin.");
        }

    }
}
        //  YAZDIRINCA

        //  Lutfen yasinizi giriniz
        //  33
        //  emekli olamazsin, 32 yil daha calismalisin





        /* Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<65){
            System.out.println("emekli olamazsin, "+(65-yas)+" yil daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin"); */