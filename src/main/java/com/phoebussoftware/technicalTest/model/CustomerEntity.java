package com.phoebussoftware.technicalTest.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity {
  @Id Long customerId;

  public CustomerEntity(Long customerId) {
    this.customerId = customerId;
  }

  public CustomerEntity() {}

  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }
}
