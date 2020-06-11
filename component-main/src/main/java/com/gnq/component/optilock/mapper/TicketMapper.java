package com.gnq.component.optilock.mapper;

import com.gnq.component.optilock.bean.Ticket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * @author: guonanqing
 * @desc:
 * @date: 2020/6/9
 */
@Mapper
public interface TicketMapper {
    @Update("update t_ticket set stock = (stock-1) where stock > 0")
    public int update();
}
