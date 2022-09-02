public class Static04 {

    int num1 = 12;

    static int num2 = 22;

    public static void main(String[] args) {

        Static04 obj = new Static04();

        obj.artirma();

        obj.artirma();

    }

    public void artirma() {

        num1++;

        System.out.println(num1);

    }

}