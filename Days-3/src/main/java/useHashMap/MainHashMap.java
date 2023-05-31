package useHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MainHashMap {

    public static void main(String[] args) {

        // HashMap
        // Key, Val
        HashMap<String, Object> hm = new HashMap<>();

        // Add item
        hm.put("name", "Ali");
        hm.put("surname", "Bilmem");
        hm.put("email", "ali@mail.com");
        hm.put("age", 40);
        hm.put("status", true);
        hm.put("name", "Ahmet");

        // Get item
        System.out.println( hm.get("email") );
        hm.put("city", "Ankara");

        // Get size
        System.out.println( hm.size() );

        // Items All clear
        // hm.clear();

        System.out.println("=================");
        // All items
        Set<String> keys = hm.keySet();
        for( String key : keys ) {
            System.out.println(key + " - " + hm.get(key) );
        }
        System.out.println("=================");

        Set<Map.Entry<String, Object>> entries = hm.entrySet();
        for (Map.Entry<String, Object> item : entries) {
            System.out.println( item.getKey() + " - " + item.getValue() );
        }

        System.out.println("=================");

        System.out.println( hm.containsKey("city") );
        System.out.println( hm.containsValue("Bilmem") );

        Object defaultStatus = hm.getOrDefault("statusx", false);
        System.out.println(defaultStatus);

        // put All
        HashMap<String, Object> hm1 = new HashMap<>();
        hm1.put("star", 4);
        hm1.put("class", 3);
        hm.putAll(hm1);

        // remove
        hm.remove("class");
        System.out.println( hm );

        System.out.println("=================");
        // Hashmap içerisinde eklenen üyelerin bizim eklediğimiz sıraya göre eklenmesini sağlar.
        // Sıralama algoritması bizim eklemediğimize göre olacağından dolayı maliyeti biraz artar.
        Map<String, Object> mapx = new LinkedHashMap<>();
        mapx.put("name", "Ali");
        mapx.put("surname", "Bilmem");
        mapx.put("email", "ali@mail.com");
        mapx.put("age", 40);
        mapx.put("status", true);
        mapx.put("name", "Ahmet");
        System.out.println(mapx);

    }

}
