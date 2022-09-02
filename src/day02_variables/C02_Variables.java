package day02_variables;
public class C02_Variables {
    public static void main(String[] args) {
       // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
        int sayi=10;
        boolean guzelMİ=true;
        char sayim='3';
        System.out.println(sayi); // 10
        System.out.println("sayi"); //sayi
        System.out.println("sayi : " + sayi); //sayi : 10
        // 2- isim ve soyisim icin iki variable olusturun ve bunlari
        //isminiz : Mehmet
        //soyisminiz : Bulutluoz
        //seklinde yazdirin
        String isim="Selçuk";
        String soyIsim="Altınışık";
        System.out.println("İsminiz : " + isim);
        System.out.println("Soyisminiz : " + soyIsim);
        // 3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        byte sayi1=8;
        int sayi2=38;
        System.out.println("İki Sayının Toplamı : " + (sayi1+sayi2));
        // 4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        int sayi3=45;
        double sayi4=4.44;
        System.out.println("İki Sayının Toplamı : " + (sayi3+sayi4));
        // 5 - char data turunde bir variable olusturun ve yazdirin
        char harf='S';
        System.out.println("Char'ın Yazdırılması : " + harf);
        // 6- Bir tamsayı, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
        int sayi5=17;
        char harf2= 'S';
        System.out.println("Bir Tam Sayı ve Char Değişkeni'nin Toplam Sayısal Değeri : " + (sayi5+harf2));
    }
}
