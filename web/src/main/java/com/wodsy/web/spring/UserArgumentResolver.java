package com.wodsy.web.spring;

import com.wodsy.common.constant.SessionConstants;
import com.wodsy.domain.User;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;

/**
 * 名称：com.wodsy.web.spring
 * 描述：<br> 注入user
 * 类型：JAVA<br>
 * 最近修改时间：02/12/2014 13:28<br>
 *
 * @author Jack Chan
 * @since 02/12/2014
 */
@Component
public class UserArgumentResolver implements WebArgumentResolver {

    public Object resolveArgument(MethodParameter methodParameter, NativeWebRequest webRequest) throws Exception {
        if (methodParameter.getParameterType().equals(User.class)) {
            return webRequest.getAttribute(SessionConstants.SESSION_USER, RequestAttributes.SCOPE_SESSION);
        }
        return UNRESOLVED;
    }
}
