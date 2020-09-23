package com.cjp.layui.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class SubscribeAudition implements Serializable {
    private Long id;

    private String businessid;

    private String businessname;

    private String brandname;

    private String branchschool;

    private String course;

    private String subscribename;

    private String phone;

    private Date subscribetime;

    private Integer status;

    private String grade;

    private String openid;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getBranchschool() {
        return branchschool;
    }

    public void setBranchschool(String branchschool) {
        this.branchschool = branchschool;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSubscribename() {
        return subscribename;
    }

    public void setSubscribename(String subscribename) {
        this.subscribename = subscribename;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getSubscribetime() {
        return subscribetime;
    }

    public void setSubscribetime(Date subscribetime) {
        this.subscribetime = subscribetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", businessid=").append(businessid);
        sb.append(", businessname=").append(businessname);
        sb.append(", brandname=").append(brandname);
        sb.append(", branchschool=").append(branchschool);
        sb.append(", course=").append(course);
        sb.append(", subscribename=").append(subscribename);
        sb.append(", phone=").append(phone);
        sb.append(", subscribetime=").append(subscribetime);
        sb.append(", status=").append(status);
        sb.append(", grade=").append(grade);
        sb.append(", openid=").append(openid);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}