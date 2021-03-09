package com.uncle.service;

import com.uncle.bean.Guest;
import com.uncle.mapper.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SpringBoot-study
 * @description: 嘉宾业务接口的实现类
 * @author: 步尔斯特
 * @create: 2021-03-03 14:25
 **/
@Service
public class GuestServiceImpl implements GuestService{

    @Autowired
    private GuestMapper guestMapper;

    @Override
    public List<Guest> list() {
        return guestMapper.list();
    }

    @Override
    public void add(Guest guest) {
        guestMapper.add(guest);
    }

    @Override
    public void update(Guest guest) {
        guestMapper.update(guest);
    }

    @Override
    public Guest getName(String name) {
        return guestMapper.getName(name);
    }

    @Override
    public void delete(String name) {
        guestMapper.delete(name);
    }
}
