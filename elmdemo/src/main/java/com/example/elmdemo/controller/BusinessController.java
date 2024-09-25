package com.example.elmdemo.controller;
import com.example.elmdemo.pojo.Business;
import com.example.elmdemo.pojo.User;
import com.example.elmdemo.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//返回jason字符串
@RestController
public class BusinessController {
    @Autowired
    private BusinessService businessService;
    @RequestMapping("getIndexBusiness")
    public List<Business> getIndexBusiness(){
        return businessService.getIndexBusiness();
    }

    @RequestMapping("getBusinessByType")
    public List<Business> getBusinessByType(int typeid){
        return businessService.getBusinessByType(typeid);
    }

    @RequestMapping("checkLogin")
    public User checkLogin(User user){
        return businessService.checkLogin(user);
    }
}
