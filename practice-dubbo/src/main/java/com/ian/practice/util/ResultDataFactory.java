package com.ian.practice.util;

import com.ian.practice.constant.ResultStatus;

/**
 * ResultDataFactory
 *
 * @author YangJing
 * @date 2018/8/30 16:47
 */
public final class ResultDataFactory {

    private ResultDataFactory() {
    }

    public static ResultData getSuccess(Object context) {
        return new ResultData(ResultStatus.SUCCESS.getCode(), ResultStatus.SUCCESS.getMsg(), context);
    }

    public static ResultData getSuccess(String msg, Object context) {
        return new ResultData(ResultStatus.SUCCESS.getCode(), msg, context);
    }

    public static ResultData getSuccess(String msg) {
        return new ResultData(ResultStatus.SUCCESS.getCode(), msg, null);
    }

    public static ResultData getSuccess() {
        return new ResultData(ResultStatus.SUCCESS.getCode(), ResultStatus.SUCCESS.getMsg(), null);
    }

    public static ResultData getFail(Object context) {
        return new ResultData(ResultStatus.FAIL.getCode(), ResultStatus.FAIL.getMsg(), context);
    }

    public static ResultData getFail(String msg, Object context) {
        return new ResultData(ResultStatus.FAIL.getCode(), msg, context);
    }

    public static ResultData getFail(String msg) {
        return new ResultData(ResultStatus.FAIL.getCode(), msg, null);
    }

    public static ResultData getFail() {
        return new ResultData(ResultStatus.FAIL.getCode(), ResultStatus.FAIL.getMsg(), null);
    }

    public static ResultData getLoginFail() {
        return new ResultData(ResultStatus.LOGIN.getCode(), "用户名或者密码错误", null);
    }
}
