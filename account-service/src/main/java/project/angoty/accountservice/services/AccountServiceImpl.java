package project.angoty.accountservice.services;

import project.angoty.accountservice.dtos.AccountDTO;
import project.angoty.accountservice.entities.Account;
import project.angoty.accountservice.mappers.AccountMapper;
import project.angoty.accountservice.repositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    public AccountServiceImpl(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }

    @Override
    public List<AccountDTO> findAll() {
        return accountRepository.findAll()
                .stream()
                .map(accountMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AccountDTO findById(Long id) {
        Account account = accountRepository.findById(id).orElse(null);
        return account != null ? accountMapper.toDTO(account) : null;
    }
}

