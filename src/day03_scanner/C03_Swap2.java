package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        // bir onceki swap sorusunu bos kova kullanmadan yapin
        int sayi1 = 10;
        int sayi2 = 20;

        System.out.println("Swaptan Önce -  " + "sayi1: " + sayi1 + " sayi2: " + sayi2);
        sayi1 = sayi1 + sayi2;      //  sayi1 = 30  sayi2 = 20
        sayi2 = sayi1 - sayi2;      //  sayi1 = 30  sayi2 = 10
        sayi1 = sayi1 - sayi2;      //  sayi1 = 20  sayi2 = 10
        System.out.println("Swaptan Sonra - " + "sayi1: " + sayi1 + " sayi2: " + sayi2);
    }
}
