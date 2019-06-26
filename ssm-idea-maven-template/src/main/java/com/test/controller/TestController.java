package com.test.controller;

import com.test.model.TestTable;
import com.test.service.InsertUser;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private InsertUser insertUser;

    @RequestMapping("/hell")
    public String sayHell(Model model){

        TestTable tt =  new TestTable();
        tt.setTestAddr("北京市");
        tt.setTestName("胡硕");
        tt.setTestGender("男");
        insertUser.insertUser(tt);

//        model.addAttribute("liutao","helo!");
        return  "hell";
    }

    @RequestMapping("/toMain")
    public String toMain(){
        return  "main";
    }

}
