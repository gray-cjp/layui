package com.cjp.layui.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class StudentBill implements Serializable {
    private Long id;

    private String ordernum;

    private Long studentid;

    private Long billid;

    private Double cost;

    private Integer status;

    private Integer paytype;

    private Long grantid;

    private Date paydate;

    private Date creatdate;

    private String rem;

    private Integer paymethod;

    private Integer deleted;

    private String studentnm;

    private String idcard;

    private Long teacherid;

    private Integer intostatus;

    private Double rfcost;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public Long getBillid() {
        return billid;
    }

    public void setBillid(Long billid) {
        this.billid = billid;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Long getGrantid() {
        return grantid;
    }

    public void setGrantid(Long grantid) {
        this.grantid = grantid;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public Date getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(Date creatdate) {
        this.creatdate = creatdate;
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem;
    }

    public Integer getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(Integer paymethod) {
        this.paymethod = paymethod;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getStudentnm() {
        return studentnm;
    }

    public void setStudentnm(String studentnm) {
        this.studentnm = studentnm;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Long getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
    }

    public Integer getIntostatus() {
        return intostatus;
    }

    public void setIntostatus(Integer intostatus) {
        this.intostatus = intostatus;
    }

    public Double getRfcost() {
        return rfcost;
    }

    public void setRfcost(Double rfcost) {
        this.rfcost = rfcost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", studentid=").append(studentid);
        sb.append(", billid=").append(billid);
        sb.append(", cost=").append(cost);
        sb.append(", status=").append(status);
        sb.append(", paytype=").append(paytype);
        sb.append(", grantid=").append(grantid);
        sb.append(", paydate=").append(paydate);
        sb.append(", creatdate=").append(creatdate);
        sb.append(", rem=").append(rem);
        sb.append(", paymethod=").append(paymethod);
        sb.append(", deleted=").append(deleted);
        sb.append(", studentnm=").append(studentnm);
        sb.append(", idcard=").append(idcard);
        sb.append(", teacherid=").append(teacherid);
        sb.append(", intostatus=").append(intostatus);
        sb.append(", rfcost=").append(rfcost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}