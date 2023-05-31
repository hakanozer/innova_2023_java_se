package useArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ResultData {

    public void result( ArrayList<String> ls ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Data-1 Entry");
        String data1 = scanner.nextLine();

        System.out.println("Data-2 Entry");
        String data2 = scanner.nextLine();

        ls.add(data1);
        ls.add(data2);

    }

}
