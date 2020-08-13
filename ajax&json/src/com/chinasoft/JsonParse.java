package com.chinasoft;

import com.alibaba.fastjson.JSON;
import com.chinasoft.domain.User;
import org.junit.Test;

import java.util.Date;

public class JsonParse {





//    对象转换为String类型的数据
    @Test
   public void test1(){
        User user = new User();
       
        user.setAge(20);
        user.setChecked(true);
        user.setBirthday(new Date());
		
		ljjljlljlkkk
		
//      转为object类型的数据
        Object o = JSON.toJSON(user);
		
		oljljlj
        System.out.println(o);
//        转换为string类型
        String s = JSON.toJSONString(user);
        System.out.println(s);
		
		
		fsdfdsf
		
		sd
		fastjsonsdf
		
		
    }

//    String类型转换为User对象
    @Test
    public void test2(){
//        String str =  "{\"age\":20,\"birthday\":1594882248947,\"checked\":true,\"id\":1,\"name\":\"java\"}";
        String str ="{\"age\":20,\"birthday\":1594882248947,\"checked\":true,\"id\":1,\"name\":\"java\"}";
        User user = JSON.parseObject(str, User.class);
        System.out.println(user);


    }






}
