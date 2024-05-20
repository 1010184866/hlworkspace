package com.hl.crud_hl.controller;

import com.hl.crud_hl.dao.User;
import com.hl.crud_hl.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/crud/")
public class CrudController {
    @Autowired
    private CrudService crudService;

    @PostMapping("/insertLast")
    /*return的数据不会变成跳转路径，返回json*/
    @ResponseBody
    public void insertLast(@RequestParam Integer userId,
                           @RequestParam String userName,
                           @RequestParam Integer sex)
    {
        User user = new User();
        user.setUser_id(userId);
        user.setUsername(userName);
        user.setSex(sex);
        crudService.insert(user);
    }

    @GetMapping("/selectAll")
    /*return的数据不会变成跳转路径，返回json*/
    @ResponseBody
    public List<User> selectAll() {
        return crudService.selectAll();
    }

    @GetMapping("/selectByUserId")
    /*return的数据不会变成跳转路径，返回json*/
    @ResponseBody
    public List<User> selectByUserId(@RequestParam Integer userid) {
        return crudService.selectByUserId(userid);
    }

    @PutMapping("/update")
    /*return的数据不会变成跳转路径，返回json*/
    @ResponseBody
    public void update(@RequestParam Integer userId,
                             @RequestParam String userName,
                             @RequestParam Integer sex) {
        User user = new User();
        user.setUser_id(userId);
        user.setUsername(userName);
        user.setSex(sex);
        crudService.update(user);
    }
    @DeleteMapping("/delete")
    /*return的数据不会变成跳转路径，返回json*/
    @ResponseBody
    public void delete(@RequestParam Integer userId
                       ) {
        crudService.delete(userId);
    }

}

