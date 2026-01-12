package org.example.patterns.singletonPattern.step3_doublecheckedlocking;

//Thread safe and synchronization only when needed the first instance
public class Singleton {
    //volatile ensures multiple threads handle the unique instance variable correctly when it is being initialized to a singleton class.
    private volatile static Singleton uniqueInstance;
    private Singleton() {
    }

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public String getDescription(){
        return "Thread safe with synchronization only if unique instance is null. Unlike everytime get is triggered.";
    }
}
