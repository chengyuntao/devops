package com.quxie.store.mapper;

import com.quxie.store.dao.CalligraphyDao;
import com.quxie.store.entity.Calligraphy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalligraphyMapperTests {
    @Autowired
    private CalligraphyDao calligraphyDao;

    @Test
    public void queryById(){
        Integer zid=2;
        Calligraphy result = calligraphyDao.queryById(zid);
        System.out.println(result);
    }
}
