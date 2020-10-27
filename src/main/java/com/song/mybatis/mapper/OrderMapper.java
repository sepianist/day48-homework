package com.song.mybatis.mapper;

import com.song.mybatis.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MrChen
 */
public interface OrderMapper {
    Order selectByNo(@Param("no") int no);

    List<Order> selectByUserIdList(@Param("uid") int id);
}
