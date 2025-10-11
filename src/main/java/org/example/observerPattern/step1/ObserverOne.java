package org.example.observerPattern.step1;

public class ObserverOne implements Observer{

    private int value;
    private SubjectMain subjectMain;

    public ObserverOne(SubjectMain subjectMain) {
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
