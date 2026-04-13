package project.angoty.accountservice.controllers;

import project.angoty.accountservice.dtos.AccountDTO;
import project.angoty.accountservice.services.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public List<AccountDTO> getAccounts() {
        return accountService.findAll();
    }

    @GetMapping("/account/{id}")
    public AccountDTO getAccountById(@PathVariable Long id) {
        return accountService.findById(id);
    }
}
