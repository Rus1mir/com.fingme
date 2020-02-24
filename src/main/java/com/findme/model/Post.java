package com.findme.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "POSTS")
public class Post {
    private Long id;
    private String message;
    private Date datePosted;
    private User userPosted;
    //TODO
    //level permissions

    //TODO
    //comments

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "POST_SEQ_GEN", sequenceName = "POST_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "POST_SEQ_GEN")
    public Long getId() {
        return id;
    }

    @Column(name = "MESSAGE")
    public String getMessage() {
        return message;
    }

    @Column(name = "DATE_POSTED")
    public Date getDatePosted() {
        return datePosted;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    public User getUserPosted() {
        return userPosted;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    public void setUserPosted(User userPosted) {
        this.userPosted = userPosted;
    }
}
