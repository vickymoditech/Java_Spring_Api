package com.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @OneToOne(mappedBy = "user")
    @JsonBackReference
    private User_deatil ud;

    @ManyToMany(mappedBy = "user_id")
    @JsonBackReference
    private User_Language ul;

    public User_Language getUl() {
        return ul;
    }

    public void setUl(User_Language ul) {
        this.ul = ul;
    }

    public User_deatil getUd() {
        return ud;
    }

    public void setUd(User_deatil ud) {
        this.ud = ud;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}