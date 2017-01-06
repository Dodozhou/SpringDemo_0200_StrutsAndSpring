package com.star.service;

/**
 * Created by hp on 2017/1/6.
 */
public class CheckUser implements Check {
    public boolean checkok(String username, String password) {
        if (password.equals("zhou") && username.equals("zhou")){
            return true;
        }
        return false;
    }
}
