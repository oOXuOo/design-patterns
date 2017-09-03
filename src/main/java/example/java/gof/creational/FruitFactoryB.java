package example.java.gof.creational;

import example.java.gof.creational.factory.Apple;
import example.java.gof.creational.factory.Fruit;
import example.java.gof.creational.factory.Orange;

/**
 * (多态)工厂方法
 * Factory method is generally used when you have some generic processing in a class,
 * but want to vary which kind of fruit you actually use. So:
 */

abstract class FruitFactoryB {

    protected abstract Fruit makeFruit();

    public void pickFruit() {
        // The fruit we will work on..
        // ...<bla bla bla>...
    }
}

/**
 * ...then you can reuse the common functionality in FruitFactoryB.pickFruit()
 * by implementing a factory method in subclasses:
 */
class AppleFactory extends FruitFactoryB {
    @Override
    public Fruit makeFruit() {
        return new Apple();
    }
}
class OrangeFactory extends FruitFactoryB {
    @Override
    public Fruit makeFruit() {
        return new Orange();
    }
}
