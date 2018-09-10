package com.ian.practice.service.impl;

import com.ian.practice.service.HelloRemoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * HelloRomteServiceImple
 *
 * @author YangJing
 * @date 2018/9/6 11:31
 */
@Service("helloRemoteService")
public class HelloRemoteServiceImpl implements HelloRemoteService {

    private Logger logger = LoggerFactory.getLogger(HelloRemoteService.class);

    @Override
    public String hello(String name) {
        logger.debug("hello name:{}", name);

        StringBuilder sb = new StringBuilder();

        sb.append("hello");
        sb.append(",");
        sb.append(name);

        try {
            logger.debug("睡眠10秒");
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.debug("处理结束");
        return sb.toString();
    }
}
