package login.com.example.login.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping("/")
	public String home() {
		return "Hello Stranger";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Hello User";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin";
	}
	
	

}
