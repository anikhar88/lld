package com.lowleveldesign.designpatterns.structural.bridge;

public interface IColour {
    public String fill();
}

class BlueColour implements IColour {

    @Override
    public String fill() {
        return "Filling Blue color";
    }
}
class RedColour implements IColour {

    @Override
    public String fill() {
        return "Filling Red color";
    }
}