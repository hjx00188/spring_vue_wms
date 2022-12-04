package com.wms.mapper;

import com.wms.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author hujx4
 * @since 2022-11-29
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> selectAll();

}
