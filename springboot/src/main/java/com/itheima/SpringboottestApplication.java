package com.itheima;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
@SpringBootApplication
public class SpringboottestApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringboottestApplication.class, args);
	}

	@Value("${name}")
	private String name;

	@RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
	String index() throws UnsupportedEncodingException {
		System.out.println("hahah ");

		return new String(name.getBytes("utf-8"), "iso8859-1");
	}
}


