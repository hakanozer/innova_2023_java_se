package useArrayList;

import java.util.ArrayList;

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

        // item add index
        ls.add(1, "Bülent");

        System.out.println( ls );

    }
}
