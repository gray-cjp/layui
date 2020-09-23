package com.cjp.layui.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class SchoolBill implements Serializable {
    private Long id;

    private String title;

    private Double money;

    private Long grantid;

    private Date enddate;

    private Integer status;

    private Date creatdate;

    private String rem;

    private Integer deleted;

    private Long schoolid;

    private Long gradeid;

    private Long classid;

    private String name;

    private String semester;

    private String syear;

    private String deletedtime;

    private String month;

    private Long departmentid;

    private Long professionid;

    private Integer quickpay;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Long getGrantid() {
        return grantid;
    }

    public void setGrantid(Long grantid) {
        this.grantid = grantid;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Long getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Long schoolid) {
        this.schoolid = schoolid;
    }

    public Long getGradeid() {
        return gradeid;
    }

    public void setGradeid(Long gradeid) {
        this.gradeid = gradeid;
    }

    public Long getClassid() {
        return classid;
    }

    public void setClassid(Long classid) {
        this.classid = classid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSyear() {
        return syear;
    }

    public void setSyear(String syear) {
        this.syear = syear;
    }

    public String getDeletedtime() {
        return deletedtime;
    }

    public void setDeletedtime(String deletedtime) {
        this.deletedtime = deletedtime;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Long getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }

    public Long getProfessionid() {
        return professionid;
    }

    public void setProfessionid(Long professionid) {
        this.professionid = professionid;
    }

    public Integer getQuickpay() {
        return quickpay;
    }

    public void setQuickpay(Integer quickpay) {
        this.quickpay = quickpay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", money=").append(money);
        sb.append(", grantid=").append(grantid);
        sb.append(", enddate=").append(enddate);
        sb.append(", status=").append(status);
        sb.append(", creatdate=").append(creatdate);
        sb.append(", rem=").append(rem);
        sb.append(", deleted=").append(deleted);
        sb.append(", schoolid=").append(schoolid);
        sb.append(", gradeid=").append(gradeid);
        sb.append(", classid=").append(classid);
        sb.append(", name=").append(name);
        sb.append(", semester=").append(semester);
        sb.append(", syear=").append(syear);
        sb.append(", deletedtime=").append(deletedtime);
        sb.append(", month=").append(month);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", professionid=").append(professionid);
        sb.append(", quickpay=").append(quickpay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}