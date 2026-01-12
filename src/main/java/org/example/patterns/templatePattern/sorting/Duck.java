package org.example.patterns.templatePattern.sorting;

public class Duck implements Comparable<Duck>{

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

//    @Override
    public String toString() {
        return "Duck" +
                "name='" + name + '\'' +
                ", weight=" + weight ;
    }

//    @Override
    public int compareTo(Duck o) { //Sort is a template method inwhich we have to say something like how you want to compare else, by default,,
        if(this.weight < o.weight) return -1;
        if(this.weight > o.weight) return 1;
        return 0;
    }
}
