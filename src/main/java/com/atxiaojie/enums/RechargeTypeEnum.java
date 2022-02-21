package com.atxiaojie.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: RechargeTypeEnum
 * @Description: 策略枚举类
 * @author: zhouxiaojie
 * @date: 2022/2/14 16:41
 * @Version: V1.0.0
 */
@Getter
@AllArgsConstructor
public enum RechargeTypeEnum {

    E_BANK(1,"网银", "com.atxiaojie.service.impl.EBankStrategy"),
    BUST_ACCOUNTS(2, "商户账号", "com.atxiaojie.service.impl.BusiAcctStrategy"),
    MOBILE(3, "手机卡充值", "com.atxiaojie.service.impl.MobileStrategy"),
    CARD_RECHARGE(4, "充值卡", "com.atxiaojie.service.impl.CardStrategy"),
    TAOBAO_RECHARGE(5, "淘宝充值", "com.atxiaojie.service.impl.TaobaoStrategy");

    private int value;
    private String desc;
    private String clazz;

    public static RechargeTypeEnum valueOf(int value){
        for(RechargeTypeEnum type : RechargeTypeEnum.values()){
            if(type.getValue() == value){
                return type;
            }
        }
        return null;
    }

    public static Map<Integer, String> getAllClazz() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (RechargeTypeEnum msgEnum : RechargeTypeEnum.values()) {
            map.put(msgEnum.getValue(), msgEnum.getClazz());
        }
        return map;
    }
}
