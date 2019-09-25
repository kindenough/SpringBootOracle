package com.example.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Dldypl {
    private long objectid;
    private String wyid;
    private String name;
    private String dldyqd;
    private String dldyzd;
    private String dldymc;
    private String dlwyid;
    private String pqmc;
//    private Object shape;

    @Id
    @Column(name = "OBJECTID")
    public long getObjectid() {
        return objectid;
    }

    public void setObjectid(long objectid) {
        this.objectid = objectid;
    }

    @Basic
    @Column(name = "WYID")
    public String getWyid() {
        return wyid;
    }

    public void setWyid(String wyid) {
        this.wyid = wyid;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "DLDYQD")
    public String getDldyqd() {
        return dldyqd;
    }

    public void setDldyqd(String dldyqd) {
        this.dldyqd = dldyqd;
    }

    @Basic
    @Column(name = "DLDYZD")
    public String getDldyzd() {
        return dldyzd;
    }

    public void setDldyzd(String dldyzd) {
        this.dldyzd = dldyzd;
    }

    @Basic
    @Column(name = "DLDYMC")
    public String getDldymc() {
        return dldymc;
    }

    public void setDldymc(String dldymc) {
        this.dldymc = dldymc;
    }

    @Basic
    @Column(name = "DLWYID")
    public String getDlwyid() {
        return dlwyid;
    }

    public void setDlwyid(String dlwyid) {
        this.dlwyid = dlwyid;
    }

    @Basic
    @Column(name = "PQMC")
    public String getPqmc() {
        return pqmc;
    }

    public void setPqmc(String pqmc) {
        this.pqmc = pqmc;
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
//        Dldypl dldypl = (Dldypl) o;
//        return objectid == dldypl.objectid &&
//                Objects.equals(wyid, dldypl.wyid) &&
//                Objects.equals(name, dldypl.name) &&
//                Objects.equals(dldyqd, dldypl.dldyqd) &&
//                Objects.equals(dldyzd, dldypl.dldyzd) &&
//                Objects.equals(dldymc, dldypl.dldymc) &&
//                Objects.equals(dlwyid, dldypl.dlwyid) &&
//                Objects.equals(pqmc, dldypl.pqmc) &&
//                Objects.equals(shape, dldypl.shape);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(objectid, wyid, name, dldyqd, dldyzd, dldymc, dlwyid, pqmc, shape);
//    }
}
