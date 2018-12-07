/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.UserHelper;
import java.util.List;
import pojos.User;

/**
 *
 * @author Windows
 */
public class TestUser {

    public static void main(String[] args) {
        UserHelper user = new UserHelper();
        System.out.println(new Gson().toJson(user.login("puspa@usd.ac.id", "123456789")));
//        System.out.println(new Gson().toJson(user.login("puspa@usd.ac.id", "1234")));        
//        UserHelper U = new UserHelper();
//        User user = U.login("puspa@usd.ac.id", "123456789");
//        List<User> list = U.getAllUser();
////        UserHelper U = new UserHelper();
//////        User user = U.cariUser("puspa@usd.ac.id");
////        List<User> list = U.getAllUser();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getEmail());
//            System.out.println(list.get(i).getPassword());
//        }
    }
}
