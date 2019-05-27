package com.itheima.domain.mapper;

import com.itheima.domain.product;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: 高黎明, 13669268504
 * @Date: Created in 10:43 2019/5/16
 * @Version v1.0
 */
@Mapper
public interface ProductMapper {
    public product findById(String pid);
}
