package com.example.cardgameapp;

public class User {
    public String fullName ,email;

    public User(String fullName,String email){
        this.fullName = fullName;
        this.email = email;
    }
    public User(){
        this("","");
    }

}