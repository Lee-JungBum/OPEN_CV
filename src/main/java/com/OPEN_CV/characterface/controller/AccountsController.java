package com.OPEN_CV.characterface.controller;

import com.OPEN_CV.characterface.domain.User;
import com.OPEN_CV.characterface.service.AccountsService;
import com.OPEN_CV.characterface.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Slf4j
public class AccountsController{
//        private final AccountsService accountsService;
//        private final EmailService emailService;
//        @Autowired
//        public AccountsController(AccountsService accountsService,
//                                  EmailService emailService) {
//            this.accountsService = accountsService;
//            this.emailService = emailService;
//        }
//
//    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity JoIn(@RequestBody User user) {
//
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        user = User.builder().email(user.getEmail()).idx(user.getIdx()).Name(user.getName()).password(passwordEncoder.encode(user.getPassword())).build();
//
//        accountsService.join(user);
//        emailService.SendJoinMail(user.getEmail());
//        log.info(user.getName() + "님의 회원가입이 정상적으로 완료되었습니다");
//        return new ResponseEntity(HttpStatus.OK);
//    }
//    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public User login(@RequestBody Map<String, String> userIdPassword) {
//        log.info(userIdPassword.toString());
//        return accountsService.login(userIdPassword);
//    }
//    @GetMapping("/emailcornfirm/{email}")
//    public String checkEmail(@PathVariable(value = "email") String email) {
//        log.info(email);
//        accountsService.emailCheck(email);
//        log.info("아매알 안중이 완료 되었습니다.");
//        return "true";
//    }
}
