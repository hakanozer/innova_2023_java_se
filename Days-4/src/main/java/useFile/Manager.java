package useFile;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    private String filePath;
    private File file;
    public Manager( String filePath ) {
        this.filePath = "files/"+ filePath + ".txt";
        file = new File(this.filePath);
    }


    // Create file
    public void createFile() {
        try {
            if ( !file.exists() ) {
                file.createNewFile();
            }
        }catch (Exception ex) {
            System.err.println("createFile Error :" + ex);
        }
    }

    // delete file
    public void deleteFile() {
        if ( file.exists() ) {
            file.delete();
        }
    }

    // add file data
    public void addData( String line ) {
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.append(line + System.lineSeparator() );
            writer.close();
        }catch (Exception ex) {
            System.err.println("addData Error :" + ex);
        }
    }

    // File read
    public ArrayList<String> read() {
        ArrayList<String> ls = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while ( scanner.hasNext() ) {
                String line = scanner.nextLine();
                ls.add(line);
            }
        }catch (Exception ex) {
            System.err.println("read error:" +ex);
        }
        return ls;
    }
    

}
