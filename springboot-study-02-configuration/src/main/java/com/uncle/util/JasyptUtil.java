package com.uncle.util;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @program: SpringBoot-study
 * @description: 加密类
 * @author: 步尔斯特
 * @create: 2021-03-01 22:08
 **/
public class JasyptUtil {

    public static void main(String[] args) {
        BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();

        basicTextEncryptor.setPassword("123456!@#");
        String username = basicTextEncryptor.encrypt("root");
        String password = basicTextEncryptor.encrypt("123");
        System.out.println(username);//GoEQrEWvxoBkvdP5/6FBeA==
        System.out.println(password);//ZGnguOqo6I3M8V9OOwlzHA==

    }
}
