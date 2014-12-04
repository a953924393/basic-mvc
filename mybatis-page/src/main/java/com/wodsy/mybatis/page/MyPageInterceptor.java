package com.wodsy.mybatis.page;

import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

/**
 * 名称：PACKAGE_NAME
 * 描述：<br>分页拦截器，不论是否存在缓存都可以进行分页
 * 类型：JAVA<br>
 * 最近修改时间：04/12/2014 15:01<br>
 *
 * @author Jack Chan
 * @since 04/12/2014
 */
@Intercepts({@Signature(
        type = Executor.class,
        method = "query",
        args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})})
public class MyPageInterceptor implements Interceptor {
    final static int STATEMENT = 0;
    final static int PARAMTER= 1;
    final static int ROW_BOUND = 2;
    final static int RESULT_HANDER = 3;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        MappedStatement mappedStatements = (MappedStatement) args[STATEMENT];
        Pagination pageination = (Pagination) args[ROW_BOUND];
        Map paramMap = (Map) args[PARAMTER];

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        if(target instanceof  Executor)
            return Plugin.wrap(target,this);
        else
            return target;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
