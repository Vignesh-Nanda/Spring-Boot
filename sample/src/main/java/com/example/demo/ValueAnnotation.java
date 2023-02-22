package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {
	@Value("${project.Name}")
	private String ProName;
	
	public String get()
	{
		return ProName;
	}
	
	public void set(String ProName)
	{
		this.ProName=ProName;
	}

}


