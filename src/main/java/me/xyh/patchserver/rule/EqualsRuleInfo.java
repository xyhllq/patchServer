package me.xyh.patchserver.rule;

import lombok.Data;

/**
 * Created by: xuyuhang
 * Created time:    2021/6/14 15:50
 * Description:  判断两个值是否相等的规则的数据结构
 * 在 valueAddr 的 valueType 的值是否等于 value
 * user.userName 的 String 值 是否等于 “zhangsan”
 */
@Data
public class EqualsRuleInfo {
    /**
     *
     */
    private String valueType;
    /**
     *
     */
    private String valueAddr;
    /**
     *
     */
    private String value;
}
