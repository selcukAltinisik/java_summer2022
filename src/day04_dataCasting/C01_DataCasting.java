package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf='a';
        char yeniHarf=(char)(harf+1);           // kod bu durumda once sagdaki islemi yapar
                                                //char yeniHarf = 97 + 1 --> 98
                                                // char bir variable 98 olamayacagi icin Java hata verir.

        System.out.println(yeniHarf);
    }
}
