package com.ian.practice.constant;

/**
 * ResultStatus
 *
 * @author YangJing
 * @date 2018/8/30 16:48
 */
public enum ResultStatus {

    SUCCESS(1, "请求成功"),
    FAIL(0, "请求失败"),
    LOGIN(401, "请登录");

    private int code;

    private String msg;

    private ResultStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
