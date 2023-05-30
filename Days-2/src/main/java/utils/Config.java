package utils;

import java.util.Random;

public class Config {

    public final String appTitle = "App Title";

    // static kullanımı
    // Sınıfa ait olmak zorundadır.
    // Erişim belirteçleri alırlar, public, private
    // Değişken, nesne, fonksiyon vb. tüm özelliklere atanır. Sınıf hariç
    // Her yerden erişim emvcut, uygulama duruna kadar yaşarlar.
    // Staticler kullan yada kullanma yaşamaya devam ederler.
    public static String name = "Ali Bilmem";

    public static Random random = new Random();

    //  sum static method
    public static int sum( int a, int b ) {
        return a + b;
    }

}
