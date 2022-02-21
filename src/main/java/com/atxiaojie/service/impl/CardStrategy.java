package com.atxiaojie.service.impl;

import com.atxiaojie.service.Strategy;

/**
 * @ClassName: CardStrategy
 * @Description: 充值卡充值
 * @author: zhouxiaojie
 * @date: 2022/2/14 16:49
 * @Version: V1.0.0
 */
public class CardStrategy implements Strategy {
    public Double calRecharge(Double charge) {
        return charge+charge*0.01;
    }
}
