package cn.dmahz.inter

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(value = "ExampleServices")
interface HelloService {

    @RequestMapping(value = "/s-hello",method = RequestMethod.GET)
    String hello();

}