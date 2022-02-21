package com.atxiaojie.service;

import com.atxiaojie.enums.RechargeTypeEnum;

/**
 * @ClassName: Strategy
 * @Description: 策略抽象类
 * @author: zhouxiaojie
 * @date: 2022/2/14 16:41
 * @Version: V1.0.0
 */
public interface Strategy {
    /**
     * @MethodsName: calRecharge
     * @Description 策略行为方法
     * @Author zhouxiaojie
     * @Date 16:42 2022/2/14
     * @Param [charge, typeEnum]
     * @return java.lang.Double
     **/
    public Double calRecharge(Double charge);
}
