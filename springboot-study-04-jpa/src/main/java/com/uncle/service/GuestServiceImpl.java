package com.uncle.service;

import com.uncle.bean.Guest;
import com.uncle.repository.GuestRepository;
import net.bytebuddy.asm.Advice;
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
    private GuestRepository guestRepository;

    @Override
    public List<Guest> list() {
        return guestRepository.findAll();
    }
}
