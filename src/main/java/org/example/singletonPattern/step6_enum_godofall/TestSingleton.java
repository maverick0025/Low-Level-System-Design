package org.example.singletonPattern.step6_enum_godofall;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;

        System.out.println(singleton.getDescription());
    }
}
