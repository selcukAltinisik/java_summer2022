package day04_dataCasting;

public class day04_Odev01 {
    public static void main(String[] args) {
        /* Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
birer degisken olusturup adim adim widening yapin ve yazdirin
        */
        byte sayi1=44;
        System.out.println("Sayı-1: " +sayi1);
        short sayi2=sayi1;
        System.out.println("Sayı-2: " +sayi2);
        int sayi3=sayi2;
        System.out.println("Sayı-3: " +sayi3);
        float sayi4=sayi3;
        System.out.println("Sayı-4: " + sayi4);
        double sayi5=sayi4;
        System.out.println("Sayı-5: " + sayi5);

    }
}
