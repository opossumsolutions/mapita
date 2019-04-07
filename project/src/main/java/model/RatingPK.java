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
        return Objects.equals(ratingId, ratingPK.ratingId) &&
                Objects.equals(ratingOwner, ratingPK.ratingOwner) &&
                Objects.equals(commentId, ratingPK.commentId) &&
                Objects.equals(commentOwner, ratingPK.commentOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ratingId, ratingOwner, commentId, commentOwner);
    }
}
