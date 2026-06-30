package com.example.learn.myfirst.rest.ctry;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learn.myfirst.bean.Country_Capital;

@RestController
public class CountryCapitalController {
	
	// define an end point
	@GetMapping("ctry_cap")
	public List<Country_Capital> getctry_cap(){
		return Arrays.asList( 
				
				new Country_Capital("india" ,"delhi"),
				new Country_Capital("usa" ,"asb")
				);
		
	}
	
	

}
