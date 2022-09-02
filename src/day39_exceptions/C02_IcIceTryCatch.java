package day39_exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class C02_IcIceTryCatch {
    public static void main(String[] args) {
        String s = "J";

        try {

            s = s + "a";

        }catch(Exception e) {

            s = s + "v";

        }finally {

            s = s + "a";

        }

        s = s + "m";
        System.out.println(s);
    }
}