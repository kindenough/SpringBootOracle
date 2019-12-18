package com.example.demo.service;

import com.example.demo.entity.Dldypl;
import com.example.demo.entity.T_POSITION;
import com.example.demo.entity.Test2;
import com.example.demo.entity.Test3;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class OracleService {
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public Object test(String id){
        Map map = new HashMap();
        map.put("id",id);
        List<Dldypl> ret =
                sqlSessionTemplate.selectList("OracleMapper.test2",
                        map);
        map.put("data",ret);
        return map;
    }
    public Object getXY(String id){
        Map map = new HashMap();
        map.put("id",id);
        List<T_POSITION> ret =
                sqlSessionTemplate.selectList("OracleMapper.getXY",
                        map);
        map.put("data", ret);
        return map;
    }
    public Object updateXY(String id,String x,String y){
        Map map = new HashMap();
        map.put("id",id);
        map.put("x",x);
        map.put("y",y);
        sqlSessionTemplate.update("OracleMapper.updateXY",
                        map);
        return map;
    }
    public Object getDldypl(String xy){
        Map map = new HashMap();
        String[] arr = xy.split(",");
        if (arr.length!=2){
            return null;
        }

        map.put("x",arr[0]);
        map.put("y",arr[1]);
        map.put("distance",50);
        List<Dldypl> ret =
                sqlSessionTemplate.selectList("OracleMapper.getDldypl",
                        map);
        map.put("data",ret);
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info("info日志输出信息:");
        logger.debug("debug日志输出信息:");
        return map;
    }
//
//    public Object test2(String id){
//        Map map = new HashMap();
//        map.put("id",id);
//        List<Test2> ret =
//                sqlSessionTemplate.selectList("OracleMapper.test2",
//                        map);
//        map.put("data",ret);
//        return map;
//    }
//
//    public Object test3(String id){
//        Map map = new HashMap();
//        map.put("id",id);
//        List<Test3> ret =
//                sqlSessionTemplate.selectList("OracleMapper.test3",
//                        map);
//        map.put("data",ret);
//        return map;
//    }
}

//    mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6
//        -Dversion=11.2.0.1.0 -Dpackaging=jar -Dfile=E:\soft\Oracle\ojdbc6.jar
