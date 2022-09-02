package day12_stringManipulations;

public class Pdf06_Sayfa24Soru01 {
    public static void main(String[] args) {
        /*  Soru 1) String methodlarini kullanarak
        “ Java ogrenmek123 Cok guzel@ ” String'ini
        “Java ogrenmek cok guzel.” sekline getirin.
        */


        String str=" Java ogrenmek123 Cok guzel@ ";

        System.out.println(str.trim().replaceAll("@", ".")
                                     .replaceAll("\\d", "")
                                     .replaceAll("C", "c"));

    }
}
