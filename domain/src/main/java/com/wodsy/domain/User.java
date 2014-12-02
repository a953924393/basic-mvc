package com.wodsy.domain;

/**
 * 名称：com.wodsy.domain
 * 描述：<br>
 * 类型：JAVA<br>
 * 最近修改时间：02/12/2014 13:23<br>
 *
 * @author Jack Chan
 * @since 02/12/2014
 */
public class User {
    private String account;
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
