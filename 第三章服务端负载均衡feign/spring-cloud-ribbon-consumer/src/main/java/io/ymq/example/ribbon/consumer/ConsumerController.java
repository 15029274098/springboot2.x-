package io.ymq.example.ribbon.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConsumerController {
    @Autowired
    private HomeClient homeClient;

    @GetMapping("/hello")
    /**
     * @GetMapping("/hello")只针对hello方法
    * */
    public Map<String,String> hello() {
        return  homeClient.consumer();
    }
}
