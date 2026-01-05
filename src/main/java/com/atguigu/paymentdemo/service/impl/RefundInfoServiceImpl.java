package com.atguigu.paymentdemo.service.impl;

import com.atguigu.paymentdemo.entity.OrderInfo;
import com.atguigu.paymentdemo.entity.RefundInfo;
import com.atguigu.paymentdemo.mapper.RefundInfoMapper;
import com.atguigu.paymentdemo.service.OrderInfoService;
import com.atguigu.paymentdemo.service.RefundInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoMapper, RefundInfo> implements RefundInfoService {

}
