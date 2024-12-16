package com.FlashCash.FlashCash.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {


    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;

}
