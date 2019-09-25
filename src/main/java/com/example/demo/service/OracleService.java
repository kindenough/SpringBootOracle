package com.example.demo.service;

import com.example.demo.entity.Dldypl;
import com.example.demo.entity.Test2;
import com.example.demo.entity.Test3;
import org.mybatis.spring.SqlSessionTemplate;
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
