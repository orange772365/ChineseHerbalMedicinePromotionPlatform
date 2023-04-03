package com.herb.plant.community.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.herb.plant.community.entity.ArticleEntity;
import com.herb.plant.community.entity.vo.QureyVo;
import com.herb.plant.community.mapper.ArticleMapper;
import com.herb.plant.community.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mysql.cj.util.StringUtils;
import lombok.val;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author 一五一十
 * @since 2023-04-02
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, ArticleEntity> implements ArticleService {
    @Override
    public Page<ArticleEntity> getAll(QureyVo qureyVo, int page, int pageSize) {
        Page<ArticleEntity> pageInfo=new Page<>(page,pageSize);
        LambdaQueryWrapper<ArticleEntity> qw= new LambdaQueryWrapper<>();
        qw.like(!StringUtils.isNullOrEmpty(qureyVo.getTitle()),ArticleEntity::getTitle,qureyVo.getTitle())
                .like(!StringUtils.isNullOrEmpty(qureyVo.getAuthorName()),ArticleEntity::getAuthor,qureyVo.getAuthorName());
        this.page(pageInfo,qw);
        return pageInfo;
    }

    @Override
    public void deleteArticleAndComment(String id) {

    }

    @Override
    public void publish(ArticleEntity article) {
        val save = this.save(article);

    }
}
