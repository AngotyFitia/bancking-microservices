package project.angoty.accountservice.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {

    private Long id;
    private Double balance;
    private String currency;
    private Long customerId;

}

