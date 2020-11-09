package cn.itrip.pojo;


public class ItripUserLinkUser {

  private long id;
  private String linkUserName;
  private String linkIdCard;
  private String linkPhone;
  private long userId;
  private java.sql.Timestamp creationDate;
  private long createdBy;
  private java.sql.Timestamp modifyDate;
  private long modifiedBy;
  private long linkIdCardType;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getLinkUserName() {
    return linkUserName;
  }

  public void setLinkUserName(String linkUserName) {
    this.linkUserName = linkUserName;
  }


  public String getLinkIdCard() {
    return linkIdCard;
  }

  public void setLinkIdCard(String linkIdCard) {
    this.linkIdCard = linkIdCard;
  }


  public String getLinkPhone() {
    return linkPhone;
  }

  public void setLinkPhone(String linkPhone) {
    this.linkPhone = linkPhone;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }


  public long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(long createdBy) {
    this.createdBy = createdBy;
  }


  public java.sql.Timestamp getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(java.sql.Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }


  public long getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(long modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public long getLinkIdCardType() {
    return linkIdCardType;
  }

  public void setLinkIdCardType(long linkIdCardType) {
    this.linkIdCardType = linkIdCardType;
  }

}
