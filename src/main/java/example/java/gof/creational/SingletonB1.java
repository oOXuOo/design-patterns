package example.java.gof.creational;

/**
 * Created by zhangxu on 2017/9/3.
 * SingletonA (recognizeable by creational methods returning the same instance (usually of itself) everytime)
 *
 * 懒汉式(普通同步)
 * @see java.awt.Desktop#getDesktop()
 */

public class SingletonB1 {
    private static SingletonB1 singleton;

    private SingletonB1() {}

    public static synchronized SingletonB1 getInstance() {
        if (singleton == null) {
            singleton = new SingletonB1();
        }
        return singleton;
    }
}

