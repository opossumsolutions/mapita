package model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CommentsPK implements Serializable {
    private Integer commentId;
    private Integer commentOwner;

    @Column(name = "comment_id", nullable = false)
    @Id
    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    @Column(name = "comment_owner", nullable = false)
    @Id
    public Integer getCommentOwner() {
        return commentOwner;
    }

    public void setCommentOwner(Integer commentOwner) {
        this.commentOwner = commentOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentsPK that = (CommentsPK) o;

        if (!Objects.equals(commentId, that.commentId)) return false;
        return Objects.equals(commentOwner, that.commentOwner);

    }

    @Override
    public int hashCode() {
        int result = commentId != null ? commentId.hashCode() : 0;
        result = 31 * result + (commentOwner != null ? commentOwner.hashCode() : 0);
        return result;
    }
}
