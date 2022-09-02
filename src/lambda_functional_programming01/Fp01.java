package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /*
    1-) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
    2-) Functional Programming "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
        Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğunlaşılır.
    3-) Functional Programming Arrrays ve Collections ile kullanılır.
    4-) "entrySet()" methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.
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

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlarıYazdirStructured(liste);
        System.out.println();
        System.out.print("Functional: ");
        ciftelemanlarıYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKüpünüYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKaretoplami(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        System.out.println();
        getMaxEleman01(liste);
        getMaxEleman02(liste);
        getYedidenBuyukCiftMin(liste);
        getYedidenBuyukCiftMin2(liste);
        getYedidenBuyukCiftMin3(liste);
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);

    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void listElemanlariniYazdirStructured(List<Integer> list){
        for (Integer w:list) {
            System.out.print(w+" ");
        }
    }

    //1)Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void listElemanlariniYazdirFunctional(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+" "));
        //  stream()method'u collection'dan elementleri akışa dahil etmek için ve methodlara ulaşmak için kullanılır.
    }

    //2) Çift list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
      public static void ciftElemanlarıYazdirStructured(List<Integer> list){
          for (Integer w : list) {
              if (w%2==0){
                  System.out.print(w+" ");
              }
          }
      }

    //2) Çift list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
        public static void ciftelemanlarıYazdirFunctional(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
        }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)

    public static void  tekElemanlarinKareleriniYazdir(List<Integer> list){
        list.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.print(t+" "));
        //  elemanların değerleri değişecekse map() method'u kullanılır.
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.
    public static void  tekrarsizTekElemanlarinKüpünüYazdir(List<Integer> list){
        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t+" "));
    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    public static void  tekrarsizCiftElemanlarinKaretoplami(List<Integer> list){
       Integer toplam = list.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0,(t, u)->t+u);

       System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKupununCarpimi (List<Integer> list){
    Integer carpim = list.stream().distinct().filter(t-> t%2==0).map(t-> t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getMaxEleman01(List<Integer> list){
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t : u);
        System.out.println(max);
    }
    // 2. Yol:
    public static void getMaxEleman02(List<Integer> list){
    Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)-> u);
        System.out.println("max = " + max);
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)



    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    //  1. Yol:
    public static void getYedidenBuyukCiftMin(List<Integer> list){
    Integer min = list.stream().distinct().filter(t->t%2==0).filter(t-> t>7).reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t : u);
        System.out.println(min);
    }
    //  2. Yol:
    public static void getYedidenBuyukCiftMin2(List<Integer> list){
    Integer min = list.stream().distinct().filter(t-> t%2==0).filter(t-> t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t,u)->u);
        System.out.println("min = " + min);
    }

    //  3. Yol:
    public static void getYedidenBuyukCiftMin3 (List<Integer> list){
        Integer min = list.stream().filter(t-> t%2==0).filter(t-> t>7).sorted().findFirst().get();
        System.out.println("min = " + min);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı
    // değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){
        List<Double> sonuc = list.stream().distinct().filter(t-> t>5).map(t-> t/2.0).
                                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sonuc = " + sonuc);
    }





}
