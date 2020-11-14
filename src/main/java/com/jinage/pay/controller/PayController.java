package com.jinage.pay.controller;

import com.jinage.pay.service.PayService;
import com.lly835.bestpay.model.PayResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jiange
 * @version 1.0
 * @date 2020/11/14 15:07
 */
@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private PayService payService;

    @GetMapping("/create")
    public ModelAndView create(@RequestParam(value = "orderId", required = false) String orderId,
                               @RequestParam(value = "amount", required = false) BigDecimal amount
    ) {
        if (StringUtils.isBlank(orderId)){
            orderId = String.valueOf(System.currentTimeMillis());
        }
        PayResponse response = payService.create(orderId, BigDecimal.valueOf(0.01));
        Map map = new HashMap<>();
        map.put("codeUrl", response.getCodeUrl());
        return new ModelAndView("create", map);
    }
}
