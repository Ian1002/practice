package com.ian.practice.model;

/**
 * PageModel
 *
 * @author YangJing
 * @date 2018/8/30 15:10
 */
public class PageModel extends BaseModel {

    /**
     * 页索引
     */
    private int pageNum = 1;

    /**
     * 页大小
     */
    private int pageSize = 10;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}