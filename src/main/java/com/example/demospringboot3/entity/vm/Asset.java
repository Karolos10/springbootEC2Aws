package com.example.demospringboot3.entity.vm;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
public class Asset {

    private byte[] content;
    private String contentType;

    public Asset(byte[] content, String contentType) {
        this.content = content;
        this.contentType = contentType;
    }
}
