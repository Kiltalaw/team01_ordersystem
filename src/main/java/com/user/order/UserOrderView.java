package com.user.order;

import java.io.Serializable;

/**
 * @Author: jiez
 * @Description:
 * @Date: Created in 11:07 2018/8/2
        * @Modified By:
        */
public class UserOrderView implements Serializable {

    private static final long serialVersionUID = -1625700860399041675L;
    /**订单ID**/
    private String orderId;
    /**产品类别*/
    private String categoryName;
    /**产品名称*/
    private String prouductName;
    /**产品数量*/
    private String productAmount;
    /**产品图片*/
    private String productImage;
    /**订单金额*/
    private Double orderPrice;
    /**订单状态，0为未完成订单，1为已完成订单，-1为取消订单，-2为删除订单*/
    private Integer orderStatus;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getProuductName() {
        return prouductName;
    }

    public void setProuductName(String prouductName) {
        this.prouductName = prouductName;
    }

    public String getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "UserOrderView{" +
                "orderId='" + orderId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", prouductName='" + prouductName + '\'' +
                ", productAmount='" + productAmount + '\'' +
                ", productImage='" + productImage + '\'' +
                ", orderPrice=" + orderPrice +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
