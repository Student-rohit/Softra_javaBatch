package com.example.learn.myfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataBaseConfRC {
	
	@Autowired
	DataBasePropertyConfiguration conf;
	
	@GetMapping("db-service")
	public DataBasePropertyConfiguration getConf() {
		return conf;
		
	}
	
	
	

}
