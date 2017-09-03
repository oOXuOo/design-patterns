package example.java.gof.creational;

/**
 * Created by zhangxu on 2017/9/3.
 * SingletonA (recognizeable by creational methods returning the same instance (usually of itself) everytime)
 *
 * 饿汉式
 * @see java.lang.Runtime#getRuntime()
 */

public class SingletonA {
    private static SingletonA singleton = new SingletonA();

    private SingletonA(){}

    public static SingletonA getInstance(){
        return singleton;
    }
}
