package com.ian.practice.util;

/**
 * ResultData
 *
 * @author YangJing
 * @date 2018/8/30 16:46
 */
public class ResultData<T> {
    public ResultData() {
    }

    public ResultData(Integer code, String msg, T context) {
        this.code = code;
        this.msg = msg;
        this.context = context;
    }

    private Integer code;

    private String msg;

    private T context;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getContext() {
        return context;
    }

    public void setContext(T context) {
        this.context = context;
    }
}
