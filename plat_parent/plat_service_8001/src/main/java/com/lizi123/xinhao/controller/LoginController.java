package com.lizi123.xinhao.controller;

import com.lizi123.xinhao.domain.Employee;
import com.lizi123.xinhao.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    /**
     * 参数: Employee
     * 返回值:登录是否成功 AjaxResult
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee) {
        //模拟登录判断账户和密码
        if("admin".equals(employee.getName())&&"10086".equals(employee.getPassword())){
            return AjaxResult.me();
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或密码错误");
    }
}