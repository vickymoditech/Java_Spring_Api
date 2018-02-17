package com.model;


import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_user_detail")
public class User_deatil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int uid;

    @NotNull
    private String fname;

    @NotNull
    private String lname;

    @NotNull
    private String city;

    @NotNull
    private Long contact;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    @NotNull
    private User user;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
