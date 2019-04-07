package model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class RatingPK implements Serializable {
    private Integer ratingId;
    private Integer ratingOwner;
    private Integer commentId;
    private Integer commentOwner;

    @Column(name = "rating_id", nullable = false)
    @Id
    public Integer getRatingId() {
        return ratingId;
    }

    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
    }

    @Column(name = "rating_owner", nullable = false)
    @Id
    public Integer getRatingOwner() {
        return ratingOwner;
    }

    public void setRatingOwner(Integer ratingOwner) {
        this.ratingOwner = ratingOwner;
    }

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

        RatingPK ratingPK = (RatingPK) o;

        if (!Objects.equals(ratingId, ratingPK.ratingId)) return false;
        if (!Objects.equals(ratingOwner, ratingPK.ratingOwner)) return false;
        if (!Objects.equals(commentId, ratingPK.commentId)) return false;
        return Objects.equals(commentOwner, ratingPK.commentOwner);

    }

    @Override
    public int hashCode() {
        int result = ratingId != null ? ratingId.hashCode() : 0;
        result = 31 * result + (ratingOwner != null ? ratingOwner.hashCode() : 0);
        result = 31 * result + (commentId != null ? commentId.hashCode() : 0);
        result = 31 * result + (commentOwner != null ? commentOwner.hashCode() : 0);
        return result;
    }
}
