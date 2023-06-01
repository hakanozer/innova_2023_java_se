package useFile;

import java.io.File;
import java.io.FileWriter;

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
    

}
