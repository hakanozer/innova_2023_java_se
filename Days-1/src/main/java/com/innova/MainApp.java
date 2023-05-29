package com.innova;

public class MainApp {
    public static void main(String[] args) {

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
        String[] cities = { "İstanbul", "Ankara", "İzmir", "Bursa", "Antalya", "Adana" };
        System.out.println(cities);
        // index -> 0 dan başlar, dizi içindeki değerleri almak için kullanılır.
        System.out.println( cities[0] );
        System.out.println( cities.length );
        int index = 5;
        cities[index] = "Hatay";
        if ( cities.length > index ) {
            System.out.println( cities[index] );
        }


    }
}
