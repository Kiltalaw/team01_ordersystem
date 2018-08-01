package com.products;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jiez
 * @Description:
 * @Date: Created in 15:59 2018/7/31
 * @Modified By:
 */
@RestController
@RequestMapping(value = "/buyer/product")
public class ProductsController {

    private Logger logger = LoggerFactory.getLogger(ProductsController.class);

    /**
     * @Author: jiez
     * @Description: 查询生产列表
     * @Date: 17:08 2018/7/31
     * @Params: []
     * @return: json
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ReturnData listProduct() {
        logger.info("ffffff");
        return new ProdecutsServiceImpl().getProductsMessage();
    }
}
