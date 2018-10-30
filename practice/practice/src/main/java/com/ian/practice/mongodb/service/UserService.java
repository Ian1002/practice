package com.ian.practice.mongodb.service;

import com.ian.practice.mongodb.model.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * UserService
 *
 * @author YangJing
 * @date 2018/10/30 14:51
 */
public interface UserService {

    /**
     * 增加
     *
     * @param user
     */
    void insert(User user);

    /**
     * 修改
     *
     * @param user
     */
    void update(User user);

    /**
     * 删除
     *
     * @param id
     */
    void delete(String id);

    /**
     * 列表
     *
     * @return
     */
    List<User> list(User user, Pageable pageable);

    /**
     * 查询
     *
     * @param id
     * @return
     */
    User getById(String id);
}
