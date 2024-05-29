package com.yupi.springbootinit.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
public class AiManagerTest {

    @Resource
    private AiManager aiManager;

//    @Test
//    public void doChat() {
//
//        String result = aiManager.doChat("邓紫棋");
//        System.out.println(result);
//
//    }
}