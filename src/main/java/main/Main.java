package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
// 指定扫描的类
@ComponentScan("dao")
public class Main {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(Main.class, args);
		System.out.println("http://10.0.17.19:8080/test");
	}

}
