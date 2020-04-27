package com.cyl.springboot.service.impl;

import com.cyl.springboot.dao.AccountDao;
import com.cyl.springboot.entity.Account;
import com.cyl.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2020/4/24 21:50
 * @Version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    /**
     * 获得所有account
     * @return
     */
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    /**
     * 增
     * @param account
     * @return
     */
    @Override
    public Account saveAccount(Account account) {
        return accountDao.save(account);
    }

    /**
     * 改
     * @param account
     * @return
     */
    @Override
    public Account updateAccount(Account account) {
        return accountDao.save(account);
    }

    @Override
    public Account loadAccount(Integer id) {
        return accountDao.getOne(id);
    }

    @Override
    public void deleteAccount(Integer id) {
        accountDao.deleteById(id);
    }
}
