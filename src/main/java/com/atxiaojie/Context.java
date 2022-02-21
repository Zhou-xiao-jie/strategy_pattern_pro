package com.atxiaojie;

import com.atxiaojie.factory.StrategyFactory;
import com.atxiaojie.service.Strategy;
import lombok.Data;

/**
 * @ClassName: Context
 * @Description: 场景类
 * @author: zhouxiaojie
 * @date: 2022/2/14 16:50
 * @Version: V1.0.0
 */
@Data
public class Context {

    private Strategy strategy;

    public Double calRecharge(Double charge, Integer type){
        strategy = StrategyFactory.INSTANCE.creator(type);
        return strategy.calRecharge(charge);
    }
}
