package com.bistu.materialsproject.bean.common;

/**
 * @className: Result
 * @description: 封装统一的返回数据
 * @author: hcx
 * @date: 2021/6/3
 **/
public class Result {
    /**
     * 成功为true
     */
    private boolean status;
    /**
     * 错误消息或其他提示
     */
    private String msg;
    /**
     * 数据
     */
    private Object data;

    public Result() {
        this(true, "", null);
    }

    public Result(Object data) {
        this(true, "", data);
    }

    public Result(boolean status, String msg) {
        this(status, msg, null);
    }

    public Result(boolean status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
