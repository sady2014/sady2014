package com.thsware.mapper;

import com.thsware.entity.BugEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BugMapper {

    List<BugEntity> getAll();
}
