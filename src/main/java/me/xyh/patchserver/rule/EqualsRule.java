package me.xyh.patchserver.rule;

import me.xyh.patchserver.rule.base.AbstractRule;
import me.xyh.patchserver.rule.base.BaseRuleInfo;
import me.xyh.patchserver.rule.base.ValueTypeEnum;
import me.xyh.patchserver.utils.JacksonUtil;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * Created by: xuyuhang
 * Created time:    2021/6/14 14:40
 * Description:判断两个值是否相等的规则的 判断器
 */
public class EqualsRule extends AbstractRule {

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
        System.out.println("执行的规则名字："+key.getRuleName());
        System.out.println("执行的规则信息："+key.getRuleInfo());
        EqualsRuleInfo rule = JacksonUtil.from(key.getRuleInfo(),EqualsRuleInfo.class);
        //用点分割需要转义
        String[] ruleAddr = rule.getValueAddr().split("\\.",-1);
        //先默认两级尝试一下
        String needValue1 = JacksonUtil.getAsString(value,ruleAddr[0]);
        String needValue2 = JacksonUtil.getAsString(needValue1,ruleAddr[1]);
        if(needValue2 == null || "".equals(needValue2)){
            return false;
        }
        if(!needValue2.equals(rule.getValue())){
            return false;
        }
        return true;
    }
}
