package com.cjp.layui.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class FindPageFuction implements Serializable {
    private Long id;

    private String function;

    private String icon;

    private Integer urltype;

    private Integer deleted;

    private String url;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getUrltype() {
        return urltype;
    }

    public void setUrltype(Integer urltype) {
        this.urltype = urltype;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        sb.append(", function=").append(function);
        sb.append(", icon=").append(icon);
        sb.append(", urltype=").append(urltype);
        sb.append(", deleted=").append(deleted);
        sb.append(", url=").append(url);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}