package com.huangli.provider.mapper;

import com.huangli.dubbo.api.bean.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author huangli
 * @version 1.0
 * @description TODO
 * @date 2019-07-22 16:43
 */
public interface UserMapper {
    @Results(id = "userMap", value = {
            @Result(column = "id", property = "userId"),
            @Result(column = "phone", property = "phone"),
            @Result(column = "user_name", property = "userName"),
            @Result(column = "password", property = "password")})
    @Select("SELECT * FROM tb_user")
    List<User> getAll();

    @Select("SELECT id, user_name FROM tb_user WHERE id = #{id}")
    @ResultMap("userMap")
    User getOne(Long id);
}
