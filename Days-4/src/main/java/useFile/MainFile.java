package useFile;

public class MainFile {
    public static void main(String[] args) {

        String os = System.getProperties().getProperty("os.name");
        System.out.println(os);

        Manager manager = new Manager("note");
        // manager.createFile();
        // manager.deleteFile();
        manager.addData("Akşam toplantı notu");
    }
}
