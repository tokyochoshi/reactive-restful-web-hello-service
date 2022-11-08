package com.reactive.restful.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class Greeting implements Serializable {
    private String message;

    public Greeting() {
    }

    public Greeting(String message) {
        this.message = message;
    }
}
