package com.phoebussoftware.technicalTest.web;

import com.phoebussoftware.technicalTest.DTO.AccountDTO;
import com.phoebussoftware.technicalTest.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

  final AccountService accountService;

  @GetMapping("/{accountId}")
  public ResponseEntity<AccountDTO> getAccountById(@PathVariable Integer accountId) {
    return ResponseEntity.ok(accountService.getAccountById(accountId));
  }

  @PostMapping
  public ResponseEntity<Boolean> createAccount(@RequestBody AccountDTO accountDTO) {
    Boolean isAccountCreated = accountService.createAccount(accountDTO.getAccountId(), accountDTO.getAccountNumber());
    return ResponseEntity.ok(isAccountCreated);
  }
}
