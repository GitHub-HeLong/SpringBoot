package ctrl;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Ctrl {

	@RequestMapping("/")
	String home() {
		/* @ComponentScan({ "main" }) */
		// http://10.0.17.19:8080/test
		return "Hello World!";
	}

}
