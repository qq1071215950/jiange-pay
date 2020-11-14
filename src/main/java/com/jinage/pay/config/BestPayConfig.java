package com.jinage.pay.config;

import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.service.BestPayService;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author jiange
 * @version 1.0
 * @date 2020/11/14 16:24
 */
@Component
public class BestPayConfig {
    @Bean
    public BestPayService bestPayService() {
        WxPayConfig wxPayConfig = new WxPayConfig();
        wxPayConfig.setAppId("wxd898fcb01713c658");
        wxPayConfig.setMchId("1483469312");
        wxPayConfig.setMchKey("098F6BCD4621D373CADE4E832627B4F6");
        //192.168.50.101 同一局域网可访问
        //125.121.56.227 云服务器可行，家庭宽带不行(路由器、光猫)
        wxPayConfig.setNotifyUrl("http://jinage123.natapp1.cc/pay/notify");
        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayConfig(wxPayConfig);
        return bestPayService;
    }

}
