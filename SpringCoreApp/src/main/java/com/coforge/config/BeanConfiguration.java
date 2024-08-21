package com.coforge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coforge.beans.Address;
import com.coforge.beans.Pearson;
import com.coforge.beans.Wisher;

@Configuration
@ComponentScan(basePackages= "com.coforge.beans")
public class BeanConfiguration {

//	@Bean
//	public Pearson getPearson() {
//		
//		Pearson p = new Pearson() ;
//		p.setAge(34);
//		p.setName("bama");
//		return p;	
//		}
//	

	
	@Bean
	public Wisher getWisher() {
		return new Wisher();	
		}
}
