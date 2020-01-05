package com.gunn.entity;


import lombok.Builder;
import lombok.Data;

/**
 * @author ganjunhui
 * @date 2020/1/5 10:54 上午
 */
@Data
@Builder
public class User {

    private Integer Id;

    private String name;

    private Integer age;

    private Integer sex;
}
