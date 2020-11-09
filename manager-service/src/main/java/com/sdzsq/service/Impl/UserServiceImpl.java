package com.sdzsq.service.Impl;

import com.sdzsq.mapper.UsersMapper;
import com.sdzsq.pojo.Users;
import com.sdzsq.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UsersMapper usersMapper;

    public UserServiceImpl(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public void addUser(Users users) {
         this.usersMapper.insertUser(users);
    }
}
