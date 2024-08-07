package com.easybytes.accounts.service;

import com.easybytes.accounts.dto.CustomerDto;
import com.easybytes.accounts.entity.Accounts;
import com.easybytes.accounts.entity.Customer;
import org.springframework.data.repository.query.Param;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
}
