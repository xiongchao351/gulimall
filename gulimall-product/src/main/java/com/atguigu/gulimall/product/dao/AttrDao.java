package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author xiongchao
 * @email xiongchao.scu@gmail.com
 * @date 2021-03-05 16:15:29
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
