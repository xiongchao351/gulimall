package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiongchao
 * @email xiongchao.scu@gmail.com
 * @date 2021-03-05 17:07:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
