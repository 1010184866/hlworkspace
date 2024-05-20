package com.hl.crud_hl.mapper;

import com.hl.crud_hl.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    void insert(User user);

    List<User> selectByUserId(@Param("user_id") Integer userid);

    List<User> selectAll();

    void update(User user);

    void delete(@Param("user_id") Integer userid);

}
