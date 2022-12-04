package com.wms.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author hujx4
 * @since 2022-11-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账号
     */
    private String no;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    private Integer age;

    private Integer sex;

    /**
     * 电话
     */
    private String phone;

    /**
     * 角色 0:超级管理员;1:管理员;2:普通账号
     */
    private String roleId;

    /**
     * 是否有效 Y 有效,其他无效
     */
    @TableField("isValid")
    private String isvalid;

    private Integer id;
}
