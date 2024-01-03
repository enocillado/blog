package com.blog.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "post")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
//    Title
//            Content
//    AuthorID (Foreign Key referencing UserID from Users table)
//    CategoryID (Foreign Key referencing CategoryID from Categories table)
//    Publication Date
//    LastUpdated
//    Number of Views

    @Id
    private int id;
    private String title;
    private String content;
    private Integer authorId;
    private Integer numberOfLikes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(Integer numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", authorId='" + authorId + '\'' +
                ", numberOfLikes='" + numberOfLikes + '\'' +
                '}';
    }
}
