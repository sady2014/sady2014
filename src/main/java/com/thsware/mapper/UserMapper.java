package com.thsware.mapper;

import com.thsware.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface UserMapper {
    List<UserEntity> getAll();
}
