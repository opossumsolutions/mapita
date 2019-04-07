package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(CommentsPK.class)
public class Comments {
    private Integer commentId;
    private Integer commentOwner;
    private String commentText;

    @Id
    @Column(name = "comment_id", nullable = false)
    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    @Id
    @Column(name = "comment_owner", nullable = false)
    public Integer getCommentOwner() {
        return commentOwner;
    }

    public void setCommentOwner(Integer commentOwner) {
        this.commentOwner = commentOwner;
    }

    @Basic
    @Column(name = "comment_text", nullable = false, length = -1)
    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comments comments = (Comments) o;

        if (!Objects.equals(commentId, comments.commentId)) return false;
        if (!Objects.equals(commentOwner, comments.commentOwner)) return false;
        return Objects.equals(commentText, comments.commentText);

    }

    @Override
    public int hashCode() {
        int result = commentId != null ? commentId.hashCode() : 0;
        result = 31 * result + (commentOwner != null ? commentOwner.hashCode() : 0);
        result = 31 * result + (commentText != null ? commentText.hashCode() : 0);
        return result;
    }
}
