package com.example.hw.Model;

import javax.persistence.*;

@Table
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    public String mail;
    public String pass;


    public User() {
    }

    public User(String name, String mail, String pass) {
        this.name = name;
        this.mail = mail;
        this.pass = pass;
    }

    public User(int id, String name, String mail, String pass) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
