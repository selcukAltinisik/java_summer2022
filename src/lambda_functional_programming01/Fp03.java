package lambda_functional_programming01;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        System.out.println();
        buyukHarfleYazdir(liste);
        System.out.println();
//        buyukHarfleYazdir02(liste);
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKaraktereGoreTekrarsizSirala(liste);
        System.out.println();
        uzunlukVeIlkHarfeGoreSiralaYazdir(liste);
        System.out.println();
//        bestenBuyukleriSil(liste);
        System.out.println();
//        baslangiciAYadaSonuNOlaniSil(liste);
//        baslangiciAYadaSonuNOlaniSil02(liste);
        uzunlugu8ile10Arasive0IleBiteniSil(liste);
        System.out.println("uzunlugu12denAzMi(liste) = " + uzunlugu12denAzMi(liste));
        System.out.println("xIlebaslamiyorMu(liste) = " + xIlebaslamiyorMu(liste));
        System.out.println("rIleBitenVarMi(liste) = " + rIleBitenVarMi(liste));


    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    //  1. Yol:
    public static void buyukHarfleYazdir(List<String> list){
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    /*//  2. Yol:
    public static void buyukHarfleYazdir02(List<String> list) {
    list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }*/

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreYazdir(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);
        //  Comparator.comparing(String::length): Sıralama koşulunu belirtmek için kullanılır.(Parantez içindeki koşula göre)

    }
    /*
Verilen String bir dizideki elemanları karakter uzunluğuna göre büyükten küçüğe doğru sıralayın.
input : String sehirler[] = {"Trabzon","Çanakkale","Ankara","Muş","Ağrı","Hatay","İstanbul","Van","Rize","İzmir"};
output: [Çanakkale, İstanbul, Trabzon, Ankara, Hatay, İzmir, Ağrı, Rize, Muş, Van]
 */
    /*
    public static void main(String[] args) {
        String sehirler[] = {"Trabzon","Çanakkale","Ankara","Muş","Ağrı","Hatay","İstanbul","Van","Rize","İzmir"};
        List<String> listSehirler = new ArrayList<>();
        for (String each : sehirler) {
            listSehirler.add(each);
        }
        System.out.println("Şehirler Listi  :" + listSehirler);
        List<String> listsiralisehir = new ArrayList<>();
        for (int i = 0; i <listSehirler.size(); i++) {
            int index = 0;  int uzunkarakter = 0; // her for=i döngüsü başında index ve uzunkarakter resetleniyor yani sıfıra atanıyor.
            for (int j = 0; j <listSehirler.size(); j++) {
                if (listSehirler.get(j).length() > uzunkarakter) {
                    uzunkarakter = listSehirler.get(j).length();
                    index = j;
                }
            }
            listsiralisehir.add(listSehirler.get(index)); // ilk for=i döngüsü sonucu listede bulunan en uzun şehir, boş liste ekleniyor.
            listSehirler.set(index,""); // İlk listeden bulunan elemena boşluk atayarak ikinci aramada bulunmamasını sağlıyoruz
        }
        System.out.println("Sıralı Şehirler :" + listsiralisehir);
    }

}
*/

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreTersYazdir(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()) .forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //  4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
        public static void sonKaraktereGoreTekrarsizSirala(List<String> list){
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
        }

    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list){
        list.
                stream().
                sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
    public static void bestenBuyukleriSil(List<String> list){
    list.removeIf(t-> t.length()>5);
        System.out.println(list);
    }

    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.
    //  1. Yol:
    public static void baslangiciAYadaSonuNOlaniSil(List<String> list){
        list.removeIf(t-> t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='N' || t.charAt(t.length()-1)=='n');
        System.out.println(list);
    }
    // 2. Yol:
    public static void baslangiciAYadaSonuNOlaniSil02(List<String> list){
        list.removeIf(t-> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
        System.out.println(list); //[Mark, Christopher, Mariano, Tucker]
    }

    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları yazdıran bir method oluşturun.
    public static void uzunlugu8ile10Arasive0IleBiteniSil (List<String> list){
        list.removeIf(t-> (t.length()>7 && t.length()<11) || t.endsWith("o"));
        System.out.println(list);
    }

    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
        public static boolean uzunlugu12denAzMi (List<String> list){
        return list.stream().allMatch(t-> t.length()<12);
        }

    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
    public static boolean xIlebaslamiyorMu(List<String> list){
        return list.stream().noneMatch(t->t.startsWith("X") || t.startsWith("x"));
    }

    //  11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    public static boolean rIleBitenVarMi (List<String> list){
        return list.stream().anyMatch(t->t.endsWith("r"));
    }



}
