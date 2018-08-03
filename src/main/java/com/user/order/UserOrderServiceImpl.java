package com.user.order;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: jiez
 * @Description:
 * @Date: Created in 10:08 2018/8/2
 * @Modified By:
 */
@Component
public class UserOrderServiceImpl implements UserOrderService {

    /**
     * @Description Display the order list according to userId and the conditions(根据条件展示订单列表)
     * @Author jiez
     * @Date 10:45 2018/8/2
     * @param userID UserOrderDTO User order conditions(用户订单条件)
     * @param conditions UserOrderConditionsDTO User order conditions(用户订单条件)
     * @return List<UserOrderView> Display a list of user orders(展示用户订单列表)
     */
    @Override
    public List<UserOrderView> queryUserOrderByConditions(String userID, UserOrderConditionsDTO conditions) {
        return null;
    }
}
