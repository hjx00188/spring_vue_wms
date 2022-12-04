package com.wms.service;

import com.wms.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hujx4
 * @since 2022-11-29
 */
public interface IUserService extends IService<User> {

      List<User> listAll();
}
