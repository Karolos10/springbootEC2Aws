package com.example.demospringboot3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
//@Data
//@NoArgsConstructor
//@RequiredArgsConstructor
public class Course {

    @Id
    @GeneratedValue
    private Integer id;

    @NonNull
    private String title;

    @NonNull
    private String imagePath;
    private String imageUrl;

    public Course() {
    }

    public Course(Integer id, String title, String imagePath, String imageUrl) {
        this.id = id;
        this.title = title;
        this.imagePath = imagePath;
        this.imageUrl = imageUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
