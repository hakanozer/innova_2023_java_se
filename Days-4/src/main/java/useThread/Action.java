package useThread;

public class Action implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10 ; i++) {
                System.out.println("for loop call");
                Thread.sleep(1000);
            }
        }catch (Exception ex) {}
    }

}
