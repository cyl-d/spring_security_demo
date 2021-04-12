package com.atguigu.test;

import com.atguigu.util.MD5Utils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author cyl
 * @create 2021/4/7 19:07
 */
public class TestMD5 {

//    public static void main(String[] args) {
//        String s = MD5Utils.md5("123");
//        String s1 = MD5Utils.md5("123");
//        System.out.println(s);
//        System.out.println(s1);
//    }
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//      $2a$10$lHpD8hCVpG98k3etr4viPubgjfTVzXIkvd8.o6dfb2mBJAX.Jw8xG
        String admin = bCryptPasswordEncoder.encode("admin");
        System.out.println(admin);
        boolean admin1 = bCryptPasswordEncoder.matches("admin", "$2a$10$lHpD8hCVpG98k3etr4viPubgjfTVzXIkvd8.o6dfb2mBJAX.Jw8xG");
        System.out.println(admin1);
    }

}
