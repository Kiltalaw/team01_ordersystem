package com.user.order; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/** 
* UserOrderController Tester. 
* 
* @author <Authors name> 
* @since <pre>八月 2, 2018</pre> 
* @version 1.0 
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserOrderControllerTest {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;
    @MockBean
    private UserOrderService userOrderService;

    @Before
    public void before() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: queryUserOrderByConditions(@PathVariable String ID, UserOrderConditionsDTO conditions)
    *
    */
    @Test
    public void testQueryUserOrderByConditions() throws Exception {
        Mockito.when(userOrderService.queryUserOrderByConditions("", null)).then(new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                UserOrderView userOrderView = new UserOrderView();
                userOrderView.setCategoryName("abc");
                userOrderView.setOrderId("abcd");
                userOrderView.setOrderPrice(12.50D);
                userOrderView.setOrderStatus(0);
                userOrderView.setProductAmount("ddd");
                userOrderView.setProductImage("ffff");
                userOrderView.setProuductName("ffffff");
                List<UserOrderView> list = new ArrayList<>();
                list.add(userOrderView);
                return list;
            }
        });
        List<UserOrderView> userOrderViews = userOrderService.queryUserOrderByConditions("",null);
        ReturnData returnData = new ReturnData();
        returnData.setCode("301");
        returnData.setMsg("success");
        returnData.setData(userOrderViews);
        System.out.println(returnData.toString());

        this.mockMvc.perform(get("/user/orders/123").accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andDo(print());
    }


}
