package com.song.mybatis.entity;

import java.util.Date;
import java.util.List;

/**
 * @author MrChen
 */
public class Order {

  private Integer oId;
  private String oNo;
  private Date createDate;
  private Integer uId;
  private Integer isDel;
  private User user;
  private List<OrderItem> orderItemList;

  public User getUser() {
    return user;
  }

  @Override
  public String toString() {
    return "Order{" +
            "oId=" + oId +
            ", oNo='" + oNo + '\'' +
            ", createDate=" + createDate +
            ", uId=" + uId +
            ", isDel=" + isDel +
            ", user=" + user +
            ", orderItemList=" + orderItemList +
            '}';
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Integer getOId() {
    return oId;
  }

  public void setOId(Integer oId) {
    this.oId = oId;
  }


  public String getONo() {
    return oNo;
  }

  public void setONo(String oNo) {
    this.oNo = oNo;
  }


  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public Integer getUId() {
    return uId;
  }

  public void setUId(Integer uId) {
    this.uId = uId;
  }


  public Integer getIsDel() {
    return isDel;
  }

  public void setIsDel(Integer isDel) {
    this.isDel = isDel;
  }

}
