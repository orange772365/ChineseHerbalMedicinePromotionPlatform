package com.herb.plant.community.utils;

import lombok.Data;
import lombok.val;
import org.jetbrains.annotations.Contract;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 统一返回对象
 *
 * @author cc
 * @date 2021-07-12 10:10
 */
@Data
public class Result implements Serializable {
    // 自定义状态码
    private Integer code;
    // 提示内容，如果接口出错，则存放异常信息
    private String msg;
    // 返回数据体
    private Map data;
    // 接口成功检测。拓展字段，前台可用该接口判断接口是否正常，或者通过code状态码
    private boolean success;
    private static final long serialVersionUID = 1L;

    public Result() {
        this.data = new HashMap<String, Object>();
    }


    /**
     * 请求成功返回
     * public和返回值间的<T>指定的这是一个泛型方法，这样才可以在方法内使用T类型的变量
     *
     * @author cc
     * @date 2021-07-12 10:11
     */
    public static Result success() {
        val result = new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMsg());
        return result;
    }


    /**
     * 请求失败返回
     *
     * @param msg:
     * @author cc
     * @date 2021-07-12 10:11
     */


    public static Result failed(int code, String msg) {
        val result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public Result put(String label, Object value) {
        this.data.put(label, value);
        return this;
    }

    public boolean isSuccess() {
        return this.code == ResultCode.SUCCESS.getCode();
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "Result{" + "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", success=" + success +
                '}';
    }
}