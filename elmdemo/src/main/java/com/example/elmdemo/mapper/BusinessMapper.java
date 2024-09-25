package com.example.elmdemo.mapper;

import com.example.elmdemo.pojo.Business;
import com.example.elmdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BusinessMapper {
    // 检索所有的商家信息
    @Select("select * from business")
    public List<Business> getIndexBusiness();
    //根据点餐分配检索商家信息
    @Select("select * from business where ordertypeid=#{typeid}")
    public List<Business> getBusinessByType(int typeid);

    //登录
    @Select("select * from user where userid=#{userid} and password=#{password}")
    public User checkLogin(User user);
}