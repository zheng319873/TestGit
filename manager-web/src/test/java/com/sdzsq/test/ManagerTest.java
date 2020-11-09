package com.sdzsq.test;

import com.sdzsq.mapper.UsersMapper;
import com.sdzsq.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;
    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUserAge(20);
        users.setUserName("admin");
        this.usersMapper.insertUser(users);
    }
}
