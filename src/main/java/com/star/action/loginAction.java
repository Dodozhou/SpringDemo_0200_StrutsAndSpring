package com.star.action;

import com.opensymphony.xwork2.ActionSupport;
import com.star.service.Check;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Created by hp on 2017/1/6.
 */
//继承ActionSupport
public class loginAction extends ActionSupport{
    private String username;
    private String password;
    private Check check;

    public Check getCheck() {
        return check;
    }
    public void setCheck(Check check) {
        this.check = check;
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

    @Override
    public String execute() throws Exception {
        System.out.println(username+"    "+password);
        System.out.println(check);
        if (check.checkok(username,password)){
            return SUCCESS;
        }else
        return ERROR;
    }
}
