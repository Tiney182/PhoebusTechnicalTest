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

  @NotNull(message= "Forename cannot be null")
  String foreName;

  @NotNull(message= "Surname cannot be null")
  String surname;

  @NotNull(message ="Date of Birth cannot be null")
  Date dateOfBirth;

  List<AccountDTO> accountDTOS;
}
