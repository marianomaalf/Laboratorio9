package cr.ac.una.est.minidiscord.business.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Message implements Serializable {

    private static final long serialVersionUID = 1l;
    private final User author;
    private final String content;
    private final LocalDateTime sentAt;

    public Message(final User author, final String content) {
        this(author, content, LocalDateTime.now());
    }


    public Message(User author, String content, LocalDateTime sentAt) {
        this.author = author;
        this.content = content;
        this.sentAt = sentAt;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    @Override
    public String toString() {

        return author.getUsername() + ": " + content;

    }
}
