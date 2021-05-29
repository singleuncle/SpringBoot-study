package com.uncle.mapper;

import com.uncle.bean.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: SpringBoot-study
 * @description: 嘉宾的dao层
 * @author: 步尔斯特
 * @create: 2021-03-10 14:02
 **/
//@Mapper
public interface GuestMapper {
    @Select("select name,role from guest")
    List<Guest> list();
}
