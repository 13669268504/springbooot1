package com.itheima.controller;

import com.itheima.domain.mapper.ProductMapper;
import com.itheima.domain.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 高黎明, 13669268504
 * @Date: Created in 10:45 2019/5/16
 * @Version v1.0
 */
@RestController
public class productController {
    @Autowired
    private ProductMapper productMapper;

    @RequestMapping("/findByID/{pid}")
    public product findById(@PathVariable("pid")String pid){
        product product = productMapper.findById(pid);

        return product;
    }
}
