package model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TopicsPK implements Serializable {
    private Integer topicId;
    private Integer topicOwner;

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
        TopicsPK topicsPK = (TopicsPK) o;
        return Objects.equals(topicId, topicsPK.topicId) &&
                Objects.equals(topicOwner, topicsPK.topicOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicId, topicOwner);
    }
}
