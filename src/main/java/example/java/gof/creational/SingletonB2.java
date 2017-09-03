package example.java.gof.creational;

/**
 * Created by zhangxu on 2017/9/3.
 * SingletonA (recognizeable by creational methods returning the same instance (usually of itself) everytime)
 *
 * 懒汉式(双重检查锁)
 */

public class SingletonB2 {
    private volatile static SingletonB2 singleton;

    private SingletonB2() {}

    public static SingletonB2 getInstance() {
        if (singleton == null) {
            synchronized (SingletonB2.class) {
                if (singleton == null) {
                    singleton = new SingletonB2();
                }
            }
        }
        return singleton;
    }

    /**
     * 改进版
     * @see <a href="https://en.wikipedia.org/wiki/Double-checked_locking#cite_ref-7">wikipedia</a>
     * @return singleton instance
     */
    public static SingletonB2 getInstance2() {
        SingletonB2 tmp = singleton;
        if (tmp == null) {
            synchronized (SingletonB2.class) {
                tmp = singleton;
                if (tmp == null) {
                    tmp = new SingletonB2();
                    singleton = tmp;
                }
            }
        }
        return tmp;
    }
}

