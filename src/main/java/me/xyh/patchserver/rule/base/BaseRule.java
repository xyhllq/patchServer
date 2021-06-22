package me.xyh.patchserver.rule.base;

import java.util.Map;

/**
 * Created by: xuyuhang
 * Created time:    2021/6/14 14:28
 * Description:  基础规则接口
 */
public interface BaseRule {
    /**
     *  判断是否符合
     *  符合返回 true
     *  不符合返回 false
     * @param value 用于被规则判断的值
     * @param key 执行的规则信息
     * @return
     */
    boolean execute(String value,BaseRuleInfo key);
}
