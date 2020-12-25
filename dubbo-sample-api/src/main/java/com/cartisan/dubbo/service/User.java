package com.cartisan.dubbo.service;

import lombok.Data;
import lombok.ToString;

/**
 * @author colin
 */
@Data
@ToString
public class User {
    private Long id;
    private String name;
    private Integer age;
}
