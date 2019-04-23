package io.ymq.example.eureka.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaProviderApplication {

    /**
     * 读取配置文件中的端口信息
     */
    @Value("${server.port}")
    String port;
    /**
     * 读取配置文件中的应用名
     */
    @Value("${spring.application.name}")
    String name;
    /**
     * 请求路径
     */
    @RequestMapping("/hello")
    /**
     * 返回map信息
     */
    public Map<String,String> home() {
        Map<String,String> map=new HashMap<>();
        map.put("port",port);
        map.put("name",name);
        return map;
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class, args);
    }

}
