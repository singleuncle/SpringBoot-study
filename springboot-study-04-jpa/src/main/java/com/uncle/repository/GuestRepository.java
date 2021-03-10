package com.uncle.repository;

import com.uncle.bean.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: SpringBoot-study
 * @description: 数据仓库
 * @author: 步尔斯特
 * @create: 2021-03-10 13:28
 **/
public interface GuestRepository extends JpaRepository<Guest,Long> {

}
