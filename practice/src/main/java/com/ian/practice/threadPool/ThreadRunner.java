package com.ian.practice.threadPool;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试线程类
 *
 * @author YangJing
 * 
 * @date 2018年6月4日下午6:15:15
 */
public class ThreadRunner extends Thread {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 创建线程时创建
	 */
	private Integer num;

	public ThreadRunner(Integer num) {
		this.num = num;
	}

	public void run() {
		logger.info("num:{}", num);
		try {// 使线程睡眠，模拟线程阻塞情况
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
