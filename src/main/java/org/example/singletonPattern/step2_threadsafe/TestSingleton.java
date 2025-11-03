package org.example.singletonPattern.step2_threadsafe;


public class TestSingleton {
    public static void main(String[] args) {

        Singleton single = Singleton.getInstance();
        System.out.println(single.toString());
        System.out.println(single.getDescription());

        Singleton trulySingle = Singleton.getInstance();
        System.out.println(trulySingle.toString());
        System.out.println(trulySingle.getDescription());
    }
}
