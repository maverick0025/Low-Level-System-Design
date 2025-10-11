package org.example.observerPattern.step1;

public class TestSimple {
    public static void main(String[] args) {
        SubjectMain subjectMain = new SubjectMain();
        ObserverOne observerOne = new ObserverOne(subjectMain);

        subjectMain.setValue(100);
        System.out.println("------");
        subjectMain.setValue(328);

        subjectMain.removeObserver(observerOne);

        subjectMain.setValue(900);
        System.out.println("If you are not seeing Value: 900, that means there are no observers registered!");
    }
}
