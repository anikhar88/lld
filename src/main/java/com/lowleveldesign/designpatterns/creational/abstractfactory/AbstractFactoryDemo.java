package com.lowleveldesign.designpatterns.creational.abstractfactory;

// The abstract factory interface declares a set of methods that
// return different abstract products. These products are called
// a family and are related by a high-level theme or concept.
// Products of one family are usually able to collaborate among
// themselves. A family of products may have several variants,
// but the products of one variant are incompatible with the
// products of another variant.
interface Button {
    void render();
}

interface Checkbox {
    void render();
}

// Dark Theme
class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Dark Button");
    }
}

class DarkCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Dark Checkbox");
    }
}

// Light Theme
class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Light Button");
    }
}

class LightCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Light Checkbox");
    }
}

 interface UIAbstractFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class DarkThemeFactory implements UIAbstractFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}

class LightThemeFactory implements UIAbstractFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}


public class AbstractFactoryDemo {
    private final Button button;
    private final Checkbox checkbox;

    public AbstractFactoryDemo(UIAbstractFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        // Switch factory dynamically
        UIAbstractFactory factory = new DarkThemeFactory(); // or new LightThemeFactory()
        AbstractFactoryDemo app = new AbstractFactoryDemo(factory);
        app.renderUI();
    }
}
