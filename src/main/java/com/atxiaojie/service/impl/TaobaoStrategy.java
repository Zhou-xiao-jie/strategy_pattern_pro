package com.atxiaojie.service.impl;

import com.atxiaojie.service.Strategy;

/**
 * @ClassName: TaobaoStrategy
 * @Description: 淘宝充值
 * @author: zhouxiaojie
 * @date: 2022/2/14 17:28
 * @Version: V1.0.0
 */
public class TaobaoStrategy implements Strategy {
    public Double calRecharge(Double charge) {
        return charge*0.75;
    }
}
