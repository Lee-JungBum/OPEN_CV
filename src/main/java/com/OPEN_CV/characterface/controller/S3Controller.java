package com.OPEN_CV.characterface.controller;

import com.OPEN_CV.characterface.service.S3UploaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.Charset;

@RestController
public class S3Controller {
    @Autowired
    S3UploaderService s3UploaderService;

    @PostMapping("/images")
    @Transactional
    public ResponseEntity upload(@RequestParam("images") MultipartFile multipartFile, @RequestParam("password") int password, @RequestParam("email") String email ) throws IOException {

        String url = s3UploaderService.uploadFiles(multipartFile, "images/"+email.substring(0,email.indexOf("@")),password,email);
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        return new ResponseEntity(url,headers,HttpStatus.OK);
    }

    @PostMapping("/getImages")
    @Transactional
    public ResponseEntity download(@RequestParam(value = "password")int password,@RequestParam(value="email")String email) throws IOException {
        String url =  s3UploaderService.download(email,password);
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        return new ResponseEntity(url,headers,HttpStatus.OK);
    }
}
