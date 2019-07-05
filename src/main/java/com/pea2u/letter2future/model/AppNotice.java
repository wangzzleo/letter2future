package com.pea2u.letter2future.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AppNotice implements Serializable {
    @ApiModelProperty(value = "自增ID")
    private Integer id;

    @ApiModelProperty(value = "订单唯一编号")
    private String orderSn;

    private Date sendTime;

    @ApiModelProperty(value = "收件人")
    private String addresseeName;

    @ApiModelProperty(value = "收件人邮编")
    private String addresseeZipCode;

    @ApiModelProperty(value = "收件人地址（必填）")
    private String addresseeAddress;

    @ApiModelProperty(value = "收件人电话（纸质必填）")
    private String addresseePhone;

    @ApiModelProperty(value = "寄件人")
    private String senderName;

    @ApiModelProperty(value = "寄件人邮编")
    private String senderZipCode;

    @ApiModelProperty(value = "寄件人地址")
    private String senderAddress;

    @ApiModelProperty(value = "寄件人电话")
    private String senderPhone;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getAddresseeName() {
        return addresseeName;
    }

    public void setAddresseeName(String addresseeName) {
        this.addresseeName = addresseeName == null ? null : addresseeName.trim();
    }

    public String getAddresseeZipCode() {
        return addresseeZipCode;
    }

    public void setAddresseeZipCode(String addresseeZipCode) {
        this.addresseeZipCode = addresseeZipCode == null ? null : addresseeZipCode.trim();
    }

    public String getAddresseeAddress() {
        return addresseeAddress;
    }

    public void setAddresseeAddress(String addresseeAddress) {
        this.addresseeAddress = addresseeAddress == null ? null : addresseeAddress.trim();
    }

    public String getAddresseePhone() {
        return addresseePhone;
    }

    public void setAddresseePhone(String addresseePhone) {
        this.addresseePhone = addresseePhone == null ? null : addresseePhone.trim();
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName == null ? null : senderName.trim();
    }

    public String getSenderZipCode() {
        return senderZipCode;
    }

    public void setSenderZipCode(String senderZipCode) {
        this.senderZipCode = senderZipCode == null ? null : senderZipCode.trim();
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress == null ? null : senderAddress.trim();
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone == null ? null : senderPhone.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", addresseeName=").append(addresseeName);
        sb.append(", addresseeZipCode=").append(addresseeZipCode);
        sb.append(", addresseeAddress=").append(addresseeAddress);
        sb.append(", addresseePhone=").append(addresseePhone);
        sb.append(", senderName=").append(senderName);
        sb.append(", senderZipCode=").append(senderZipCode);
        sb.append(", senderAddress=").append(senderAddress);
        sb.append(", senderPhone=").append(senderPhone);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}