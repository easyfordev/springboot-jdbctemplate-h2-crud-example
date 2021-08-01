package com.easyfordev.study.h2crud.domain;

import lombok.Data;

@Data
public class Member {
    private Long id;
    private String name;

//    // Getter and Setter (사실 Lombok으로 해주면 간단하긴한데 .. 외워야하니까 타이핑하자)
//    public Long getId(){
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
