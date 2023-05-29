package com.innova;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        String namx = new String("Alix");
        String name = "Ali";
        String surname = "Bilmem";

        long lng = 8999999999999999999l;
        int age = 2147000000;
        short sh1 = 32555;
        byte age1 = 30;

        System.out.println( name );

        boolean status = true;
        int num1 = 10;
        int num2 = 11;

        boolean statusIf = num1 != num2;
        if( statusIf ) {
            System.out.println("num1 > num2");
        }else {
            System.out.println("If Fail");
        }


        if (name.equals("Ali")) {
            System.out.println("Name == Ali");
        }

        statusIf = num1 > 10 || num2 > num1;
        System.out.println( "StatusIf ||:" + statusIf );

        statusIf = num1 > 9 && num2 > 10;
        System.out.println( "StatusIf &&:" + statusIf );

        // Array
        // unmutable -> runtimeda ekle, silme yapılamaz.
        String[] cities = { "İstanbul", "Ankara", "İzmir", "Bursa", "Antalya", "Adana", "Mersin", "Antakya", "Samsun" };
        System.out.println(cities);
        // index -> 0 dan başlar, dizi içindeki değerleri almak için kullanılır.
        System.out.println( cities[0] );
        System.out.println( cities.length );
        int index = 5;
        cities[index] = "Hatay";
        if ( cities.length > index ) {
            System.out.println( cities[index] );
        }


        // for loop
        for ( int i = 0; i < 5; i++ ) {
            System.out.println("i Call : "+ i);
        }

        // array all items
        for( int i = 0; i < cities.length; i++ ) {
            String item = cities[i];
            if ( item.equals("İzmir") ) {
                continue; // bu adımı atla,dikkate almas
            }
            if ( item.equals("Hatay") ) {
                System.out.print("Deprem - ");
            }
            if ( item.equals("Mersin") ) {
                break; // döngüyü kırmak bitirmek
            }
            System.out.println(item);
        }

        // fori
        System.out.println("====================");
        for (int i = 2; i < cities.length - 1; i++) {
            System.out.println(cities[i]);
        }
        
        
        // foreach
        System.out.println("====================");
        for( String item : cities ) {
            System.out.println( item );
        }

        // Nesne Üretimi
        // Sınıf - Class -> Action -> Kullanmak istediğimiz Sınıf(Tür)
        // Nesne - Object -> obj -> Sınıfın kullanılabilir üyesidir.
        // Kurucu - Constructor -> Sınıfın default çalışan methodudur.
        Action obj = new Action();
        // nesne altındaki özellikleri bulmak için (.) operatörü kullanılır.
        //for (int i = 0; i < 10; i++) {
        obj.noParamNoReturn();
        //}
        obj.noReturn("sema.jpg", 100);
        obj.noReturn("sema.jpg", 300);
        obj.noReturn("sema.jpg", 500);
        obj.noReturn("Ahmet Bilsin", 32);

        String ns = obj.nameSurnameJoin("Selin", "Bil");
        System.out.println(ns);

        boolean paramsStatus = obj.allParam("İstabul","Beşiktaş", "no: 1", "Meydan");
        System.out.println(paramsStatus);

        // kurucu method kullanımı
        Profile profile = new Profile(15, "New Data");
        profile.call();


    }
}
