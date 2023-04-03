package com.herb.plant.community.entity.doc;

import com.herb.plant.community.entity.CommentEntity;
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
 * @Date 2023/4/2 23:08
 * @Version 1.0 （版本号）
 */
@Tag(name = "CommentApi", description = "评论相关api")
public interface CommentApiDoc {
    @Operation(summary = "通过帖子Id获取文章评论信息",parameters = {
            @Parameter(name = "id",description = "文章id")
    })
    @GetMapping("/comment/{id}")
    Result getCommentById(@PathVariable String id);

    @Operation(summary = "通过帖子Id添加评论",parameters = {
            @Parameter(name = "id",description = "文章id"),
            @Parameter(name = "comment",description = "评论实体")
    })
    @PostMapping("/comment/{id}")
    Result publishComment(@PathVariable String id, @RequestBody CommentEntity comment);
}
