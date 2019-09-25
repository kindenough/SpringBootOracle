package com.example.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Test3 {
    private long id;
    private Long num;
//    private Object shape;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NUM")
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

//    @Basic
//    @Column(name = "SHAPE")
//    public Object getShape() {
//        return shape;
//    }
//
//    public void setShape(Object shape) {
//        this.shape = shape;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Test3 test3 = (Test3) o;
//        return id == test3.id &&
//                Objects.equals(num, test3.num) &&
//                Objects.equals(shape, test3.shape);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, num, shape);
//    }
}
