package com.ian.practice.controller;

import cn.net.zring.rad.material.model.ProduceCraft;
import cn.net.zring.rad.material.model.ProduceTask;
import cn.net.zring.rad.material.service.MaterialProduceRemoteService;
import com.alibaba.fastjson.JSON;
import com.ian.practice.util.ResultData;
import com.ian.practice.util.ResultDataFactory;
import com.sun.xml.internal.txw2.output.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试Controller
 *
 * @author YangJing
 * @date 2018年6月5日上午10:01:07
 */
@RestController
public class HelloController extends BaseController {

    @Resource
    private MaterialProduceRemoteService materialProduceRemoteService;

    @GetMapping("/hello")
    public String hello(Model model) {
        logger.debug("hello Model:{}", model);

        return "hello ian";
    }

    @GetMapping("/task/{materialCode}")
    public ResultData dubboTest(@PathVariable String materialCode) {
        logger.debug("dubboTest");

        List<ProduceTask> tasks = materialProduceRemoteService.getMaterialProduceTask(1L, materialCode);
        logger.debug("tasks:{}", JSON.toJSONString(tasks));

        return ResultDataFactory.getSuccess(tasks);
    }

}
