package project.angoty.accountservice.mappers;

import project.angoty.accountservice.dtos.AccountDTO;
import project.angoty.accountservice.entities.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {

    public AccountDTO toDTO(Account account) {
        return new AccountDTO(
                account.getId(),
                account.getBalance(),
                account.getCurrency(),
                account.getCustomerId()
        );
    }

    public Account toEntity(AccountDTO dto) {
        return new Account(
                dto.getId(),
                dto.getBalance(),
                dto.getCurrency(),
                dto.getCustomerId()
        );
    }
}
