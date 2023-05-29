package com.innova;

public class Action {


    // void -> bir fonksiyon geriye değer döndermeyecek ise void almalıdır.
    // return -> bir fonksyionda geri dönecek değeri temsil eder
    // parameters -> () bir fonksiyona giden parametreleri temsil eder
    // body -> {} arasında yazılır, fonksiyonun asıl kodlarının olduğu bölümdür.

    // fonksiyon türleri
    // noParamNoReturn
    public void noParamNoReturn() {
        System.out.println("noParamNoReturn Call");
    }

    public void noReturn( String data, int size ) {
        int sm = data.length() + size;
        System.out.println("Sm : " + sm);
    }

    public String nameSurnameJoin(String name, String surname) {
        String join = "Sn. " + name + " " + surname;
        return join;
    }

    /**
     * @apiNote Dynamic address lines DB insert
     * @param params <b>String... params</b>
     * @return boolean -> DB AdressLines add -> true, fail -> false
     * <blockquote><pre>
     * boolean paramsStatus = obj.allParam("İstabul","Beşiktaş", "no: 1", "Meydan");
     * </pre></blockquote><p>
     * @Author <a href="mailto:ali@mail.com">ali@mail.com</a>
     * @see java.lang.reflect.Array
     * @since 1.8
     */
    public boolean allParam( String... params ) {
       for ( String item : params ) {
           System.out.println( item );
       }
       return true;
    }



}
