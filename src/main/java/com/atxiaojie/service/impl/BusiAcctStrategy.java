package com.atxiaojie.service.impl;

import com.atxiaojie.service.Strategy;

/**
 * @ClassName: BusiAcctStrategy
 * @Description: 商户账号充值
 * @author: zhouxiaojie
 * @date: 2022/2/14 16:46
 * @Version: V1.0.0
 */
public class BusiAcctStrategy implements Strategy {
    public Double calRecharge(Double charge) {
        return charge*0.90;
    }
}
