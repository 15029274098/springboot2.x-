package io.ymq.example.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
/**
* @EnableEurekaClient
 * @EnableDiscoveryClient
 * 两个注解任选其一都是可以的
*/
public class ConfigClientApplication {
	//读取配置文件的端口号
    @Value("${server.port}")
    String port;
	
    @RequestMapping("/")
    public String home() {
        return "port:" + port;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
