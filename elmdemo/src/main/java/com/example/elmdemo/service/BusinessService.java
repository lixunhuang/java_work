package com.example.elmdemo.service;


import com.example.elmdemo.pojo.Business;
import com.example.elmdemo.pojo.User;

import java.util.List;

public interface BusinessService {
    public List<Business> getIndexBusiness();

    public List<Business> getBusinessByType(int typeid);

    public User checkLogin(User user);

}
