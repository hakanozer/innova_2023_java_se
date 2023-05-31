package userSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {

        // Set
        // içerisinde benzersiz değer tutatabilen Collectionsdur.
        Set<String> set = new HashSet<>();
        set.add("İstanbul");
        set.add("İstanbul");
        set.add("Ankara");
        set.add("Ankara");
        set.add("Ankara");
        set.add("İzmir");
        set.add("İzmir");
        set.add("İzmit");
        set.add("Samsun");
        set.add("Adana");
        System.out.println(set);
        System.out.println("==========================");

        Set<String> set1 = new LinkedHashSet<>();
        set1.add("İstanbul");
        set1.add("İstanbul");
        set1.add("Ankara");
        set1.add("Ankara");
        set1.add("Ankara");
        set1.add("İzmir");
        set1.add("İzmir");
        set1.add("İzmit");
        set1.add("Samsun");
        set1.add("Adana");
        System.out.println(set1);
    }

}
