package day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {

        int[] sayilar= {5,7,1,6,4,3,9};

        //  Arrays'iArrays class'ini kullanarak sirali hale getirebiliriz.

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));   //  [1,4,5,5,7,7,9]

    }
}
