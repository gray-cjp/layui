package com.cjp.layui.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class MessageTailCount implements Serializable {
    private Long id;

    private Long messagetailid;

    private String openid;

    private Integer count;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMessagetailid() {
        return messagetailid;
    }

    public void setMessagetailid(Long messagetailid) {
        this.messagetailid = messagetailid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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
        sb.append(", messagetailid=").append(messagetailid);
        sb.append(", openid=").append(openid);
        sb.append(", count=").append(count);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}