package com.waitou.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ActiveProfiles(value = "local")
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test(){
        log.debug("debug");
        log.info("info");
        log.error("error");
        log.error("error2");
    }
}
