package com.gnq.component.bean;/**
 * @author guonanqing
 * @date 2020/6/11 16:46
 * @version 1.0
 */

import java.io.Serializable;

/**
 * @author: guonanqing
 * @desc:
 * @date: 2020/6/11
 */
public class User implements Serializable {
    private static final long serialVersionUID = -1379081082687258309L;
    private Long id;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
