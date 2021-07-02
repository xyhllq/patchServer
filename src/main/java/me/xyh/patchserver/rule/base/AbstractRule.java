package me.xyh.patchserver.rule.base;

import java.util.Map;

/**
 * Created by: xuyuhang
 * Created time:    2021/6/14 14:35
 * Description: 基础抽象规则执行
 */
public abstract class AbstractRule implements BaseRule{

    protected <T> T convert(String value) {
        return (T) value;
    }

    protected <T> boolean executeRule(T t,String rule) {
        return true;
    }
    /**
     * 这个如果被重写的话，会不输出规则信息
     *
     * 判断是否符合
     * 符合返回 true
     * 不符合返回 false
     *
     * @param value 用于被规则判断的值
     * @param rule   执行的规则信息
     * @return
     */
    @Override
    public boolean execute(String value, BaseRuleInfo rule) {
        System.out.println("执行的规则名字："+rule.getRuleName());
        System.out.println("执行的规则信息："+rule.getRuleInfo());
        return executeRule(convert(value),rule.getRuleInfo());
    }




}
