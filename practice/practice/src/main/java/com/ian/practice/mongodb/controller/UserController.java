package com.ian.practice.mongodb.controller;

import com.ian.practice.controller.BaseController;
import com.ian.practice.mongodb.model.User;
import com.ian.practice.mongodb.service.UserService;
import com.ian.practice.util.ResultData;
import com.ian.practice.util.ResultDataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author YangJing
 * @date 2018/10/30 14:55
 */
@RestController
@RequestMapping("user/")
public class UserController extends BaseController {


    @Autowired
    private UserService userService;

    /**
     * 查询列表
     *
     * @param user
     * @param pageable
     * @return
     */
    @RequestMapping("list")
    public ResultData list(@RequestBody User user, @PageableDefault(page = 0, size = 10, sort = "name,asc") Pageable pageable) {

        logger.debug("user list user:{},pageable:{}", user, pageable);

        return ResultDataFactory.getSuccess(userService.list(user, pageable));
    }


    /**
     * 新增
     *
     * @param user
     * @return
     */
    @RequestMapping("insert")
    public ResultData insert(@RequestBody User user) {
        logger.debug("user insert user:{}", user);

        userService.insert(user);
        return ResultDataFactory.getSuccess();
    }

    /**
     * 修改
     *
     * @param user
     * @return
     */
    @RequestMapping("update")
    public ResultData update(@RequestBody User user) {
        logger.debug("user update user:{}", user);

        userService.update(user);
        return ResultDataFactory.getSuccess();
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public ResultData delete(String id) {
        logger.debug("user delete id：{}", id);

        userService.delete(id);
        return ResultDataFactory.getSuccess();
    }
}
