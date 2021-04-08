package mvc.ct.controller;

import java.net.http.HttpHeaders;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.java.Log;
import mvc.ct.domain.Member;

@Log @Controller
@RequestMapping(value="/test")
public class TestController {
	
	@RequestMapping("/param1")
	public void m1(Member dto) {
		log.info(dto.getName() + dto.getAge());
	}
	
	@RequestMapping("/param2")
	public void m2(@RequestParam ArrayList<String> names) {
		log.info("test" + names);
	}
	
	@RequestMapping("/param4")
	public void m4(@RequestParam ArrayList<Member> member) {
		log.info("test" + member);
	}
	
	@RequestMapping("/param5")
	public void m5(Member dto,int page) {
		log.info(dto.getName() + dto.getAge() + page);
	}
	
//	@GetMapping("json1")
//	public ResponseEntity<String> json1() {
//		
//		String msg = "{\"name\" : \"Tom\", \"age\" : 20}";
//		
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Content-Type", "application/json;charset=utf-8");
//		
//		return new ResponseEntity<String>(msg, headers, HttpStatus.OK);
//	}
}