package com.ian.practice.controller;

import com.alibaba.dubbo.remoting.TimeoutException;
import com.ian.practice.service.HelloRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试Controller
 *
 * @author YangJing
 * @date 2018年6月5日上午10:01:07
 */
@RestController
public class HelloController extends BaseController {

    @Resource
    private HelloRemoteService helloRemoteService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        logger.debug("hello name:{}", name);

        String result = null;

        try {
            result = helloRemoteService.hello(name);
        } catch (RuntimeException e) {
            result = "RuntimeException";
        }
        return result;
    }
}
