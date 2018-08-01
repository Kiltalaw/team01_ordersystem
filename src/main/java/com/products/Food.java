package com.products;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @Author: jiez
 * @Description:
 * @Date: Created in 16:13 2018/7/31
 * @Modified By:
 */
public class Food implements Serializable {

    private static final long serialVersionUID = -2044136493483918566L;

    /**食品id*/
    @JsonProperty("id")
    private String id;

    /**食品名称*/
    @JsonProperty("name")
    private String name;

    /**食品价格*/
    @JsonProperty("price")
    private Double price;

    /**食品描述*/
    @JsonProperty("description")
    private String description;

    /**食品图片url*/
    @JsonProperty("icon")
    private String icon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
