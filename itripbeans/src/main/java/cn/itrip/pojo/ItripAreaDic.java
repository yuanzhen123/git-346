package cn.itrip.pojo;

public class ItripAreaDic {

  private long id;
  private String name;
  private String areaNo;
  private long parent;
  private long isActivated;
  private long isTradingArea;
  private long isHot;
  private long level;
  private long isChina;
  private String pinyin;
  private java.sql.Timestamp creationDate;
  private long createdBy;
  private java.sql.Timestamp modifyDate;
  private long modifiedBy;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAreaNo() {
    return areaNo;
  }

  public void setAreaNo(String areaNo) {
    this.areaNo = areaNo;
  }


  public long getParent() {
    return parent;
  }

  public void setParent(long parent) {
    this.parent = parent;
  }


  public long getIsActivated() {
    return isActivated;
  }

  public void setIsActivated(long isActivated) {
    this.isActivated = isActivated;
  }


  public long getIsTradingArea() {
    return isTradingArea;
  }

  public void setIsTradingArea(long isTradingArea) {
    this.isTradingArea = isTradingArea;
  }


  public long getIsHot() {
    return isHot;
  }

  public void setIsHot(long isHot) {
    this.isHot = isHot;
  }


  public long getLevel() {
    return level;
  }

  public void setLevel(long level) {
    this.level = level;
  }


  public long getIsChina() {
    return isChina;
  }

  public void setIsChina(long isChina) {
    this.isChina = isChina;
  }


  public String getPinyin() {
    return pinyin;
  }

  public void setPinyin(String pinyin) {
    this.pinyin = pinyin;
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

}
