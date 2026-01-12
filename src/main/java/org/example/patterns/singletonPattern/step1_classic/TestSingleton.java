package org.example.patterns.singletonPattern.step1_classic;

public class TestSingleton {
    public static void main(String[] args) {

        Singleton single = Singleton.getInstance();
        System.out.println(single.toString());

        Singleton trulySingle = Singleton.getInstance();
        System.out.println(trulySingle.toString());
    }
}
