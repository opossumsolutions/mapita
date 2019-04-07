package model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class MarkersPK implements Serializable {
    private Integer markerId;
    private Integer topicId;
    private Integer topicOwner;

    @Column(name = "marker_id", nullable = false)
    @Id
    public Integer getMarkerId() {
        return markerId;
    }

    public void setMarkerId(Integer markerId) {
        this.markerId = markerId;
    }

    @Column(name = "topic_id", nullable = false)
    @Id
    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    @Column(name = "topic_owner", nullable = false)
    @Id
    public Integer getTopicOwner() {
        return topicOwner;
    }

    public void setTopicOwner(Integer topicOwner) {
        this.topicOwner = topicOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarkersPK markersPK = (MarkersPK) o;
        return Objects.equals(markerId, markersPK.markerId) &&
                Objects.equals(topicId, markersPK.topicId) &&
                Objects.equals(topicOwner, markersPK.topicOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markerId, topicId, topicOwner);
    }
}
