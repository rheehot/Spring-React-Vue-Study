package mvc.ct.controller;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class TestController {
	public String m1() {
		log.info("hi");
		
		return "home";
	}
}
