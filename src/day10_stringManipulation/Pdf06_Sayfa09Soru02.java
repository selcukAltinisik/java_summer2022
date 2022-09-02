package calisma2;
import java.util.Scanner;
public class Pdf06_Sayfa09Soru02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String str= scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String str2= scan.nextLine();
        int ilkKullanim=str.indexOf(str2); // ya -1 cikar yada herhangi bir index cikar
        int ikinciKullanim= str.indexOf(str2, ilkKullanim+1); //Bu kullanimi gormediginiz icin acikliyorum
        // str="Java cok kolay" -->sout(str.indexOf('o',6)); bu girilen String'de 6.index'den itibaren(6.index'de dahil)
        //'o' aramaya basla ve kacinci index'de bulursan o index'i yazdir //burda 6.index direk 'o' harfine denk geldigi
        //icin sout sonucu 6 cikar..Ama sout(str.indexOf('o',7)); deseydi-->7.index'den itibaren aramaya baslayacak(k harfinden)
        // ve bir sonraki 'o' 9.index'de oldugu icin sout sonucu 9 cikacak..
        //Burda illa char girmemize gerek yok, kelime olarak da girebiliriz ve ayni sekilde sonucu buluruz
        //ilkKullanim+1 deme sebebim ikinciKullanim ilkKullanim dan 1 sonrasına bakacagi icin
        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if(ikinciKullanim==(-1)){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        } else{
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }
    }
}