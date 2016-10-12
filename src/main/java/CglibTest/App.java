package CglibTest;

import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BusinessInterfaceProxy cglib = new BusinessInterfaceProxy();
        Object temp = cglib.getInstance(new BusinessObject());
        BusinessObject businessObject = (BusinessObject) temp;
        System.out.println(businessObject.getClass().getName());
        System.out.println(businessObject.getClass().getSuperclass().getName());
        System.out.println(businessObject.doSomething());
    }
}

