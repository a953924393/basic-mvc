package com.wodsy.web.controller;

//~--- non-JDK imports --------------------------------------------------------

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

import com.wodsy.common.constant.SessionConstants;
import com.wodsy.model.User;
import com.wodsy.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//~--- JDK imports ------------------------------------------------------------

import javax.annotation.Resource;

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
    @Resource
    UserService userService;

    /**
     * Method description  分页测试

     * @return
     */
    @RequestMapping("queryByPage")
    @ResponseBody
    public PageBounds queryByPage() {
        PageBounds pageBounds = new PageBounds(10);

        return pageBounds;
    }

    /**
     * Method description
     * @param id
     *
     * @return
     */
    @RequestMapping("selectById")
    @ResponseBody
    public User selectByPrimaryKey(Integer id) {
        return userService.selectByPrimaryKey(id);
    }

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


//~ Formatted by Jindent --- http://www.jindent.com
