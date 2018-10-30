package com.ian.practice.mongodb.service.impl;

import com.ian.practice.mongodb.dao.UserDao;
import com.ian.practice.mongodb.dao.impl.UserDaoImpl;
import com.ian.practice.mongodb.model.User;
import com.ian.practice.mongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl
 *
 * @author YangJing
 * @date 2018/10/30 14:52
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }

    @Override
    public List<User> list(User user, Pageable pageable) {
        return userDao.list(user, pageable);
    }

    @Override
    public User getById(String id) {
        return userDao.getById(id);
    }
}
