package com.uncle.mapper;

import com.uncle.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: SpringBoot-study
 * @description: 嘉宾的mapper
 * @author: 步尔斯特
 * @create: 2021-03-03 14:27
 **/
@Repository
public class GuestMapper {

    static List<Guest> guestList = new ArrayList<>();
    static {
        guestList.add(new Guest("小明", "老板"));
        guestList.add(new Guest("康子", "诗人"));
        guestList.add(new Guest("张一山", "演员"));
        guestList.add(new Guest("赵本山", "投资人"));
    }

    public List<Guest> list() {
        return guestList;
    }

    public void add(Guest guest) {
        guestList.add(guest);
    }

    public void update(Guest guest) {
        String name = guest.getName();
        Guest guest1 = getName(name);
        guest1.setRole(guest.getRole());
    }

    public Guest getName(String name) {
        for (Guest guest : guestList) {
            if (guest.getName().equals(name)) {
                return guest;
            }
        }
        return new Guest("","");
    }

    public void delete(String name) {
        Guest guest = getName(name);
        System.out.println(guest);
        guestList.remove(guest);
    }

}
