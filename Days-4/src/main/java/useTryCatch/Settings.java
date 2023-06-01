package useTryCatch;

public class Settings {

    public int convert( String stNumber ) throws Exception {
        int num = Integer.parseInt(stNumber);
        return num + 50;
    }

}
