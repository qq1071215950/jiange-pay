package com.jinage.pay.service.impl;

import com.jinage.pay.service.PayService;
import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;

import java.math.BigDecimal;

/**
 * @author jiange
 * @version 1.0
 * @date 2020/11/14 13:57
 */
public class PayServiceImpl implements PayService {

    @Override
    public void create(String orderId, BigDecimal amount) {
        WxPayConfig wxPayConfig = new WxPayConfig();
        wxPayConfig.setAppId(null);
        wxPayConfig.setMchId(null);
        wxPayConfig.setMchKey(null);

        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayConfig(wxPayConfig);

        PayRequest request = new PayRequest();

        bestPayService.pay(request);
    }
}
