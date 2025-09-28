package com.lowleveldesign.designpatterns.structural.bridge;

public abstract class Shape {
    protected IColour iColour;

    public Shape(IColour iColour) {
        this.iColour = iColour;
    }

    abstract public String draw();
}

class Square extends Shape {

    public Square(IColour iColour) {
        super(iColour);
    }

    @Override
    public String draw() {
        return "Square drawn. " + iColour.fill();
    }
}