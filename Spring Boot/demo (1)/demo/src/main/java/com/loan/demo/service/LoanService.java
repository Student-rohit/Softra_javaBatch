package com.loan.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.loan.demo.bean.LoanBean;

@Service
public class LoanService {

    private static List<LoanBean> list = new ArrayList<>();

    static {
        list.add(new LoanBean(1, "Rohit", "9876543210",
                "Personal Loan", LocalDate.now()));
    }

    public List<LoanBean> getAllLoans() {
        return list;
    }
}