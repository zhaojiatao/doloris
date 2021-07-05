package com.doloris.web;


import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/admin/mock")
public class MockController {





    @ResponseBody
    @GetMapping("/test01")
    @RequiresPermissions(value = {"mock中心"})
    public String loadCheckMenuInfo(String projectName,String postOrGet,String resultJson) throws Exception {

        log.info("projectName={},postOrGet={},resultJson={}",projectName,postOrGet,resultJson);




        //System.out.println(json);
        return String.format("projectName=%,postOrGet=%,resultJson=%",projectName,postOrGet,resultJson);
    }









}
