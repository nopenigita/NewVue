package cn.itcast.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : huajuan
 * create at : 2019-10-15 23:34
 * description :
 * remark :
 * @program: hm49
 **/
@RestController
@RequestMapping("hello2")
public class Hello2Controller {

    @GetMapping("show")
    public String test(){
        return  "hello SpringBoot 2";
    }

}
