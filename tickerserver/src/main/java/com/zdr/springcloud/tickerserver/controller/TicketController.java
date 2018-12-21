package com.zdr.springcloud.tickerserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TicketController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ticket/buy")
    public Object buyTicket(String userId,String ticketId){
        Map res = restTemplate.getForObject("http://localhost:8000/user/"+userId, HashMap.class);
        String userName = res.get("USERNAME").toString();
        return userName+" buy ticket "+ticketId+" success!";
    }

}
