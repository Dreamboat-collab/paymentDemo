package com.atguigu.paymentdemo.controller;


import com.atguigu.paymentdemo.entity.Product;
import com.atguigu.paymentdemo.service.ProductService;
import com.atguigu.paymentdemo.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@Api(tags = "商品管理")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/test")
    @ApiOperation("测试接口")
    public R test() {
        return R.ok();
    }

    @GetMapping("/list")
    @ApiOperation("获取商品列表")
    public R list() {
        List<Product> productList = productService.list();
        return R.ok().data("productList", productList);
    }

}
