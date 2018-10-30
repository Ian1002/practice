package com.ian.practice.mongodb.dao.impl;

import com.ian.practice.mongodb.dao.UserDao;
import com.ian.practice.mongodb.model.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserDaoImpl
 *
 * @author YangJing
 * @date 2018/10/30 10:06
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insert(User user) {

        mongoTemplate.insert(user);
    }

    @Override
    public void update(User user) {

        Criteria criteria = Criteria.where("id").is(user.get_id());
        Query query = new Query(criteria);
        Update update = Update.update("name", user.getName()).set("age", user.getAge());
        mongoTemplate.updateMulti(query, update, User.class);
    }

    @Override
    public void delete(String id) {
        Criteria criteria = Criteria.where("id").is(id);
        Query query = new Query(criteria);

        mongoTemplate.remove(query, User.class);
    }

    @Override
    public List<User> list(User user, Pageable pageable) {

        Query query = new Query();

        Criteria criteria = new Criteria();
        if (user.getAge() != null)
            criteria.where("age").is(user.getAge());
        if (StringUtils.isNotBlank(user.getName()))
            criteria.where("name").regex("^" + user.getName());

        query.addCriteria(criteria);
        return mongoTemplate.find(query.with(pageable), User.class);
    }

    @Override
    public User getById(String id) {

        Query query = Query.query(new Criteria().where("_id").is(id));

        return mongoTemplate.findOne(query, User.class);
    }
}
