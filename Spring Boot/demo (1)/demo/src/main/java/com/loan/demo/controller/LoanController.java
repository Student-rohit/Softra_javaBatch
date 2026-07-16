package com.loan.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.demo.bean.LoanBean;
import com.loan.demo.service.LoanService;

@RestController
public class LoanController {

    @Autowired
    private LoanService service;

    @GetMapping("/loans")
    public List<LoanBean> getAllLoans() {
        return service.getAllLoans();
    }
}