package me.xyh.patchserver.config;

import me.xyh.patchserver.sys.bean.SysUser;
import me.xyh.patchserver.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SecurityService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.printf("xyh=====");
        //获取登陆用户
        SysUser loginUser = userService.selectUserByLoginNo(s);
        if(loginUser == null){
            throw new UsernameNotFoundException("未查询到用户");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("test"));
        //转成userDetails
        User userDetails = new User(loginUser.getLoginNo(), passwordEncoder.encode(loginUser.getPassword()), authorities);
        return userDetails;
    }
}
