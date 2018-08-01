package com.products;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: jiez
 * @Description:
 * @Date: Created in 16:20 2018/7/31
 * @Modified By:
 */
public class ProductsData implements Serializable {

    private static final long serialVersionUID = 7578194688865742382L;

    /**产品名称*/
    @JsonProperty("name")
    private String name;

    /**产品类型*/
    @JsonProperty("type")
    private int type;

    /**食品集合*/
    @JsonProperty("foods")
    private List<Food> foods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}
