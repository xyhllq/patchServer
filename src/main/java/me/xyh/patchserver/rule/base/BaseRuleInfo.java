package me.xyh.patchserver.rule.base;

import lombok.Data;

/**
 * Created by: xuyuhang
 * Created time:    2021/6/14 14:31
 * Description:  规则信息---对应的是表结构
 */
@Data
public class BaseRuleInfo {
    /**
     * 规则id
     */
    private Long ruleId;
    /**
     * 规则名称
     */
    private String ruleName;
    /**
     * 规则类型
     */
    private String ruleType;

    /**
     * 规则信息
     */
    private String ruleInfo;
}
