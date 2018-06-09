package com.creatshare.service;

import com.creatshare.dao.DBdao;
import com.creatshare.domain.User;

/**
 * Created by 15114 on 2017/7/23.
 */
public class LoginService {

    public boolean confirmUser(String userName , String passWord) throws Exception {
        DBdao dbdao = new DBdao();
        User user = dbdao.findUserByNmae(userName);
        if(user == null){
            return false;
        }else if(passWord.equals(user.getPassword())){
            return true;
        }else {
            return false;
        }
    }
}
