package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(TopicsPK.class)
public class Topics {
    private Integer topicId;
    private Integer topicOwner;
    private String topicName;
    private String topicColor;

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
    @Column(name = "topic_name", nullable = false, length = -1)
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    @Basic
    @Column(name = "topic_color", nullable = false, length = 9)
    public String getTopicColor() {
        return topicColor;
    }

    public void setTopicColor(String topicColor) {
        this.topicColor = topicColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Topics topics = (Topics) o;

        if (!Objects.equals(topicId, topics.topicId)) return false;
        if (!Objects.equals(topicOwner, topics.topicOwner)) return false;
        if (!Objects.equals(topicName, topics.topicName)) return false;
        return Objects.equals(topicColor, topics.topicColor);

    }

    @Override
    public int hashCode() {
        int result = topicId != null ? topicId.hashCode() : 0;
        result = 31 * result + (topicOwner != null ? topicOwner.hashCode() : 0);
        result = 31 * result + (topicName != null ? topicName.hashCode() : 0);
        result = 31 * result + (topicColor != null ? topicColor.hashCode() : 0);
        return result;
    }
}
