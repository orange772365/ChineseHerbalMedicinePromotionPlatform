package com.herb.plant.community.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.herb.plant.community.entity.ArticleEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.herb.plant.community.entity.vo.QureyVo;

import java.util.List;

/**
 * <p>
 * 文章表 服务类
 * </p>
 *
 * @author 一五一十
 * @since 2023-04-02
 */
public interface ArticleService extends IService<ArticleEntity> {

    Page<ArticleEntity> getAll(QureyVo qureyVo, int page, int pageSize);

    void publish(ArticleEntity article);

    void deleteArticleAndComment(String id);
}
