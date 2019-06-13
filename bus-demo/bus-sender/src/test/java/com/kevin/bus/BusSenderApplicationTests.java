package com.kevin.bus;

import com.kevin.bus.sender.BusSenderApplication;
import com.kevin.bus.sender.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BusSenderApplication.class)
public class BusSenderApplicationTests {
 
    @Autowired
    private Sender sender;
 
    @Test
    public void hello() throws Exception {
        for (int i = 0; i < 10; i++) {
            sender.send();
        }
    }
}