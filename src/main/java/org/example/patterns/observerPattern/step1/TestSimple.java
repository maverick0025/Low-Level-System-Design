package org.example.patterns.observerPattern.step1;

public class TestSimple {
    public static void main(String[] args) {
        ConcreteSubjectMain subjectMain = new ConcreteSubjectMain();
        ConcreteObserverOne observerOne = new ConcreteObserverOne(subjectMain);

        subjectMain.setValue(100);
        System.out.println("------");
        subjectMain.setValue(328);

        subjectMain.removeObserver(observerOne);

        subjectMain.setValue(900);
        System.out.println("If you are not seeing Value: 900, that means there are no observers registered! This is expected behavior as I removed the previously added observer. So, chill!");
    }
}
