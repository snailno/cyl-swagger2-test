package com.cyl.springboot.controller;

import com.cyl.springboot.entity.Account;
import com.cyl.springboot.service.AccountService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.HttpsURLConnection;
import java.util.List;

/**
 * @Author Administrator
 * @Date 2020/4/24 21:52
 * @Version 1.0
 */
@RestController
@RequestMapping("/accountapi")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @ApiOperation(value="获取账号列表", notes="获取账号列表")
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResponseEntity<List<Account>> loadAccounts(){
        List<Account> accounts = accountService.findAll();
        if(null!=accounts){
            return ResponseEntity.ok(accounts);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    @ApiOperation(value="增加账号", notes="增加账号")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> addAccount(Account account){
        Account account_ = accountService.saveAccount(account);
        if(null !=account_){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    @ApiOperation(value="修改账号信息", notes="修改账号信息")
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Void> updateAccount(Account account){
        Account account_ = accountService.updateAccount(account);
        if(null!=account_){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    @ApiOperation(value="获取指定账号", notes="获取指定账号")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Account> loadAccount(@PathVariable("id") Integer id){
        Account account = accountService.loadAccount(id);
        if(null!=account){
            return ResponseEntity.ok(account);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    @ApiOperation(value="删除指定账号", notes="删除指定账号")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removeAccount(@PathVariable("id") Integer id){
        accountService.deleteAccount(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
