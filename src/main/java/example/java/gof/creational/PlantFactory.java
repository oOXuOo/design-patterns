package example.java.gof.creational;

import example.java.gof.creational.factory.*;

/**
 * Created by zhangxu on 2017/9/3.
 * Abstract factory is normally used for things like dependency injection/strategy,
 * when you want to be able to create a whole family of objects that
 * need to be of "the same kind", and have some common base classes.
 *
 * Here's a vaguely fruit-related example. The use case here is that we want to make sure
 * that we don't accidentally use an OrangePicker on an Apple. As long at we get our Fruit and FruitPicker
 * from the same factory, they will match.
 */
public interface PlantFactory {
    Fruit makeFruit();
    FruitPicker makePicker();
}

class ApplePlantFactory implements PlantFactory {
    public Fruit makeFruit() {
        return new Apple();
    }
    public FruitPicker makePicker(){
        return new ApplePicker();
    }
}

class OrangePlantFactory implements PlantFactory {
    public Fruit makeFruit() {
        return new Orange();
    }
    public FruitPicker makePicker() {
        return new OrangePicker();
    }
}