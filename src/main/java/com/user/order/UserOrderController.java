package com.user.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: jiez
 * @Description:
 * @Date: Created in 10:07 2018/8/2
 * @Modified By:
 */
@RestController
@RequestMapping(value = "/user")
public class UserOrderController {

    @Autowired
    @MockBean
    private UserOrderService userOrderService;

    /**
     * @Author jiez
     * @Description Query the order according to the userID and conditions
     * @Date 11:37 2018/8/2
     * @param ID String The user id
     * @param conditions UserOrderConditionsDTO User order conditions
     *      * @return JSON
     */
    @RequestMapping(value = "/orders/{ID}", method = RequestMethod.GET)
    public String queryUserOrderByConditions(@PathVariable String ID, UserOrderConditionsDTO conditions){
        List<UserOrderView> userOrderViews = userOrderService.queryUserOrderByConditions(ID,conditions);
        ReturnData returnData = new ReturnData();
        returnData.setCode("301");
        returnData.setMsg("success");
        returnData.setData(userOrderViews);
        return returnData.toString();
    }

}
