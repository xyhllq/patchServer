package me.xyh.patchserver.sys.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("sys_user")
@Data
public class SysUser {
    private Integer id;
    private String loginNo;
    private String password;
}
