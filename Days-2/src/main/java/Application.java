import utils.Config;

public class Application {
    public static void main(String[] args) {

        Config obj = new Config();
        System.out.println( obj.appTitle );

        Config.name = "Erkan Bilsin";
        System.out.println(Config.name);

        int rnd = Config.random.nextInt(100);
        System.out.println(rnd);

        int sm = Config.sum(454,767);
        System.out.println("Sm :" + sm);

    }
}
