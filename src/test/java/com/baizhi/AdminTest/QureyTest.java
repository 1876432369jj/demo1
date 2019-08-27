package com.baizhi.AdminTest;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QureyTest {
    @Autowired
    private AdminDao adminDao;


    @Test
    public void qureyOne() {
        String username = "123";
        Admin admin = adminDao.qureyOne(username);

        System.out.println(admin);
    }
}