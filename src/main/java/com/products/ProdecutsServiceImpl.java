package com.products;

import java.util.ArrayList;

/**
 * @Author: jiez
 * @Description:
 * @Date: Created in 16:20 2018/7/31
 * @Modified By:
 */
public class ProdecutsServiceImpl implements ProductsService {

    /**
     * @Author: jiez
     * @Description: 查询产品信息
     * @Date: 17:08 2018/7/31
     * @Params: []
     * @return:
     */
    @Override
    public ReturnData getProductsMessage() {
        Food food = new Food();
        food.setId("123456");
        food.setName("xxx");
        food.setDescription("xxxxxxx");
        food.setPrice(12.2);
        food.setIcon("http://dddd");

        Food food1 = new Food();
        food1.setId("123456");
        food1.setName("xxx");
        food1.setDescription("xxxxxxx");
        food1.setPrice(12.2);
        food1.setIcon("http://dddd");

        ArrayList<Food> foods = new ArrayList<>();
        foods.add(food);
        foods.add(food1);

        ProductsData buyerData = new ProductsData();
        buyerData.setName("热榜");
        buyerData.setType(1);
        buyerData.setFoods(foods);

        ProductsData buyerData1 = new ProductsData();
        buyerData1.setName("热榜2");
        buyerData1.setType(2);
        buyerData1.setFoods(foods);

        ArrayList<ProductsData> buyerDatas = new ArrayList<>();
        buyerDatas.add(buyerData);
        buyerDatas.add(buyerData1);

        ReturnData returnData = new ReturnData();
        returnData.setId("0");
        returnData.setMsg("成功");
        returnData.setData(buyerDatas);

        return returnData;
    }
}
