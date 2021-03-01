package org.ming.sp.proxy;

public class PayServiceImpl implements PayService{


    @Override
    public String callback(String outTradeNo) {
        
        System.out.println("目標類 PayServiceImpl 回調方法 callback");
        return outTradeNo;
    }

    @Override
    public int save(int userId, int productId) {
        System.out.println("目標類 PayServiceImpl 回調方法 save");
        return productId;
    }
}
