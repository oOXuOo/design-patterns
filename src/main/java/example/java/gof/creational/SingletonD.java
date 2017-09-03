package example.java.gof.creational;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by zhangxu on 2017/9/3.
 * 原子类型CAS无锁
 * @see <a href="http://www.jianshu.com/p/d9c9c947678a">简书</>
 */
public class SingletonD {
    private static final AtomicReference<SingletonD> INSTANCE = new AtomicReference<SingletonD>();
    private SingletonD(){}
    public static SingletonD getInstance() {
        for (;;) {
            SingletonD current = INSTANCE.get();
            if (current != null) {
                return current;
            }
            current = new SingletonD();
            if (INSTANCE.compareAndSet(null, current)) {
                return current;
            }
        }
    }
}