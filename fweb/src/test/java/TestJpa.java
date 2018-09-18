
import com.dao.FoodDao;
import com.entity.Food;
import com.service.FoodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

/**
 * Created by roy.zhuo on 2018/9/17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class TestJpa {

    @Autowired
    private FoodService foodService;

    @Test
    public void testAddFoodDao(){
        Food food=new Food();
        food.setName("苹果");
        food.setId("1234555sss");
        food.setAddress("中国福建厦门");
        food.setCreateTime(new Date());
        food.setUpdateTime(new Date());
        food.setPrice(20.22);
        food.setPhotoUrl("http:www.baidu.com");
        foodService.save(food);
    }
}
