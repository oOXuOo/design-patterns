package example.java.gof.creational;

/**
 * Created by zhangxu on 2017/9/3.
 *
 * 静态内部类
 */
public class SingletonC {
    private static class SingletonHolder {
        private static final SingletonC INSTANCE = new SingletonC();
    }

    private SingletonC(){}

    public static SingletonC getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

