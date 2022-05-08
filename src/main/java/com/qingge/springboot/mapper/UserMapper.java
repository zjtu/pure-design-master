package com.qingge.springboot.mapper;

import com.qingge.springboot.controller.dto.UserPasswordDTO;
import com.qingge.springboot.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 青哥哥
 * @since 2022-01-26
 */
public interface UserMapper extends BaseMapper<User> {

    int updatePassword(UserPasswordDTO userPasswordDTO);

    @MapKey("id")
   Map<Integer,User> getUserAsMapById();
}
