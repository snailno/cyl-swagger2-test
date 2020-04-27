package com.cyl.springboot.dao;

import com.cyl.springboot.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Administrator
 * @Date 2020/4/26 17:03
 * @Version 1.0
 */
@Repository
public interface AccountDao extends JpaRepository<Account,Integer> {
}
