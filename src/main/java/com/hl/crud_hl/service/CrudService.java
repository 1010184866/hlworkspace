package com.hl.crud_hl.service;

import com.hl.crud_hl.dao.User;
import com.hl.crud_hl.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {
    @Autowired
    private UserMapper userMapper;
    public void insert(User user){
        userMapper.insert(user);
    }
    public List<User> selectAll(){
        return userMapper.selectAll();
    }
    public void update(User user){
        userMapper.update(user);
    }
    public void delete(Integer userid){
        userMapper.delete(userid);
    }

    public List<User> selectByUserId(Integer userid){
        return userMapper.selectByUserId(userid);
    }
}
