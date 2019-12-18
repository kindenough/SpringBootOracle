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

//    spring.datasource.url=jdbc:oracle:thin:@192.168.100.101:1521:orcl
//    spring.datasource.username=c##zhangzhou
//    spring.datasource.password=zhangzhou
    @RequestMapping("/getXY")
    public Object getXY(@RequestParam(value="id",required = false) String id){
        return oracleService.getXY(id);
    }
    //2052702	3109873	3		0	699298.505806	607905.387813	0	42	127	13-10月-16
    @RequestMapping("/updateXY")
    public Object updateXY(@RequestParam(value="id",required = false) String id,
                           @RequestParam(value="x")String x,
                           @RequestParam(value="y")String y){
        return oracleService.updateXY(id,x,y);
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
