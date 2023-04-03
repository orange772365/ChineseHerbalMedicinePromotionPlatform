package com.herb.plant.community.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDate;

/**
 * @Author 一五一十
 * @Date 2023/4/2 22:45
 * @Version 1.0 （版本号）
 */
public class AutoFullObject implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        metaObject.setValue("createTime", LocalDate.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        metaObject.setValue("createTime", LocalDate.now());
        metaObject.setValue("updateTime",LocalDate.now());
    }
}
