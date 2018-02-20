package com.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_user_language")
public class User_Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lid;

    @NotNull
    private String lname;


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

}
