package day03_scanner;

import java.util.Scanner;

public class day03_Odev03 {
    public static void main(String[] args) {
        /* Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yaricap giriniz");
        double yaricap=scan.nextDouble();
        System.out.println("Cemberin cevresi : "+2*3.14*yaricap);
        System.out.println("Dairenin alanı : "+3.14*yaricap*yaricap);
    }
}
