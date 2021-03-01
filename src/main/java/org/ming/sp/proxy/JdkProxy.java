package org.ming.sp.proxy;

import javax.swing.text.html.ObjectView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {

    //目標類
    private Object targetObject;

    //獲取代理對象
    public Object newProxyInstance(Object targetObject){
        this.targetObject = targetObject;

        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
        try {
            System.out.println("通過JDK動態代理調用"+method.getName()+",打印log begin");
            result = method.invoke(targetObject, args);
            System.out.println("通過JDK動態代理調用"+method.getName()+",打印log end");
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
