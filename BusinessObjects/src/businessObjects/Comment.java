
package businessObjects;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Hector Zapata
 */
public class Comment {
    private int id;
    private int userId;
    private Date dateTime;
    private String content;
    private List<Integer> comments;

    public Comment(int userId, Date dateTime, String content, List<Integer> comments) {
        this.userId = userId;
        this.dateTime = dateTime;
        this.content = content;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Integer> getComments() {
        return comments;
    }

    public void setComments(List<Integer> comments) {
        this.comments = comments;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comment other = (Comment) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id=" + id + ", userId=" + userId + ", dateTime=" + dateTime + ", content=" + content + ", comments=" + comments;
    }
    
    
    
}
