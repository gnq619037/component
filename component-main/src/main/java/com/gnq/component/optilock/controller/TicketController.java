package com.gnq.component.optilock.controller;

import com.gnq.component.optilock.mapper.TicketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guonanqing
 * @desc:
 * @date: 2020/6/9
 */
@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketMapper ticketMapper;

    @GetMapping("/sale")
    public Object saleTicket(){
        int isUpdate = ticketMapper.update();
        return isUpdate;
    }
}
