package co.id.ms.demowebclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@Value("${application.param}")
	public String param;

	@GetMapping(path="/")
	public @ResponseBody String hello(){
		return this.param;
	}
}
