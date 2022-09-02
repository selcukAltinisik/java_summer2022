package day07_ifStatements;
import java.util.Scanner;
public class C07_IfElseIfStatements {
    public static void main(String[] args) {
        /*  SAYFA-5 / SORU-3

        Soru 3) Kullaniciya yasini sorun,
        eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
        65’e esit veya buyukse “Emekli olabilirsin” yazdirin

        bir onceki soruda, kullanici negatif deger girerse uyaralim
        NOT : birden fazla if - else if birbirine baglanmissa
        son durum onemlidir
        eger else ile bitiyorsa butun ihtimaller kapsaniyor demektir
        ama else if ile bitiyorsa kapsanmayan durumlar olabilir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas>=0 && yas<65){
            System.out.println("Emekli olamazsın. " +(65-yas)+" yıl daha çalışmalısın.");
        } else if (yas<0){
            System.out.println("Lutfen geçerli bir yaş giriniz.");
        } else {
            System.out.println("Yasin gelmis, artik emekli olabilirsin.");
        }


    }
}


        /* Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        if(yas<0){
            System.out.println("Lutfen gecerli bir yas yaziniz");
        } else if (yas<65){
            System.out.println("emekli olamazsin, "+(65-yas)+" yil daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");
        }*/