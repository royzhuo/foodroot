package com.service;

import com.dao.FoodDao;
import com.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by roy.zhuo on 2018/9/18.
 */

@Service
@Transactional
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodDao foodDao;
    @Override
    public void save(Food food) {
        foodDao.add(food);
    }
}
