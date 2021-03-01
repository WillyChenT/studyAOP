package org.ming.sp.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    private Object targetObject;

    public Object newProxyInstance(Object targetObject){
        this.targetObject = targetObject;

        Enhancer enhancer = new Enhancer();
        //設置代理類的父類(目標類)
        enhancer.setSuperclass(this.targetObject.getClass());
        //設置回調函數
        enhancer.setCallback(this);
        //創毽子類(代理對象)
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        Object result = null;
        try {
            System.out.println("通過CGLIB動態代理調用"+method.getName()+",打印log begin");
            result = methodProxy.invokeSuper(o, objects);
            System.out.println("通過CGLIB動態代理調用"+method.getName()+",打印log end");
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
