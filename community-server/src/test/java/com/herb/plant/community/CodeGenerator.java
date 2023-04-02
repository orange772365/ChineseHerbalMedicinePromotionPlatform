package com.herb.plant.community;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import org.junit.jupiter.api.Test;


/**
 * @author
 * @since 2018/12/13
 */
public class CodeGenerator {

    @Test
    public void run() {

        FastAutoGenerator.create("jdbc:mysql://8.130.25.174:3306/community?serverTimezone=UTC&useUniode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8","green","Green1014**##")
                .globalConfig(builder -> {
                    builder // （重要）配置后再次执行覆盖原有文件，建议配置
                            .fileOverride()
                            // （重要）配置输出的文件夹，springboot项目可以使用如下方式
                            .outputDir(System.getProperty("user.dir") + "/src/main/java")
                            // （重要）时间类型，看你喜欢用sql包中的Date、
                            // util包中的Date还是更新的LocalDateTime
                            .dateType(DateType.TIME_PACK)
                            // 配置生成文件中的author
                            .author("一五一十")
                            // 是否启用kotlin模式
//                            .enableKotlin()
                            // 是否启用swagger，比如启用后会在entity中自动生成字段ApiModel注释等等
//                            .enableSwagger()
                            // 注释日期的格式
                            .commentDate("yyyy-MM-dd")
                            .build();
                })
                .packageConfig(builder -> {
                    builder.parent("com.herb.plant.community")   // 设置父包名
                            .service("service")
                            .serviceImpl("service.imp")
                            .controller("web")
                    ;

                })
                .strategyConfig(builder -> {
                    builder
                            .addInclude("mc_article")
                            // 跳过视图的生成
                            .enableSkipView()
                            .entityBuilder()
                            // （重要）主键模式，这里设置自动模式，配合mysql的自增主键
                            .idType(IdType.ASSIGN_ID)
                            // entity文件名，这里配置后面统一加Entity后缀
                            .formatFileName("%sEntity")
                            // activeRecord模式，使用上来说就是
                            // 可以直接在entity对象上执行insert、update等操作
                            .enableActiveRecord()
                            .build();
                })
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new VelocityTemplateEngine())
                .execute();

    }
}
