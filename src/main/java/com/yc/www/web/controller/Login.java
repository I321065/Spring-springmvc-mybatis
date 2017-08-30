package com.yc.www.web.controller;

import com.yc.www.web.service.bean.TestBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nick on 2017/2/24.
 */
@RestController
public class Login {
    @RequestMapping("/login")
    public TestBean getString() {
        System.out.println("fjsjfl");
        TestBean test = new TestBean();
        test.setName("fsalfjl");
        test.setA(1);
        test.setB(2);
        return test;
    }
}
