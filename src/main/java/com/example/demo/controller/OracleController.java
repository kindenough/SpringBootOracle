package com.example.demo.controller;

import com.example.demo.service.OracleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OracleController {
    @Resource
    private OracleService oracleService;

    @RequestMapping("/test")
    public Object test(@RequestParam(value="id",required = false) String id){
        return oracleService.test(id);
    }
    @RequestMapping("/getDldypl")
    public Object getDldypl(@RequestParam(value="point",required = false) String point){
        return oracleService.getDldypl(point);
    }

//    @RequestMapping("/test2")
//    public Object test2(@RequestParam(value="id",required = false) String id){
//        return oracleService.test2(id);
//    }
//    @RequestMapping("/test3")
//    public Object test3(@RequestParam(value="id",required = false) String id){
//        return oracleService.test3(id);
//    }
}
