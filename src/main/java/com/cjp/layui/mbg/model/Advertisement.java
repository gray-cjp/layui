package com.cjp.layui.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class Advertisement implements Serializable {
    private Long id;

    private String image;

    private String url;

    private Integer type;

    private Integer deleted;

    private String loacation;

    private Date creattime;

    private Long whitelistid;

    private Integer status;

    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getLoacation() {
        return loacation;
    }

    public void setLoacation(String loacation) {
        this.loacation = loacation;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Long getWhitelistid() {
        return whitelistid;
    }

    public void setWhitelistid(Long whitelistid) {
        this.whitelistid = whitelistid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", image=").append(image);
        sb.append(", url=").append(url);
        sb.append(", type=").append(type);
        sb.append(", deleted=").append(deleted);
        sb.append(", loacation=").append(loacation);
        sb.append(", creattime=").append(creattime);
        sb.append(", whitelistid=").append(whitelistid);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}