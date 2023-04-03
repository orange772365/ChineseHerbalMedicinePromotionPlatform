package com.herb.plant.community.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author 一五一十
 * @since 2023-04-02
 */
@TableName("mc_article")
public class ArticleEntity extends Model<ArticleEntity> {

    private static final long serialVersionUID = 1L;

      /**
     * 文章ID
     */
        @TableId(value = "article_id", type = IdType.AUTO)
      private Integer articleId;

      /**
     * 用户ID
     */
      private Integer userId;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;
      /**
     * 标题
     */
      private String title;

      /**
     * 原始的正文内容
     */
      private String contentMarkdown;

      /**
     * 过滤渲染后的正文内容
     */
      private String contentRendered;

      /**
     * 评论数量
     */
      private Integer commentCount;

      /**
     * 浏览数量
     */
      private Integer watchCount;

      /**
     * 赞成票总数
     */
      private Integer likeCount;

      /**
     * 逻辑删除
     */
      @TableLogic
      private Integer isDelete;

      /**
     * 创建时间
     */
      @TableField(fill = FieldFill.INSERT_UPDATE)
      private Integer createTime;

      /**
     * 更新时间
     */
      @TableField(fill = FieldFill.UPDATE)
      private Integer updateTime;

      /**
     * 删除时间
     */
    
    public Integer getArticleId() {
        return articleId;
    }

      public void setArticleId(Integer articleId) {
          this.articleId = articleId;
      }
    
    public Integer getUserId() {
        return userId;
    }

      public void setUserId(Integer userId) {
          this.userId = userId;
      }
    
    public String getTitle() {
        return title;
    }

      public void setTitle(String title) {
          this.title = title;
      }
    
    public String getContentMarkdown() {
        return contentMarkdown;
    }

      public void setContentMarkdown(String contentMarkdown) {
          this.contentMarkdown = contentMarkdown;
      }
    
    public String getContentRendered() {
        return contentRendered;
    }

      public void setContentRendered(String contentRendered) {
          this.contentRendered = contentRendered;
      }
    
    public Integer getCommentCount() {
        return commentCount;
    }

      public void setCommentCount(Integer commentCount) {
          this.commentCount = commentCount;
      }
    
    public Integer getWatchCount() {
        return watchCount;
    }

      public void setWatchCount(Integer watchCount) {
          this.watchCount = watchCount;
      }
    
    public Integer getLikeCount() {
        return likeCount;
    }

      public void setLikeCount(Integer likeCount) {
          this.likeCount = likeCount;
      }
    
    public Integer getIsDelete() {
        return isDelete;
    }

      public void setIsDelete(Integer isDelete) {
          this.isDelete = isDelete;
      }
    
    public Integer getCreateTime() {
        return createTime;
    }

      public void setCreateTime(Integer createTime) {
          this.createTime = createTime;
      }
    
    public Integer getUpdateTime() {
        return updateTime;
    }

      public void setUpdateTime(Integer updateTime) {
          this.updateTime = updateTime;
      }


    @Override
    public Serializable pkVal() {
          return this.articleId;
      }

    @Override
    public String toString() {
        return "McArticleEntity{" +
              "articleId = " + articleId +
                  ", userId = " + userId +
                  ", title = " + title +
                  ", contentMarkdown = " + contentMarkdown +
                  ", contentRendered = " + contentRendered +
                  ", commentCount = " + commentCount +
                  ", watchCount = " + watchCount +
                  ", likeCount = " + likeCount +
                  ", isDelete = " + isDelete +
                  ", createTime = " + createTime +
                  ", updateTime = " + updateTime +
              "}";
    }
}
