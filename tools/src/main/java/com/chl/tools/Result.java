package com.chl.tools;

public class Result {

    private Integer status;

    private Object data;

    public static final Integer SUCCESS = 200;
    public static final Integer FALI = 500;

    public static Result ok(Object data){
        return new Result(SUCCESS,data);
    }

    public Result() {
    }

    public Result(Integer status, Object data) {
        this.status = status;
        this.data = data;
    }

    public Result(Object data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
