package com.user.order;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: jiez
 * @Description:
 * @Date: Created in 17:15 2018/8/2
 * @Modified By:
 */
public class ReturnData<T> implements Serializable {

    private static final long serialVersionUID = -2245348588326145894L;
    /** Status code */
    private String code;
    /** Return information */
    private String msg;
    /** Return the data */
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ReturnData{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
