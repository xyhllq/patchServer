package me.xyh.patchserver.sys.service.impl;

import me.xyh.patchserver.sys.bean.SysUser;
import me.xyh.patchserver.sys.mapper.UserMapper;
import me.xyh.patchserver.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public SysUser selectUserByLoginNo(String loginNo) {
        SysUser user = new SysUser();
        user.setLoginNo("admin");
        user.setPassword("123");
        return user;
    }
}
