package com.phoebussoftware.technicalTest.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {

    Long customerId;
    List<AccountDTO> accountDTOS;

    @NotNull
    String foreName;

    @NotNull
    String surName;

    @NotNull
    Date dateOfBirth;
}
