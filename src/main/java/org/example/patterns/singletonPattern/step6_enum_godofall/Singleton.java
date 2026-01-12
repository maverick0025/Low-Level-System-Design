package org.example.patterns.singletonPattern.step6_enum_godofall;

public enum Singleton {
    UNIQUE_INSTANCE;

    public String getDescription(){
        return "Thread safe singleton by enum";
    }
}
