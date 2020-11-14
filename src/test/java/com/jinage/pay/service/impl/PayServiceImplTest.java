package com.jinage.pay.service.impl;

import com.jinage.pay.PayApplicationTests;
import com.jinage.pay.service.PayService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author jiange
 * @version 1.0
 * @date 2020/11/14 14:38
 */
public class PayServiceImplTest extends PayApplicationTests {

    @Autowired
    private PayService payService;

    @Test
    public void create(){
        String orderId = String.valueOf(System.currentTimeMillis());
        payService.create(orderId, BigDecimal.valueOf(0.01));
    }
}