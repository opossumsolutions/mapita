package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(RatingPK.class)
public class Rating {
    private Integer ratingId;
    private Integer ratingOwner;
    private Integer commentId;
    private Integer commentOwner;
    private Boolean ratingValue;
    private Comments comments;

    @Id
    @Column(name = "rating_id", nullable = false)
    public Integer getRatingId() {
        return ratingId;
    }

    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
    }

    @Id
    @Column(name = "rating_owner", nullable = false)
    public Integer getRatingOwner() {
        return ratingOwner;
    }

    public void setRatingOwner(Integer ratingOwner) {
        this.ratingOwner = ratingOwner;
    }

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
    @Column(name = "rating_value", nullable = false)
    public Boolean getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(Boolean ratingValue) {
        this.ratingValue = ratingValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rating rating = (Rating) o;

        if (!Objects.equals(ratingId, rating.ratingId)) return false;
        if (!Objects.equals(ratingOwner, rating.ratingOwner)) return false;
        if (!Objects.equals(commentId, rating.commentId)) return false;
        if (!Objects.equals(commentOwner, rating.commentOwner)) return false;
        return Objects.equals(ratingValue, rating.ratingValue);

    }

    @Override
    public int hashCode() {
        int result = ratingId != null ? ratingId.hashCode() : 0;
        result = 31 * result + (ratingOwner != null ? ratingOwner.hashCode() : 0);
        result = 31 * result + (commentId != null ? commentId.hashCode() : 0);
        result = 31 * result + (commentOwner != null ? commentOwner.hashCode() : 0);
        result = 31 * result + (ratingValue != null ? ratingValue.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "comment_id", referencedColumnName = "comment_id", nullable = false), @JoinColumn(name = "comment_owner", referencedColumnName = "comment_owner", nullable = false)})
    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }
}
