package cn.dmahz.service.impl

import cn.dmahz.inter.HelloService
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RestController

@RestController
@Service
@RefreshScope
class HelloServiceImpl implements HelloService {

    @Value("\${student-name}")
    private String fooBar;

    @Override
    String hello() {
        return "Hello World:12345789" + fooBar
    }

    public static void main(String[] args) {
        println new HelloServiceImpl().hello()
    }

}
