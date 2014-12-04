package com.wodsy.mybatis.page;

/**
 * 名称：com.wodsy.mybatis.page
 * 描述：<br>
 * 类型：JAVA<br>
 * 最近修改时间：04/12/2014 16:36<br>
 *
 * @author Jack Chan
 * @since 04/12/2014
 */
public enum  PluginProperty {

    /**
     * 是否需要查询总数
     */
    TOTAL_COUNT("totalCount"),
    /**
     * 是否需要使用异步方式查询总数和分页，异步可以提高效率
     */
    ASYNC_TOTAL_COUNT("asyncTotalCount");
    private String property;
    private PluginProperty(String property) {
        this.property = property;
    }
}
