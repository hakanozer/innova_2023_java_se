package com.innova;

public class Profile {

    int age = 30;

    // Kurucu Methodlar
    // Yazmadığımızda parametre almayan default bir kurucu zaten vardır(Object Class)
    // Biz bir tane yazdığımızda default olan yok/egale olur.
    // Sınıf adı ile aynı isme sahip olmalıdırlar.
    // Normal method davranışına sahip değillerdir, return veya void alamazlar.
    // Kurucu methodlar parametre alabilirler.

    // This
    // Kullanıcıldığı methodun sınıfını işaret eder.

    public Profile() {
        System.out.println("Noparam Profile Call");
    }

    public Profile( int age ) {
        this.age = age;
    }

    public Profile( int age, String data ) {
        this.age = age;
        System.out.println("Data :" + data);
        stData(data);
    }

    public void call() {
        int ac = age * 10;
        System.out.println("Call :" + ac);
    }

    public void stData( String data ) {
        System.out.println(data.length());
    }


}
