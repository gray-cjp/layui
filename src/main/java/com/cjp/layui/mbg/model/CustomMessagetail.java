package com.cjp.layui.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class CustomMessagetail implements Serializable {
    private Long id;

    private String messagename;

    private Integer releaseobject;

    private Integer deleted;

    private Date pushtime;

    private Date createtime;

    private Integer pushstatus;

    private String templateid;

    private String head;

    private String keyworddata;

    private String tail;

    private Integer urltype;

    private String url;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessagename() {
        return messagename;
    }

    public void setMessagename(String messagename) {
        this.messagename = messagename;
    }

    public Integer getReleaseobject() {
        return releaseobject;
    }

    public void setReleaseobject(Integer releaseobject) {
        this.releaseobject = releaseobject;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getPushtime() {
        return pushtime;
    }

    public void setPushtime(Date pushtime) {
        this.pushtime = pushtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getPushstatus() {
        return pushstatus;
    }

    public void setPushstatus(Integer pushstatus) {
        this.pushstatus = pushstatus;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getKeyworddata() {
        return keyworddata;
    }

    public void setKeyworddata(String keyworddata) {
        this.keyworddata = keyworddata;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public Integer getUrltype() {
        return urltype;
    }

    public void setUrltype(Integer urltype) {
        this.urltype = urltype;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", messagename=").append(messagename);
        sb.append(", releaseobject=").append(releaseobject);
        sb.append(", deleted=").append(deleted);
        sb.append(", pushtime=").append(pushtime);
        sb.append(", createtime=").append(createtime);
        sb.append(", pushstatus=").append(pushstatus);
        sb.append(", templateid=").append(templateid);
        sb.append(", head=").append(head);
        sb.append(", keyworddata=").append(keyworddata);
        sb.append(", tail=").append(tail);
        sb.append(", urltype=").append(urltype);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}