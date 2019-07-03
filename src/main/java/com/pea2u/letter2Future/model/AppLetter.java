package com.pea2u.letter2Future.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AppLetter implements Serializable {
    @ApiModelProperty(value = "自增ID")
    private Integer id;

    @ApiModelProperty(value = "客户ID")
    private Integer custId;

    @ApiModelProperty(value = "信件标题")
    private String letterTitle;

    @ApiModelProperty(value = "信件来源（0：小程序 1：web端 2：支付宝小程序 3：公众号）")
    private Integer letterSource;

    @ApiModelProperty(value = "信件类型(0:私密 1:公开)")
    private Integer letterType;

    @ApiModelProperty(value = "审核状态（0：未审核 1：审核通过 2：审核拒绝）")
    private Integer checkStatus;

    @ApiModelProperty(value = "信件状态 0:正在创建 1:创建完成，等待发送 2:发送完成")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "信件内容")
    private String letterContent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getLetterTitle() {
        return letterTitle;
    }

    public void setLetterTitle(String letterTitle) {
        this.letterTitle = letterTitle == null ? null : letterTitle.trim();
    }

    public Integer getLetterSource() {
        return letterSource;
    }

    public void setLetterSource(Integer letterSource) {
        this.letterSource = letterSource;
    }

    public Integer getLetterType() {
        return letterType;
    }

    public void setLetterType(Integer letterType) {
        this.letterType = letterType;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLetterContent() {
        return letterContent;
    }

    public void setLetterContent(String letterContent) {
        this.letterContent = letterContent == null ? null : letterContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", custId=").append(custId);
        sb.append(", letterTitle=").append(letterTitle);
        sb.append(", letterSource=").append(letterSource);
        sb.append(", letterType=").append(letterType);
        sb.append(", checkStatus=").append(checkStatus);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", letterContent=").append(letterContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}