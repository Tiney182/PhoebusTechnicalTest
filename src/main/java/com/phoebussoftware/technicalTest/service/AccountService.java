package com.phoebussoftware.technicalTest.service;

import com.phoebussoftware.technicalTest.DTO.AccountDTO;
import com.phoebussoftware.technicalTest.model.AccountEntity;
import com.phoebussoftware.technicalTest.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

  AccountRepository repository;

  @Autowired
  public AccountService(AccountRepository repository) {
    this.repository = repository;
  }

  public boolean createAccount(long id, int accountNumber) {
    AccountEntity accountEntity = new AccountEntity();
    accountEntity.setAccountId(id);
    accountEntity.setAccountNumber(accountNumber);
    try {
      repository.save(accountEntity);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return true;
  }

  public AccountDTO getAccountById(int id) {
    Optional<AccountEntity> accountEntityOptional = repository.findById(id);
    if (accountEntityOptional.isPresent()) {
      return AccountDTO.builder().accountId(accountEntityOptional.get().getAccountId()).build();
    } else {
      throw new RuntimeException("account not found");
    }
  }

}
