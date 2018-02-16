package com.model;

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

    public User_deatil getUd() {
        return ud;
    }

    public void setUd(User_deatil ud) {
        this.ud = ud;
    }

    @OneToOne(mappedBy = "u")
    private User_deatil ud;

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