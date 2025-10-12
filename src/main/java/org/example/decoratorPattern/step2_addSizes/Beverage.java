package org.example.decoratorPattern.step2_addSizes;

public abstract class Beverage {

    public enum Sizes {TALL, GRANDE, VENTI}
    Sizes size = Sizes.TALL;

    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }
}
