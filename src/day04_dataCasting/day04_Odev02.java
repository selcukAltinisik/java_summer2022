package day04_dataCasting;

public class day04_Odev02 {
    public static void main(String[] args) {
        /* Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin */
        int sayi1=35;
        System.out.println("Sayı-1: "+sayi1);
        short sayi2=(short)sayi1;
        System.out.println("Sayı-2: "+sayi2);
        byte sayi3= (byte)sayi2;
        System.out.println("Sayı-3: "+sayi3);

    }
}
