package com.lowleveldesign.designpatterns.structural.decorator;

public interface ChristmasTree {
    String decorate();
}

// Base Implementation
class ChristmasTreeImpl implements ChristmasTree {

    @Override
    public String decorate() {
        return "Christmas tree";
    }
}

// Adding/decorating to base implementation
abstract class TreeDecorator implements ChristmasTree {
    private final ChristmasTree tree;

    public TreeDecorator(ChristmasTree christmasTree) {
        this.tree = christmasTree;
    }
    // standard constructors
    @Override
    public String decorate() {
        return tree.decorate();
    }
}

// Adding/decorating to base implementation
class Garland extends TreeDecorator {

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }
}

// Adding/decorating to base implementation
class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}