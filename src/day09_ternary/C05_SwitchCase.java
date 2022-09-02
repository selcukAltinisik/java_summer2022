package day09_ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

        /* Kullanıcıda gün numarasını alıp
        1 ise pazartesi
        ...
        7 ise pazaryazdiralim.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo=scan.nextInt();

        /*
        switch yanına yazilan () neye göre case atayacağımızı gösterir.
        Java girilen degere gore Case'i bulur ve o satirdan calistirmaya baslar
        break yazisi gorunceye veya switch parantezine kadar devam eder.

         if - else if - else yapisinda olduğu gibi hicbir sarta uymayanlari default keyword kullanılır

         */

        switch(gunNo){
            case 1 :
                System.out.println("pazartesi");
                break;
            case 2 :
                System.out.println("sali");
                break;
            case 3 :
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case 6 :
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println("pazar");
                break;
            default:
                System.out.println("Gecerli gün numarası giriniz!!");

        }

    }
}
