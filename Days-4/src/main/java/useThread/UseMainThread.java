package useThread;

public class UseMainThread {

    public static void main(String[] args) {

        Action ac = new Action();
        Thread th = new Thread(ac);
        th.start();

        System.out.println("This Line Call");

    }

}
