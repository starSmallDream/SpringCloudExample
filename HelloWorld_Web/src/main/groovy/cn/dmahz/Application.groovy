package cn.dmahz

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class Application {

    static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @LoadBalanced
    @Bean
    RestTemplate loadbalancedRestTemplate(){
        return new RestTemplate();
    }

}
