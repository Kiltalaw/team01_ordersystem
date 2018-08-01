package com.products;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: jiez
 * @Description:
 * @Date: Created in 16:23 2018/7/31
 * @Modified By:
 */
public class ReturnData<T> implements Serializable {

    private static final long serialVersionUID = 7854451515906670164L;

    /**返回数据集编号*/
    @JsonProperty("id")
    private String id;

    /**返回数据集信息*/
    @JsonProperty("msg")
    private String msg;

    /**返回数据集合*/
    @JsonProperty("data")
    private List<T> data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
