package com.example.demo01.controller;

import cn.hutool.core.map.MapBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/test01")
@Slf4j
public class Test01Controller {

    @PostMapping("/testTPS")
    public ResponseEntity<Object> testTPS(@RequestBody Map<String, Object> map) {
        log.info("测试请求:{}", map);
        return ResponseEntity.ok(MapBuilder.<String, Object>create()
                        .put("requestTime", new Date())
                        .put("requestUser", System.getProperties())
                .build());
    }

}
