package com.ruoyi.web.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guo Email:guoshuaihui20@mails.ucas.ac.cn
 * @date 2021/12/21 19:44
 */
@RestController
public class testGuoController {
    @GetMapping("/guo/test")
    public String guoTest(){
        return "guo";
    }
}
