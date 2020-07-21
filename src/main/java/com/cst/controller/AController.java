package com.cst.controller;

import com.cst.entities.User;

public class AController {
    public static void main(String[] args) {
        User user = User.builder()
                .name("梨花")
                .gender("汪洋")
                .password("****")
                .build();
        System.out.println(user);
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
}
