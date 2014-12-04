package com.wodsy.mybatis.page;

import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 名称：PACKAGE_NAME
 * 描述：<br>
 * 类型：JAVA<br>
 * 最近修改时间：04/12/2014 14:51<br>
 *
 * @author Jack Chan
 * @since 04/12/2014
 */
public class Pagination extends RowBounds{
    public static final int DEFAULT_PAGE_SIZE = 10;
    public static final int DEFAULT_CURRENT_PAGE= 1;

    private int pageSize;
    private int currentPage;
    private int totalPage;
    private int totalCount;
    private String order;
    private List<Object> dataList;


    public Pagination() {
        this.currentPage = DEFAULT_CURRENT_PAGE;
        this.pageSize = DEFAULT_PAGE_SIZE;
    }

    /**
     *
     * @param currentPage
     * @param pageSize
     */
    public Pagination(int currentPage, int pageSize) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public Pagination(int pageSize, int currentPage, String order) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.order = order;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<Object> getDataList() {
        return dataList;
    }

    public void setDataList(List<Object> dataList) {
        this.dataList = dataList;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
