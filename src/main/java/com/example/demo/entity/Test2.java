package com.example.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Test2 {
    private long id;
    private Long num;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    @Basic
//    @Column(name = "NUM")
//    public Long getNum() {
//        return num;
//    }
//
//    public void setNum(Long num) {
//        this.num = num;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Test2 test2 = (Test2) o;
//        return id == test2.id &&
//                Objects.equals(num, test2.num);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, num);
//    }
}
