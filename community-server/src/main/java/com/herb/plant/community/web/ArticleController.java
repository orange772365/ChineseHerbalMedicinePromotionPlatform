package com.herb.plant.community.web;

import com.herb.plant.community.entity.ArticleEntity;
import com.herb.plant.community.entity.doc.ArticleApiDoc;
import com.herb.plant.community.entity.vo.QureyVo;
import com.herb.plant.community.service.ArticleService;
import com.herb.plant.community.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * 文章表 前端控制器
 * </p>
 *
 * @author 一五一十
 * @since 2023-04-02
 */
@RestController
@RequestMapping("/article")
@RequiredArgsConstructor
public class ArticleController implements ArticleApiDoc {
    private final ArticleService articleService;

    // 社区主页获取帖子列表
    public Result getAllArticles(QureyVo qureyVo, @PathVariable Integer page, @PathVariable Integer pageSize) {
        val all = articleService.getAll(qureyVo, page, pageSize);
        return Result.success().put("rows", all.getRecords()).put("totol", all.getSize());
    }

    @PostMapping
    //   发布帖子
    public Result publishArticle(@RequestBody ArticleEntity article) {
        articleService.publish(article);
        return Result.success();
    }
    @DeleteMapping("/{id}")
    public Result deleteArticle(@PathVariable String id){
        articleService.deleteArticleAndComment(id);
        return null;
    }
}
