package com.example.demo01;

import cn.hutool.jwt.JWT;
import cn.hutool.jwt.signers.JWTSignerUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@Slf4j
public class Demo01ApplicationTests {

    @Test
    public void test01() {
        String sign = JWT.create()
                .setPayload("p13", "chensongye")
                .setExpiresAt(new Date(System.currentTimeMillis() + (1000 * 60 * 60 * 24)))
                .setSigner(JWTSignerUtil.none())
                .sign();
        log.info("result:{}", sign);

    }

}
