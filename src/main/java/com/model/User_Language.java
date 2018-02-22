package com.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_user_language")
public class User_Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ulid;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private int user_id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "lid")
    private int language_id;

    public int getUlid() {
        return ulid;
    }

    public void setUlid(int ulid) {
        this.ulid = ulid;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

}
