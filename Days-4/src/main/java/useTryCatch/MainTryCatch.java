package useTryCatch;

import java.io.File;
import java.io.IOException;

public class MainTryCatch {

    public static void main(String[] args) {

        try {
            String userNumber = "60";
            int number = Integer.valueOf(userNumber);
            int end = number / 2;
            System.out.println("End :" + end);
        }catch (Exception ex) {
            System.err.println(ex);
            System.err.println("Lütfen tam sayı giriniz!");
        }
        System.out.println("This Line Call");


        boolean status = true;
        try {
            Settings settings = new Settings();
            int sm = settings.convert("a88");
            System.out.println("Sum :" + sm);
        }catch (Exception ex) {
            System.err.println("Error :" + ex);
        }finally {
            status = false;
        }
        

    }

}
