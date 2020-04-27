package com.cyl.springboot.service;

import com.cyl.springboot.entity.Account;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2020/4/24 21:50
 * @Version 1.0
 */
public interface AccountService {
    /**
     * 获得所有account
     * @return
     */
    List<Account> findAll();

    /**
     * 增
     * @param account
     * @return
     */
    Account saveAccount(Account account);

    /**
     * 改
     * @param account
     * @return
     */
    Account updateAccount(Account account);

    Account loadAccount(Integer id);

    void deleteAccount(Integer id);
}
