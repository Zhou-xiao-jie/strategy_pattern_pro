package com.atxiaojie.service.impl;

import com.atxiaojie.service.Strategy;

/**
 * @ClassName: MobileStrategy
 * @Description: 手机充值
 * @author: zhouxiaojie
 * @date: 2022/2/14 16:48
 * @Version: V1.0.0
 */
public class MobileStrategy implements Strategy {
    public Double calRecharge(Double charge) {
        return charge;
    }
}
