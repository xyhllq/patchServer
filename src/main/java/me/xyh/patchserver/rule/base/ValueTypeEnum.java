package me.xyh.patchserver.rule.base;

/**
 * Created by: xuyuhang
 * Created time:    2021/6/14 15:36
 * Description: 用于匹配的值的类型
 */
public enum ValueTypeEnum {
    INTEGER(1,"Integer"),
    STRING(2,"String");
    private int code;

    private String value;

    ValueTypeEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
