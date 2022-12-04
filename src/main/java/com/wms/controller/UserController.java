package com.wms.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wms.entity.User;
import com.wms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hujx4
 * @since 2022-11-29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

@GetMapping("/list")
    public List<User> list() {
        return iUserService.listAll();
    }

    //新增
    @PostMapping("/save")
    public boolean save(@RequestBody User user){
        return iUserService.save(user);
    }
    //修改
    @PostMapping("/mod")
    public boolean mod(@RequestBody User user){
        return iUserService.updateById(user);
    }
    //新增或修改
    @PostMapping("/saveOrMod")
    public boolean saveOrMod(@RequestBody User user){
        return iUserService.saveOrUpdate(user);
    }
    //删除
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return iUserService.removeById(id);
    }
    //模糊查询
    @PostMapping("/listP")
    public List<User> listP(@RequestBody User user){
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(User::getName,user.getName());
    return iUserService.list(lambdaQueryWrapper);

    }

}
