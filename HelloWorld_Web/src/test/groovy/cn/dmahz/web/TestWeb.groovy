package cn.dmahz.web

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.client.discovery.DiscoveryClient

@SpringBootTest
class TestWeb {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Test
    void test1(){
        def list = discoveryClient.getInstances("ExampleWeb")
        println list.size()
        println list.get(0).getUri()

    }

}
