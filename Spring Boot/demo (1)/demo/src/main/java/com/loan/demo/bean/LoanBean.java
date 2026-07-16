package com.loan.demo.bean;

import java.time.LocalDate;

public class LoanBean {

    private int loanId;
    private String loanee;
    private String mobile;
    private String loanDesc;
    private LocalDate disbData;
	public LoanBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanBean(int loanId, String loanee, String mobile, String loanDesc, LocalDate disbData) {
		super();
		this.loanId = loanId;
		this.loanee = loanee;
		this.mobile = mobile;
		this.loanDesc = loanDesc;
		this.disbData = disbData;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanee() {
		return loanee;
	}
	public void setLoanee(String loanee) {
		this.loanee = loanee;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLoanDesc() {
		return loanDesc;
	}
	public void setLoanDesc(String loanDesc) {
		this.loanDesc = loanDesc;
	}
	public LocalDate getDisbData() {
		return disbData;
	}
	public void setDisbData(LocalDate disbData) {
		this.disbData = disbData;
	}

    // Constructors, Getters, Setters
    
    
}