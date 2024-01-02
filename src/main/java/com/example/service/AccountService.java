package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.dto.Account;
import com.example.vo.request.EmailRegisterVO;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface AccountService extends IService<Account>, UserDetailsService {
    Account findAccountByNameOrEmail(String text);
    String registerEmailVerifyCode(String type, String email, String ip);

    String registerEmailAccount(EmailRegisterVO vo);
}
