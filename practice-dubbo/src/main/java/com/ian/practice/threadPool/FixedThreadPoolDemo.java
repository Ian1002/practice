package com.ian.practice.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 固定大小的线程池
 *
 * @author YangJing
 * @date 2018年6月4日下午6:25:14
 */
public class FixedThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 50; i++) {
            pool.submit(new ThreadRunner((i + 1)));
        }
        pool.shutdown();
    }
}