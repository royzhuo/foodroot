package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by roy.zhuo on 2018/9/17.
 */

@Entity
public class FoodType {
    @Id
    @Column
    private String id;
}
