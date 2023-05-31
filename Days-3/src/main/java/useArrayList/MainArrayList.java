package useArrayList;

import java.util.ArrayList;
import java.util.Random;

public class MainArrayList {
    public static void main(String[] args) {

        // ArrayList
        // Mutable Array
        // Runtime -> ekle, çıkar, temizle vb..
        ArrayList<String> ls = new ArrayList<>();

        // item add
        ls.add("Ali");
        ls.add("Erkan");
        ls.add("Zehra");
        ls.add("Ayşe");
        ls.add("Kemal");
        ls.add("Ahmet");
        ls.add("Selin");
        ls.add("Serkan");

        // item add index
        ls.add(1, "Bülent");

        // Scanner Using
        // ResultData resultData = new ResultData();
        // resultData.result(ls);

        // size
        int size = ls.size();
        System.out.println(size);

        // get item index
        int index = 2;
        if ( size > index ) {
            String item = ls.get(index);
            System.out.println(item);
        }

        // All items
        for ( int i = 0; i < ls.size(); i++ ) {
            System.out.println( ls.get(i) );
        }

        System.out.println("====================");
        for ( String item : ls ) {
            System.out.println(item);
        }
        System.out.println("====================");

        // All itmes clear
        // ls.clear();

        // Single item remove
        // ls.remove(0);
        boolean status = ls.remove("erkan");
        System.out.println(status);
        ArrayList<String> deleteItems = new ArrayList<>();
        deleteItems.add("Zehra");
        deleteItems.add("Ahmet");
        deleteItems.add("Serkan");
        //ls.removeAll(deleteItems);
        ls.removeIf( item -> item.contains("Se") );

        // Add All Items
        ArrayList<String> addAllItems = new ArrayList<>();
        addAllItems.add("Erdal");
        addAllItems.add("Ertan");
        addAllItems.add("Kaan");
        ls.addAll(addAllItems);

        // indexOf
        int indexValue = ls.indexOf("Erkanx");
        System.out.println( indexValue );

        // contains
        boolean containsStatus = ls.contains("Erkan");
        System.out.println(containsStatus);

        System.out.println( ls );
        System.out.println("====================");

        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setName("Name-"+i);
            u.setSurname("Surname-"+i);
            u.setPassword("p-"+i);
            u.setEmail("mail@mail.com-"+i);
            Random random = new Random();
            u.setAge( random.nextInt(100) );
            users.add(u);
        }
        System.out.println( users );

        //users.removeIf( item -> item.getAge() < 17 );
        //users.remove(5);

        ArrayList<User> listFilter = new ArrayList<>();
        for ( User item : users ) {
            if ( item.getAge() > 17 ) {
                listFilter.add(item);
            }
        }
        users = listFilter;

        for ( User item : users ) {
            System.out.println(item);
        }
        System.out.println("====================");
        ArrayList<String> lsx = new ArrayList<>();
        lsx.add("İstanbul");
        lsx.add("İstanbul");
        lsx.add("İzmir");
        lsx.add("İzmir");
        lsx.add("İzmir");
        lsx.add("Adana");
        lsx.add("Adana");
        lsx.add("Bursa");
        lsx.add("Samsun");
        lsx.add("Samsun");
        lsx.add("Samsun");
        lsx.add("Ankara");

        System.out.println( lsx );

    }
}
