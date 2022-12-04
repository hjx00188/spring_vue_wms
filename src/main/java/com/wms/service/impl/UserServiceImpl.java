package com.wms.service.impl;

import com.wms.entity.User;
import com.wms.mapper.UserMapper;
import com.wms.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hujx4
 * @since 2022-11-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> listAll() {
        return  userMapper.selectAll();
    }
}
