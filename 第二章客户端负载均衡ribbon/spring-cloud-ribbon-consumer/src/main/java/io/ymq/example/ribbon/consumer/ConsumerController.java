package io.ymq.example.ribbon.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * 描述:调用提供者的 `home` 方法
 *
 * @author lilei
 * @create 2019-04-23 22:48:53
 *
 * */

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
        /**
         * 这个是调用eureka-consumer本身应用用的对应的hello方法
         */
    @GetMapping("/hello")
    public Map<String,String> hello() {
        /**
         * （1）http://eureka-provider/hello请求就是eureka-provider
         * 三个同名运用的 @RequestMapping("/hello")对应的home方法
         * （2）通过url就可以调用了home方法
         */
        return restTemplate.getForEntity("http://eureka-provider/hello", Map.class).getBody();
    }

}
