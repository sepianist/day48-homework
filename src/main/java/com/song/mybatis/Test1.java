package com.song.mybatis;

import com.song.mybatis.entity.Order;
import com.song.mybatis.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author MrChen
 */
public class Test1 {
    SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(
            Test1.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
    );
    SqlSession sqlSession = ssf.openSession(true);

    @Test
    public void selectByOrderNoTest() {
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        Order order = orderMapper.selectByNo(1);
        System.out.println(order);
    }
    @Test
    public void selectByUserIdTest() {
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orders = orderMapper.selectByUserIdList(1);
        System.out.println(orders);
    }
}
