package project.angoty.accountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.angoty.accountservice.entities.Account;
import project.angoty.accountservice.repositories.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(AccountRepository accountRepository) {
        return args -> {
            accountRepository.saveAll(List.of(
                    Account.builder().balance(1200.0).currency("USD").customerId(1L).build(),
                    Account.builder().balance(500.0).currency("EUR").customerId(2L).build(),
                    Account.builder().balance(750.0).currency("MGA").customerId(3L).build()
            ));
        };
    }


}
