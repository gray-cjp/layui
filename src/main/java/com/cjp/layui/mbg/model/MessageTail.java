package com.cjp.layui.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class MessageTail implements Serializable {
    private Long id;

    private String content;

    private Long whitelistid;

    private Date cratetime;

    private Integer type;

    private String messagetype;

    private Integer deleted;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getWhitelistid() {
        return whitelistid;
    }

    public void setWhitelistid(Long whitelistid) {
        this.whitelistid = whitelistid;
    }

    public Date getCratetime() {
        return cratetime;
    }

    public void setCratetime(Date cratetime) {
        this.cratetime = cratetime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content=").append(content);
        sb.append(", whitelistid=").append(whitelistid);
        sb.append(", cratetime=").append(cratetime);
        sb.append(", type=").append(type);
        sb.append(", messagetype=").append(messagetype);
        sb.append(", deleted=").append(deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}