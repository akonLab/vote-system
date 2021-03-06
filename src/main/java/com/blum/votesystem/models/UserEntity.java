
package com.blum.votesystem.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    private String user_name;
    private String user_group;
    private Integer user_age;
    private String user_interest;

    private String email;
    private String password;

    private String role;
    private String authorities;

    public UserEntity() {
    }

    public UserEntity(  String user_name, String user_group, Integer user_age, String user_interest, String email, String password, String role, String authorities) {
        this.user_name = user_name;
        this.user_group = user_group;
        this.user_age = user_age;
        this.user_interest = user_interest;
        this.email = email;
        this.password = password;
        this.role = role;
        this.authorities = authorities;
    }
    public UserEntity(Integer user_id, String user_name, String user_group, Integer user_age, String user_interest, String email, String password, String role, String authorities) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_group = user_group;
        this.user_age = user_age;
        this.user_interest = user_interest;
        this.email = email;
        this.password = password;
        this.role = role;
        this.authorities = authorities;
    }

    //setter

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_group(String user_group) {
        this.user_group = user_group;
    }

    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }

    public void setUser_interest(String user_interest) {
        this.user_interest = user_interest;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    //getter

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_group() {
        return user_group;
    }

    public Integer getUser_age() {
        return user_age;
    }

    public String getUser_interest() {
        return user_interest;
    }

    public String getRole() {
        return role;
    }

    public String getAuthorities() {
        return authorities;
    }
}
