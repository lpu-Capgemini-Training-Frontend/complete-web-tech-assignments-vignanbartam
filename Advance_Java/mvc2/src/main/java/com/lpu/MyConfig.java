package com.lpu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.lpu")
public class MyConfig {
	@Bean
	public ViewResolver view() {
		InternalResourceViewResolver rv = new InternalResourceViewResolver();
		rv.setPrefix("/WEB-INF/view/");
		rv.setSuffix(".jsp");
		return rv;
	}
}
