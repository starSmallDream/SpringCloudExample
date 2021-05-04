package cn.dmahz.web

import cn.dmahz.inter.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class HelloWorldApi {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DiscoveryClient discoveryClient

    @Autowired
    HelloService helloService;

    @GetMapping("/home")
    String home(){

        def instance = discoveryClient.getInstances("ExampleServices")
        def get = instance.get(0)

        def entity = restTemplate.getForEntity("http://" + get.getServiceId() + "/s-hello", String.class)
        return entity
    }

    @GetMapping("/hello")
    String hello(){
        return helloService.hello();
    }

}
