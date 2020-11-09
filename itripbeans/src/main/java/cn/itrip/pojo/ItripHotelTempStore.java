package cn.itrip.pojo;


public class ItripHotelTempStore {

  private long id;
  private long hotelId;
  private long roomId;
  private java.sql.Timestamp recordDate;
  private long store;
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


  public long getRoomId() {
    return roomId;
  }

  public void setRoomId(long roomId) {
    this.roomId = roomId;
  }


  public java.sql.Timestamp getRecordDate() {
    return recordDate;
  }

  public void setRecordDate(java.sql.Timestamp recordDate) {
    this.recordDate = recordDate;
  }


  public long getStore() {
    return store;
  }

  public void setStore(long store) {
    this.store = store;
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
