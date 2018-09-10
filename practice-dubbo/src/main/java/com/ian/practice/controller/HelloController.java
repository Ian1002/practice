package com.ian.practice.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Controller
 *
 * @author YangJing
 * @date 2018年6月5日上午10:01:07
 */
@RestController
public class HelloController extends BaseController {

    @GetMapping("/hello")
    public String hello(Model model) {
        logger.debug("hello Model:{}", model);

        return "hello ian";
    }
}
