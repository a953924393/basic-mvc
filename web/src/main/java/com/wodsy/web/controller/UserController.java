package com.wodsy.web.controller;

import com.wodsy.common.constant.SessionConstants;
import com.wodsy.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * 名称：com.wodsy.web.controller
 * 描述：<br>
 * 类型：JAVA<br>
 * 最近修改时间：02/12/2014 13:25<br>
 *
 * @author Jack Chan
 * @since 02/12/2014
 */
@Controller
@RequestMapping("user")
public class UserController {

    /**
     * 登陆，有两个相同的User.class {@link User}
     *
     * @param user    从前台或其他方法传入，
     * @param currentUser   使用{@link com.wodsy.web.spring.UserArgumentResolver} 注入，存在于session中的user
     * @param session
     */
    @RequestMapping("login")
    public void login(@ModelAttribute User user, User currentUser, HttpSession session) {
        session.setAttribute(SessionConstants.SESSION_USER, user);
    }


    /**
     * 测试user是否注入成功
     *
     * @param user
     */
    @RequestMapping("userDi")
    public void userDi(User user) {
        System.out.println(user);
    }
}
