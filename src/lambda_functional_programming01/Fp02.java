package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1-)   t-> "Logic", (t,u)-> "Logic
          Bu yapiya "Lambda Expession"
    2-)   Functional Programming kapsamında "Lambda Expession" kullanılabilir ama önerilmez.
          "Lambda Expession" yerine "Method Reference" tercih edilir.
    3-)   "Method Reference" kullanimi "Class Name :: MethodName"

          Aynı zamanda kendi class'larinizi da kullanabilirsiniz.
          Ornegin bir Animal class'iniz var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
   */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftelemanlarıYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKüpünüYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKaretoplami01(liste);
        tekrarsizCiftElemanlarinKaretoplami02(liste);
        tekrarsizCiftElemanlarinKaretoplami03(liste);
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        getMaxEleman(liste);
        YedidenBuyukCiftMin(liste);
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);



    }
    //1) Ardışık list elemanlarını aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
    public static void listElemanlariniYazdirFunctional (List<Integer> list){
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftelemanlarıYazdirFunctional(List<Integer> list){
        list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){
        list.stream().filter(Utils::tekElemaniSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKüpünüYazdir(List<Integer> list){
        list.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    //  1. Yol:
    public static void tekrarsizCiftElemanlarinKaretoplami01(List<Integer> list){
        Integer toplam= list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0, Math::addExact);    //  reduce(Math::addExact).get()
        System.out.println(toplam);
    }
    //  2.Yol:
    public static void tekrarsizCiftElemanlarinKaretoplami02(List<Integer> list){
        Integer toplam= list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println(toplam);
    }
    //  3.Yol:
    public static void tekrarsizCiftElemanlarinKaretoplami03(List<Integer> list){
        Integer toplam= list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0, Integer::sum); // reduce(Integer::sum).get()
        System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list){
    Integer carpim= list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::kupunuAl).reduce(1, Math::multiplyExact);
        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getMaxEleman(List<Integer> list){
        Integer max= list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)
    public static void getMinEleman01(List<Integer> list){

        Integer min= list.stream().distinct().reduce(Math::min).get();
        System.out.println("min = " + min);

    }




    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void YedidenBuyukCiftMin(List<Integer> list){
        Integer min= list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemaniSec).reduce(Math::min).get();
        System.out.println(min);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){
    List<Double> sonuc= list.
                    stream().   //  Gerekli methodlari kullanmamızı sağlar.
                    distinct(). //  Tekrarlı olanları almaz.
                    filter(t->t>5). //  Koşula göre filtreleme yapar.
                    map(Utils::yarisiniAl). //  Her bir elemanın değerini değiştirmeye yarar
                    sorted(Comparator.reverseOrder()).  //  //Sıralama yapar
                    collect(Collectors.toList());   //  //Elamanları collection'a çevirir.
        System.out.println(sonuc);
    }

}
