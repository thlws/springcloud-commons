package com.thlws.commons;

import java.io.Serializable;

/**
 * @author  Hanley
 */
public class ApiResult<T> implements Serializable {

    private T data;
    private Integer code;
    private String  message;

    public ApiResult(){}

    private ApiResult(Integer code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    private ApiResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static <T> ApiResult<T> ok() {
        return new ApiResult<>(0,"SUCCESS");
    }

    public static <T> ApiResult<T> ok(T data) {
        return new ApiResult<>(0, data,"SUCCESS");
    }

    public static <T> ApiResult<T> ok(T data,String message) {
        return new ApiResult<>(0, data,message);
    }

    public static <T> ApiResult<T> error(){
        return new ApiResult<>(500,"ERROR");
    }

    public static <T> ApiResult<T> error(Integer code,String message){
        return new ApiResult<>(code, null, message);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ApiResult [code=" + code + ", data=" + data + ", message=" + message + "]";
    }

}
