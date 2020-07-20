package com.cst.entities;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String password;
    private String gender;

}
