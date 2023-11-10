package domain;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class HelloTargetInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before MemberServiceLogger.intercept()");
        Object returnValue = methodProxy.invokeSuper(object, args);
        System.out.println("after MemberServiceLogger.intercept()");
        return returnValue;
    }
}
