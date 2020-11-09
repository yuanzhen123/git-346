package cn.itrip.pojo;


public class ItripComment {

  private long id;
  private long hotelId;
  private long productId;
  private long orderId;
  private long productType;
  private String content;
  private long userId;
  private long isHavingImg;
  private long positionScore;
  private long facilitiesScore;
  private long serviceScore;
  private long hygieneScore;
  private long score;
  private long tripMode;
  private long isOk;
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


  public long getHotelId() {
    return hotelId;
  }

  public void setHotelId(long hotelId) {
    this.hotelId = hotelId;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getProductType() {
    return productType;
  }

  public void setProductType(long productType) {
    this.productType = productType;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getIsHavingImg() {
    return isHavingImg;
  }

  public void setIsHavingImg(long isHavingImg) {
    this.isHavingImg = isHavingImg;
  }


  public long getPositionScore() {
    return positionScore;
  }

  public void setPositionScore(long positionScore) {
    this.positionScore = positionScore;
  }


  public long getFacilitiesScore() {
    return facilitiesScore;
  }

  public void setFacilitiesScore(long facilitiesScore) {
    this.facilitiesScore = facilitiesScore;
  }


  public long getServiceScore() {
    return serviceScore;
  }

  public void setServiceScore(long serviceScore) {
    this.serviceScore = serviceScore;
  }


  public long getHygieneScore() {
    return hygieneScore;
  }

  public void setHygieneScore(long hygieneScore) {
    this.hygieneScore = hygieneScore;
  }


  public long getScore() {
    return score;
  }

  public void setScore(long score) {
    this.score = score;
  }


  public long getTripMode() {
    return tripMode;
  }

  public void setTripMode(long tripMode) {
    this.tripMode = tripMode;
  }


  public long getIsOk() {
    return isOk;
  }

  public void setIsOk(long isOk) {
    this.isOk = isOk;
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
