package com.phoebussoftware.technicalTest.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class AccountEntity {
  @Id Long accountId;

  @OneToOne CustomerEntity customer;

  public AccountEntity(Long accountId, CustomerEntity customer) {
    this.accountId = accountId;
    this.customer = customer;
  }

  public AccountEntity() {}

  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CustomerEntity getCustomer() {
    return customer;
  }

  public void setCustomer(CustomerEntity customer) {
    this.customer = customer;
  }
}
