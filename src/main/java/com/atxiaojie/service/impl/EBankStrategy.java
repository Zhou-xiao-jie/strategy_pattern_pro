package com.atxiaojie.service.impl;

import com.atxiaojie.service.Strategy;

/**
 * @ClassName: EBankStrategy
 * @Description: 网银充值
 * @author: zhouxiaojie
 * @date: 2022/2/14 16:41
 * @Version: V1.0.0
 */
public class EBankStrategy implements Strategy {
    public Double calRecharge(Double charge) {
        return charge*0.85;
    }
}
