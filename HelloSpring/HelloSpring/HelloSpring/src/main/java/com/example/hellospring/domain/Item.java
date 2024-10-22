package com.example.hellospring.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    private Long id;
    private String name;
    private Long count;
}
