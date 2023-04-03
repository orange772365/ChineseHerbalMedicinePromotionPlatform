package com.herb.plant.community.web;

import com.herb.plant.community.entity.CommentEntity;
import com.herb.plant.community.entity.vo.QureyVo;
import com.herb.plant.community.service.CommentService;
import com.herb.plant.community.utils.Result;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * 回答评论表 前端控制器
 * </p>
 *
 * @author 一五一十
 * @since 2023-03-31
 */

@Controller
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    /**
     * 主页帖子列表
     * @return
     */
    @GetMapping("/list/{id}")
    public Result getAllComment() {
        val list = commentService.list();
        return Result.success().put("row", list);
    }
    // TODO: 2023/4/2 删除帖子
    // TODO: 2023/4/2 发布帖子
}
