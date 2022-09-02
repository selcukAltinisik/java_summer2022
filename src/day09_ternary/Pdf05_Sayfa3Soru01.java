package day09_ternary;

public class Pdf05_Sayfa3Soru01 {
    public static void main(String[] args) {

        //Sorul: Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin

        int gun=2;

        switch(gun) {
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Çarşamba");
                break;
            case 4 :
                System.out.println("Perşembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lütfen 1-7 arası bir rakam giriniz!!!");
        }





    }
}
