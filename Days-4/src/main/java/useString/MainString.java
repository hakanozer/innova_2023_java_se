package useString;

import java.util.Locale;

public class MainString {

    public static void main(String[] args) {

        String data = "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. Lorem Ipsum, adı bilinmeyen bir matbaacının bir hurufat numune kitabı oluşturmak üzere bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı sahte metinler olarak kullanılmıştır. Beşyüz yıl boyunca varlığını sürdürmekle kalmamış, aynı zamanda pek değişmeden elektronik dizgiye de sıçramıştır. 1960'larda Lorem Ipsum pasajları da içeren Letraset yapraklarının yayınlanması ile ve yakın zamanda Aldus PageMaker gibi Lorem Ipsum sürümleri içeren masaüstü yayıncılık yazılımları ile popüler olmuştur";
        String st1 = new String("Ali");
        String st2 = "Ali";

        int n1 = 10;
        int n2 = 10;

        // equals
        // String ifadelerin kıyaslanmasındda kullanılır.
        if ( st1.equals("Ali") ) {
            System.out.println("Ali True");
        }

        // length -> Karakter sayısı
        int length = data.length();
        System.out.println( length );

        // contains -> içinde var mı
        String[] words = { "dizgi", "mıgır", "baskı" };
        boolean dbWrite = true;
        for ( String word : words ) {
            boolean containsStatus = data.contains(word);
            if ( containsStatus ) {
                dbWrite = false;
                break;
            }
        }
        System.out.println("dbWrite :" + dbWrite );

        // toLowerCase -> tüm harfleri küçük yap
        String lowerCase = data.toLowerCase( new Locale("tr-TR") );
        String upperCase = data.toUpperCase( new Locale("tr-TR") );
        System.out.println(lowerCase);
        System.out.println(upperCase);

        // charAt -> string ifadenin n. elemanını ulaşır.
        char c0 = data.charAt(1);
        System.out.println(c0);
        for( char c : data.toCharArray() ) {
            // System.out.println( c );
        }

        // equalsIgnoreCase -> eşitliği büyük küçük karakter farklılığı olmasızın doğrular
        String email = "Ali@mail.com";
        if ( email.equalsIgnoreCase("ali@mail.com") ) {
            System.out.println("ali@mail.com - true");
        }

        // indexOf -> string ifadenin içinde aranan kelimenin kaçıncı indexte başladığını belirtir.
        int indexOf = data.indexOf("mıgır");
        System.out.println("indexOf : "+ indexOf);

        // isEmpty -> string ifadenin boş olup olmadığını kontrol eder.
        boolean isEmpty = data.isEmpty();
        System.out.println("isEmpty : "+ isEmpty);

        // replaceAll -> string ifade içindeki tüm elemanları değiştirir
        String stNew = data;
        for ( String word : words ) {
           stNew = stNew.replaceAll(word, "***");
        }
        System.out.println(stNew);

        // split -> ayrıştırma yada arama yaparak bir dizi elemanı getiri
        String[] splits = data.split(" ");
        System.out.println( splits.length );
        for( String word : splits ) {
            System.out.println(word);
        }

        // substring -> Uzun string ifaddelerin belirli bir bölümünü kullanma yeteneği sunar.
        String stLine = data.substring(13, 70);
        System.out.println(stLine);

        // trim -> string ifadenin solunda ve sağında bulunan boşlukları temizler.
        String name = "  Kemal    ";
        System.out.println(name.trim());


    }

}
