package me.xyh.patchserver.rule;

import me.xyh.patchserver.rule.base.BaseRuleInfo;
import me.xyh.patchserver.utils.JacksonUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by: xuyuhang
 * Created time:    2021/6/14 16:08
 * Description:
 */
public class RuleTest {
    public static void main(String[] args) {
        EqualsRuleInfo equalsRuleInfo = new EqualsRuleInfo();
        equalsRuleInfo.setValueType("String");
        equalsRuleInfo.setValueAddr("user.userName");
        equalsRuleInfo.setValue("zhangsan");
        BaseRuleInfo baseRuleInfo = new BaseRuleInfo();
        baseRuleInfo.setRuleId(111111111111L);
        baseRuleInfo.setRuleName("筛选名字");
        baseRuleInfo.setRuleType("EqualsRule");
        baseRuleInfo.setRuleInfo(JacksonUtil.toJson(equalsRuleInfo));
        String userName = "zhangsan";
        Map<String,String> user = new HashMap<>();
        user.put("userName",userName);
        Map<String,String> value = new HashMap<>();
        value.put("user",JacksonUtil.toJson(user));
        EqualsRule equalsRule = new EqualsRule();
        System.out.println(equalsRule.execute(JacksonUtil.toJson(value),baseRuleInfo));

    }
}
