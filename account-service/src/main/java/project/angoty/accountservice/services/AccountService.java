package project.angoty.accountservice.services;

import project.angoty.accountservice.dtos.AccountDTO;
import java.util.List;

public interface AccountService {
    List<AccountDTO> findAll();
    AccountDTO findById(Long id);
}
