package com.example.elmdemo.service.imp;

import com.example.elmdemo.mapper.BusinessMapper;
import com.example.elmdemo.pojo.Business;
import com.example.elmdemo.pojo.User;
import com.example.elmdemo.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusinessServiceimp  implements BusinessService {
    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public List<Business> getIndexBusiness() {
        return businessMapper.getIndexBusiness();
    }

    @Override
    public List<Business> getBusinessByType(int typeid) {
        return businessMapper.getBusinessByType(typeid);
    }

    @Override
    public User checkLogin(User user) {
        return businessMapper.checkLogin(user);
    }
}
