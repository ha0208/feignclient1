package com.example.springboot.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.feign.util.FeignServiceUtil;

@RestController
@RequestMapping("/SpringBoot-Project")
public class FeignController {
   @Autowired
   private FeignServiceUtil feignServiceUtil;
   
   @GetMapping("/student-name")
   public String getStudentName() {
	  return  feignServiceUtil.getName();
	   }
   
   @GetMapping("/student-address")
   public String getStudentAddress() {
	  return feignServiceUtil.getAddress();
   }
   
   @GetMapping("/student-branch")
   public String getStudentBranch() {
	  return feignServiceUtil.getBranch();
   }
}
