package cn.itrip.pojo;


public class ItripHotelRoom {

  private long id;
  private long hotelId;
  private String roomTitle;
  private double roomPrice;
  private long roomBedTypeId;
  private long isHavingBreakfast;
  private long payType;
  private double satisfaction;
  private long isBook;
  private long isCancel;
  private long isTimelyResponse;
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


  public String getRoomTitle() {
    return roomTitle;
  }

  public void setRoomTitle(String roomTitle) {
    this.roomTitle = roomTitle;
  }


  public double getRoomPrice() {
    return roomPrice;
  }

  public void setRoomPrice(double roomPrice) {
    this.roomPrice = roomPrice;
  }


  public long getRoomBedTypeId() {
    return roomBedTypeId;
  }

  public void setRoomBedTypeId(long roomBedTypeId) {
    this.roomBedTypeId = roomBedTypeId;
  }


  public long getIsHavingBreakfast() {
    return isHavingBreakfast;
  }

  public void setIsHavingBreakfast(long isHavingBreakfast) {
    this.isHavingBreakfast = isHavingBreakfast;
  }


  public long getPayType() {
    return payType;
  }

  public void setPayType(long payType) {
    this.payType = payType;
  }


  public double getSatisfaction() {
    return satisfaction;
  }

  public void setSatisfaction(double satisfaction) {
    this.satisfaction = satisfaction;
  }


  public long getIsBook() {
    return isBook;
  }

  public void setIsBook(long isBook) {
    this.isBook = isBook;
  }


  public long getIsCancel() {
    return isCancel;
  }

  public void setIsCancel(long isCancel) {
    this.isCancel = isCancel;
  }


  public long getIsTimelyResponse() {
    return isTimelyResponse;
  }

  public void setIsTimelyResponse(long isTimelyResponse) {
    this.isTimelyResponse = isTimelyResponse;
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
