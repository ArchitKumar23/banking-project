package com.springboot_project.banking_app.mapper;

import com.springboot_project.banking_app.dto.AccountDto;
import com.springboot_project.banking_app.entity.Account;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto){
        Account account=new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto mapToDto(Account account){
        AccountDto accountDto=new AccountDto(
                account.getAccId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
