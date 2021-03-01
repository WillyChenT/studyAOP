package org.ming.sp.proxy;

public class ProxyTest {

    public static void main(String [] args){

//        PayService payService = new PayServiceImpl();
//
//        payService.callback("AAAAAbbbbbccc");

//        PayService payService = new StaticProxyPayServiceImpl(new PayServiceImpl());
//        payService.save(234,4232);


//        //JDK動態代理
//        JdkProxy jdkProxy = new JdkProxy();
//
//        //獲取代理類對象
//        PayService payServiceProxy = (PayService) jdkProxy.newProxyInstance(new PayServiceImpl());
//
//        //調用目標方法
//        payServiceProxy.callback("efefeff");
//        payServiceProxy.save(234,4232);


        //CGLIB動態代理
        CglibProxy cglibProxy = new CglibProxy();
        PayService payService = (PayService) cglibProxy.newProxyInstance(new PayServiceImpl());

        payService.save(23,234);
        payService.callback("dfdsfdsfsdfs");

    }
}
