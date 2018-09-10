package com.ian.practice.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 池中线程时随着处理数据增加而增加，可自动重复利用之前的线程
 *
 * @author YangJing
 * @date 2018年6月4日下午6:27:19
 */
public class CachedThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i < 50; i++) {
            pool.submit(new ThreadRunner((i + 1)));
        }
        pool.shutdown();
    }
}
