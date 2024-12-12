package com.mysite.mybatis;

import org.apache.ibatis.annotations.*;

import java.util.List;

//JPA 리파지토리
@Mapper
public interface UserMapper {

    //#{}는 변수인데 메소드의 입력값을 넣음
    @Select("select id,name,phone,address from user where id=#{id}")
    public User getUserById(String id);

    @Select("select * from user")
    public List<User> getUserList();

    @Insert("insert into user values(#{id}, #{name}, #{phone}, #{address})")
    int insertUser(String id, String name, String phone, String address);

    @Update("update user set name=#{name}, phone=#{phone}, address=#{address} where id=#{id}")
    int updateUser(String id, String name, String phone, String address);

    @Delete("delete from user where id=#{id}")
    int deleteUser(String id);

}

