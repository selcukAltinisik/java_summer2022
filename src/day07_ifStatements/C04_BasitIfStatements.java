package day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {
        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:      gun=Pazar output = “Hafta sonu”
                    gun=Sali  output = “Hafta ici”
         *** String icin equals method’unu kullanin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gün ismi giriniz.");
        String inputGun = scan.next().toLowerCase();

        if (inputGun.equals("cumartesi") || inputGun.equals("pazar")) {
            System.out.println("Girdiğiniz gun HAFTASONU gunudur..");
        }
        if (inputGun.equals("pazartesi") || inputGun.equals("sali") || inputGun.equals("carsamba") ||
                inputGun.equals("persembe") || inputGun.equals("cuma")){
            System.out.println("Girdiğiniz gun HAFTAICI gunudur..");
        }
        if (!(inputGun.equals("pazartesi") || inputGun.equals("sali") || inputGun.equals("carsamba") ||
                inputGun.equals("persembe") || inputGun.equals("cuma") || inputGun.equals("cumartesi") ||
                inputGun.equals("pazar"))){
            System.out.println("lutfen geçerli bir gun giriniz");
    }
}
}

        /*
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun=scan.next().toLowerCase();
        // Pazar, pazar, PAZAR, PaZar, PAzar ??? bilemeyiz,
        // pazar, pazar, pazar, pazar, pazar
        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){
            System.out.println("Girilen gun HAFTASONU");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma")){
            System.out.println("Girilen gun HAFTAICI");
        }
        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma")|| girilenGun.equals("cumartesi")
                || girilenGun.equals("pazar"))){
            System.out.println("Lutfen gecerli bir gun ismi giriniz");

         */