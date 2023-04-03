package com.herb.plant.community.entity.doc;

import com.herb.plant.community.entity.ArticleEntity;
import com.herb.plant.community.entity.vo.QureyVo;
import com.herb.plant.community.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author 一五一十
 * @Date 2023/4/2 22:23
 * @Version 1.0 （版本号）
 */
@Tag(name = "ArticleApi", description = "文章相关Api")
public interface ArticleApiDoc {
    @Operation(summary = "主页帖子列表",
            parameters = {
                    @Parameter(name = "page", description = "页数"),
                    @Parameter(name = "qureyVo", description = "查询过滤条件"),
                    @Parameter(name = "pageSize", description = "每页的数据条数")
            })
    @GetMapping("/{page}/{pageSize}")
     Result getAllArticles(QureyVo qureyVo, @PathVariable Integer page, @PathVariable Integer pageSize);

    @Operation(summary = "发布帖子", parameters = {
            @Parameter(name = "article",description = "添加的帖子实体")
    })
    @PostMapping
     Result publishArticle(@RequestBody ArticleEntity article);
}
