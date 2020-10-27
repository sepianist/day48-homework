package com.song.mybatis.entity;

/**
 * @author MrChen
 */
public class OrderItem {

  private Integer id;
  private Integer oId;
  private String oNo;
  private String oiName;
  private String oiImg;
  private Integer oiSize;
  private Integer isDel;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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


  public String getOiName() {
    return oiName;
  }

  public void setOiName(String oiName) {
    this.oiName = oiName;
  }


  public String getOiImg() {
    return oiImg;
  }

  public void setOiImg(String oiImg) {
    this.oiImg = oiImg;
  }


  public Integer getOiSize() {
    return oiSize;
  }

  public void setOiSize(Integer oiSize) {
    this.oiSize = oiSize;
  }


  public Integer getIsDel() {
    return isDel;
  }

  public void setIsDel(Integer isDel) {
    this.isDel = isDel;
  }

}
