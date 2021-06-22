package me.xyh.patchserver.rule.base;

import java.util.Map;

/**
 * Created by: xuyuhang
 * Created time:    2021/6/14 14:35
 * Description: 基础抽象规则执行
 */
public abstract class AbstractRule implements BaseRule{

/*    protected <T> T convert(String dto) {
        return (T) dto;
    }

    protected <T> boolean executeRule(T t) {
        return true;
    }*/
    /**
     * 判断是否符合
     * 符合返回 true
     * 不符合返回 false
     *
     * @param value 用于被规则判断的值
     * @param key   执行的规则信息
     * @return
     */
    @Override
    public boolean execute(String value, BaseRuleInfo key) {
        return false;
    }




}
