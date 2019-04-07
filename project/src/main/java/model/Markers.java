package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(MarkersPK.class)
public class Markers {
    private Integer markerId;
    private Integer topicId;
    private Integer topicOwner;
    private Object markerLocation;

    @Id
    @Column(name = "marker_id", nullable = false)
    public Integer getMarkerId() {
        return markerId;
    }

    public void setMarkerId(Integer markerId) {
        this.markerId = markerId;
    }

    @Id
    @Column(name = "topic_id", nullable = false)
    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    @Id
    @Column(name = "topic_owner", nullable = false)
    public Integer getTopicOwner() {
        return topicOwner;
    }

    public void setTopicOwner(Integer topicOwner) {
        this.topicOwner = topicOwner;
    }

    @Basic
    @Column(name = "marker_location", nullable = false)
    public Object getMarkerLocation() {
        return markerLocation;
    }

    public void setMarkerLocation(Object markerLocation) {
        this.markerLocation = markerLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Markers markers = (Markers) o;
        return Objects.equals(markerId, markers.markerId) &&
                Objects.equals(topicId, markers.topicId) &&
                Objects.equals(topicOwner, markers.topicOwner) &&
                Objects.equals(markerLocation, markers.markerLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markerId, topicId, topicOwner, markerLocation);
    }
}
