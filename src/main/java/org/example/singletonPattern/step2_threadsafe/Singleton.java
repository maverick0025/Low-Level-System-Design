package org.example.singletonPattern.step2_threadsafe;

//Thread safe
public class Singleton {

    private static Singleton uniqueInstance;
    private Singleton() {
    }

    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription(){
        return "Just a thread safe impl";
    }
}
