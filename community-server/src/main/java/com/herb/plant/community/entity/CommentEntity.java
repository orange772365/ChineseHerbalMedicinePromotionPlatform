package com.herb.plant.community.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 回答评论表
 * </p>
 *
 * @author 一五一十
 * @since 2023-03-31
 */
@TableName("mc_comment")
public class CommentEntity extends Model<CommentEntity> {

    private static final long serialVersionUID = 1L;

      /**
     * 回答评论ID
     */
        @TableId(value = "comment_id", type = IdType.ASSIGN_ID)
      private Integer commentId;

      /**
     * 评论目标的ID
     */
      private Integer articleId;

      /**
     * 评论目标类型：article、question、answer、comment
     */
      private String commentableType;

      /**
     * 用户ID
     */
      private Integer userId;

      /**
     * 原始正文内容
     */
      private String content;

      /**
     * 回复数量
     */
      private Integer replyCount;

      /**
     * 点赞数
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
      @TableField(fill = FieldFill.INSERT)
      private Integer createTime;

      /**
     * 更新时间
     */
      @TableField(fill = FieldFill.INSERT_UPDATE)
      private Integer updateTime;

      /**
     * 删除时间
     */
      @TableField(fill = FieldFill.DEFAULT)
      private Integer deleteTime;
    
    public Integer getCommentId() {
        return commentId;
    }

      public void setCommentId(Integer commentId) {
          this.commentId = commentId;
      }



    public String getCommentableType() {
        return commentableType;
    }

      public void setCommentableType(String commentableType) {
          this.commentableType = commentableType;
      }
    
    public Integer getUserId() {
        return userId;
    }

      public void setUserId(Integer userId) {
          this.userId = userId;
      }
    
    public String getContent() {
        return content;
    }

      public void setContent(String content) {
          this.content = content;
      }
    
    public Integer getReplyCount() {
        return replyCount;
    }

      public void setReplyCount(Integer replyCount) {
          this.replyCount = replyCount;
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
    
    public Integer getDeleteTime() {
        return deleteTime;
    }

      public void setDeleteTime(Integer deleteTime) {
          this.deleteTime = deleteTime;
      }

    @Override
    public Serializable pkVal() {
          return this.commentId;
      }

    @Override
    public String toString() {
        return "McCommentEntity{" +
              "commentId = " + commentId +
                  ", commentableType = " + commentableType +
                  ", userId = " + userId +
                  ", content = " + content +
                  ", replyCount = " + replyCount +
                  ", likeCount = " + likeCount +
                  ", isDelete = " + isDelete +
                  ", createTime = " + createTime +
                  ", updateTime = " + updateTime +
                  ", deleteTime = " + deleteTime +
              "}";
    }
}
