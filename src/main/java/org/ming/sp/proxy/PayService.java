package org.ming.sp.proxy;

public interface PayService {

    String callback(String outTradeNo);

    int save(int userId, int productId);
}
