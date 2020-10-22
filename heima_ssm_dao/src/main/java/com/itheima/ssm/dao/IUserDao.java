package com.itheima.ssm.dao;

import com.itheima.ssm.domain.UserInfo;
import org.apache.ibatis.annotations.Select;

public interface IUserDao {

    @Select("select * from users where username=#{username}")
    public UserInfo findByUsername(String username) throws Exception;
}
