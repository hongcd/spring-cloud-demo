package com.hongcd.cloud.common.utils;

import lombok.Data;

/**
 * 结果对象
 * @param <T>
 */
@Data
public class Result<T> {
    public static int SUCCESS = 1;
    public static int FAIL = 0;

    private Integer code;
    private String msg;
    private T data;

    public Result() {}
    public Result(Integer code, T data) {
        this.code = code;
        this.data = data;
    }
    public Result(Integer code, String msg, T data) {
        this(code, data);
        this.msg = msg;
    }

    /**
     * 返回成功结果
     * @param <T>
     * @return
     */
    public static <T> Result<T> success() {
        return success(null);
    }

    /**
     * 返回成功结果-带消息
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(String msg, T data) {
        return new Result<>(SUCCESS, msg, data);
    }

    /**
     * 返回成功结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return success(null, data);
    }

    /**
     * 返回错误结果with错误码
     * @param code
     * @param msg
     * @return
     */
    public static Result<?> fail(int code, String msg) {
        return new Result<>(code, msg);
    }

    /**
     * 返回错误结果
     * @param msg
     * @return
     */
    public static Result<?> fail(String msg) {
        return fail(FAIL, msg);
    }
}