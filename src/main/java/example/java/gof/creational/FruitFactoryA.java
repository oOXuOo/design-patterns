package example.java.gof.creational;


import example.java.gof.creational.factory.Apple;
import example.java.gof.creational.factory.Fruit;
import example.java.gof.creational.factory.Orange;

import java.util.Collection;

/**
 * (静态)工厂方法
 * Factory methods are static methods that return an instance of the native class.
 *
 * <p>Common names for factory methods include getInstance and valueOf.
 * These names are not mandatory - choose whatever makes sense for each case.
 * <a href="http://www.javapractices.com/topic/TopicAction.do?Id=21">www.javapractices.com
 * </a></p>
 *
 * @see java.lang.Boolean#valueOf(boolean)
 * @see java.util.logging.LogManager#getLogManager()
 * @see java.util.regex.Pattern#compile(String)
 * @see java.util.Collections#unmodifiableCollection(Collection)
 * @see java.util.Collections#synchronizedCollection(Collection)
 * @see java.util.Calendar#getInstance()
 * @see java.sql.DriverManager#getConnection(String)
 *
 * @author zhangxu
 */
class ComplexNumber {

    /**
     * Static factory method returns an object of this class.
     */
    public static ComplexNumber valueOf(float aReal, float aImaginary) {
        return new ComplexNumber(aReal, aImaginary);
    }

    /**
     * Caller cannot see this private constructor.
     *
     * The only way to build a ComplexNumber is by calling the static
     * factory method.
     */
    private ComplexNumber(float aReal, float aImaginary) {
        fReal = aReal;
        fImaginary = aImaginary;
    }

    private float fReal;
    private float fImaginary;
}



/**
 * Factory is "fixed", in that you have just one implementation with no subclassing.
 * Use case: Constructing an Apple or an Orange is a bit too complex to handle in the constructor for either.
 * In this case, you will have a class like this:
 */
public class FruitFactoryA {

    private Apple makeApple() {
        // Code for creating an Apple here.
        return new Apple();
    }

    private Orange makeOrange() {
        // Code for creating an orange here.
        return new Orange();
    }

    public Fruit makeFruit(String type) {
        if ("apple".equals(type)) {
            return makeApple();
        } else if ("orange".equals(type)) {
            return makeOrange();
        } else {
            return null;
        }
    }
}