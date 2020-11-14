package com.jinage.pay.service;

import java.math.BigDecimal;

/**
 * @author jiange
 * @version 1.0
 * @date 2020/11/14 13:54
 */
public interface PayService {

    /**
     * 创建/发起支付
     */
    void create(String orderId, BigDecimal amount);

}
