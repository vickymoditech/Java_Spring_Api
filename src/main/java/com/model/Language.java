package com.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lid;

    @NotNull
    private String lname;

    @ManyToMany(mappedBy = "language_id")
    @JsonBackReference
    private User_Language ul;


    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }


    public User_Language getUl() {
        return ul;
    }

    public void setUl(User_Language ul) {
        this.ul = ul;
    }

}
