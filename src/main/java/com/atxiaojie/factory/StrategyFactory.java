package com.atxiaojie.factory;

import com.atxiaojie.enums.RechargeTypeEnum;
import com.atxiaojie.service.Strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: StrategyFactory
 * @Description: 工厂类，单例模式
 * @author: zhouxiaojie
 * @date: 2022/2/14 16:50
 * @Version: V1.0.0
 */
public enum StrategyFactory {

    INSTANCE;

    private static Map<Integer, Strategy> strategyMap = new HashMap<Integer, Strategy>(RechargeTypeEnum.values().length);

    static {
        if(RechargeTypeEnum.values().length > 0){
            for(RechargeTypeEnum type : RechargeTypeEnum.values()){
                strategyMap.put(type.getValue(), getInstance(type.getValue()));
            }
        }
    }

    public Strategy creator(Integer type){
        return strategyMap.get(type);
    }

    /**
     * @MethodsName: getInstance
     * @Description 利用反射创建实例
     * @Author zhouxiaojie
     * @Date 19:18 2022/2/14
     * @Param [value]
     * @return com.atxiaojie.service.Strategy
     **/
    public static Strategy getInstance(Integer value){
        Strategy inter = null;
        Map<Integer, String> allClazz = RechargeTypeEnum.getAllClazz();
        String clazz = allClazz.get(value);
        if (value !=null) {
            try {
                try {
                    //调用无参构造器创建实例
                    inter = (Strategy) Class.forName(clazz).newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return inter;
    }
}
