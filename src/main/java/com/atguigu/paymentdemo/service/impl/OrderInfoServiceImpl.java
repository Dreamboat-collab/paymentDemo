package com.atguigu.paymentdemo.service.impl;

import com.atguigu.paymentdemo.entity.OrderInfo;
import com.atguigu.paymentdemo.entity.Product;
import com.atguigu.paymentdemo.mapper.OrderInfoMapper;
import com.atguigu.paymentdemo.mapper.ProductMapper;
import com.atguigu.paymentdemo.service.OrderInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

@Service
@Slf4j
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {


}
