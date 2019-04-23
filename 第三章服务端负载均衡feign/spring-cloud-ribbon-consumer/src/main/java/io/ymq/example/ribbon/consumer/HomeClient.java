package io.ymq.example.ribbon.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient("feign-provider")
public interface HomeClient {
    @GetMapping("/hello")
    /**@GetMapping("/hello")针对的是fegin里面的home方法
    * */
    Map<String,String> consumer();
}
