package org.example.test;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.example.AppTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AppTest.class})
@Slf4j
public class PorducerTest {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;
    @Test
    public void producer(){
        rocketMQTemplate.convertAndSend("springboot-rocketmq","hello,spring-rocket");
        log.info("rocketmq-消息发送完成");
    }
}
