package me.xyh.patchserver.sys.service;

import me.xyh.patchserver.sys.bean.SysUser;

public interface UserService {
    SysUser selectUserByLoginNo(String loginNo);
}
