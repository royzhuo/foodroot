package com.dao.impl;

import com.dao.FoodDao;
import com.entity.Food;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by roy.zhuo on 2018/9/17.
 */
@Repository
public class FoodDaoImpl implements FoodDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(Food food) {
        entityManager.persist(food);
    }
}
