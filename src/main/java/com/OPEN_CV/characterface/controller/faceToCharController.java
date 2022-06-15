//package com.OPEN_CV.characterface.controller;
//
//import com.OPEN_CV.characterface.JWT.JWT;
//import com.OPEN_CV.characterface.service.FaceToCharService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.net.http.HttpResponse;
//
//@RestController
//@Slf4j
//public class faceToCharController {
//    FaceToCharService faceToCharService;
//    @PostMapping("/test")
//    public void image(@RequestParam("images1") MultipartFile multipartFile1,@RequestParam("images2") MultipartFile multipartFile2)
//    {
//      faceToCharService.facetoCharacter(multipartFile1,multipartFile2);
//    }
//
//}
