package org.example.observerPattern.step1;

public class ConcreteObserverOne implements Observer{

    private int value;
    private ConcreteSubjectMain subjectMain;

    public ConcreteObserverOne(ConcreteSubjectMain subjectMain) {
        this.subjectMain = subjectMain;
        subjectMain.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    private void display() {
        System.out.println("Value: "+ value);
    }

}
