package cn.itrip.pojo;


public class ItripProductStore {

  private long id;
  private long productType;
  private long productId;
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


  public long getProductType() {
    return productType;
  }

  public void setProductType(long productType) {
    this.productType = productType;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
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
