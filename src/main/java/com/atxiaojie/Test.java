package com.atxiaojie;

import com.atxiaojie.enums.RechargeTypeEnum;

import java.util.Random;

/**
 * @ClassName: Test
 * @Description: 测试类，Java代码中采用策略模式消除大量的 if else代码结构
 * 还使用了枚举单例模式
 * @author: zhouxiaojie
 * @date: 2022/2/14 17:05
 * @Version: V1.0.0
 */
public class Test {

    /**
     * @MethodsName: getHamburgTypeEnum
     * @Description 为了方便测试，随机获取一个充值方式
     * @Author zhouxiaojie
     * @Date 8:45 2022/2/16
     * @Param []
     * @return com.atxiaojie.enums.RechargeTypeEnum
     **/
    private static RechargeTypeEnum getHamburgTypeEnum() {
        return RechargeTypeEnum.values()[new Random().nextInt(RechargeTypeEnum.values().length)];
    }

    public static void main(String[] args) {
        /*对比：如果第一种方式需要增加一种支付方式，需要在RechargeTypeEnum中加，在写一个实现Strategy的接口，然后calRecharge方法需要在写一个else if
         第二种方式：只需要在RechargeTypeEnum中加一个枚举，在写一个实现Strategy的接口*/

        //第一种方式
//        Double bMoney = calRecharge(100D, RechargeTypeEnum.TAOBAO_RECHARGE);
//        System.out.println(bMoney);

        //第二种方式
        Context context = new Context();
        Double aMoney = context.calRecharge(100D, getHamburgTypeEnum().getValue());
        System.out.println(aMoney);
    }

    /**
     * @MethodsName: calRecharge
     * @Description 原始计算用户所付金额，和上面的策略模式实现的对比
     * @Author zhouxiaojie
     * @Date 17:22 2022/2/14
     * @Param [charge, type]
     * @return java.lang.Double
     **/
    public static Double calRecharge(Double charge, RechargeTypeEnum type){
        if(type.equals(RechargeTypeEnum.E_BANK)){
            return charge * 0.85;
        }else if(type.equals(RechargeTypeEnum.BUST_ACCOUNTS)){
            return charge * 0.90;
        }else if(type.equals(RechargeTypeEnum.MOBILE)){
            return charge;
        }else if(type.equals(RechargeTypeEnum.CARD_RECHARGE)){
            return charge + charge * 0.01;
        }else{
            return null;
        }
    }
}
