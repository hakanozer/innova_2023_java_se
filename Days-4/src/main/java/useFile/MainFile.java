package useFile;

import java.util.ArrayList;

public class MainFile {
    public static void main(String[] args) {

        String os = System.getProperties().getProperty("os.name");
        System.out.println(os);

        Manager manager = new Manager("errors");
        // manager.createFile();
        // manager.deleteFile();
        // manager.addData("Akşam toplantı notu");
        try {
            int userNumber = 0;
            int end = 100 / userNumber;
            System.out.println( "End :" + end );
        }catch (Exception ex) {
            manager.addData(MainFile.class + " - " + ex.toString());
            System.err.println("Lütfen 0 dan farklı değer giriniz!");
        }


        ArrayList<String> ls = manager.read();
        System.out.println( ls.size() );
        System.out.println( ls );
    }
}
