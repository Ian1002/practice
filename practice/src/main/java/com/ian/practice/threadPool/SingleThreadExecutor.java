package com.ian.practice.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单一线程池
 *
 * @author YangJing
 * 
 * @date 2018年6月4日下午6:28:06
 */
public class SingleThreadExecutor {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 50; i++) {
			pool.submit(new ThreadRunner((i + 1)));
		}
		pool.shutdown();
	}
}
