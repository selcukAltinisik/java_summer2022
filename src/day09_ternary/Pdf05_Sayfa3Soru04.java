package day09_ternary;

public class Pdf05_Sayfa3Soru04 {
    public static void main(String[] args) {

        // Soru4 : Kullanicidan SDET kisaltmasindaki harflerden birini yazmasıni isteyin.
        // Kullanici    S girerse “Software”
        //              D girerse “Developer”
        //              E girerse “Engineer”
        //              T girerse “In Testing” yazdirin

        char harf='T';

        switch(harf) {
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Lütfen S, D, E, T harflerinden birini giriniz  !!!");
        }
    }
}
