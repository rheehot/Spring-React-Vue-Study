package com.example.demo.uss.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private long userNo;
	private String userId;
	private String passwd;
	private String passname;
	private String email;
}
