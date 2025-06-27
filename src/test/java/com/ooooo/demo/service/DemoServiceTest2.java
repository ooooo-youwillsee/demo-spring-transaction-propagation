package com.ooooo.demo.service;

import com.ooooo.demo.entity.User;
import com.ooooo.demo.mapper.UserMapper;
import org.apache.ibatis.transaction.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */
@SpringBootTest
class DemoServiceTest2 {

    @Autowired
    private DemoService demoService;

    @Autowired
    private UserMapper userMapper;

    @BeforeEach
    void beforeEach() {
        // 删除所有的数据，避免对测试造成干扰
        userMapper.delete(null);
    }

    @Test
    void REQUIRED_REQUIRED() {
        demoService.REQUIRED_REQUIRED();
    }

    @Test
    void REQUIRED_REQUIRES_NEW() {
        demoService.REQUIRED_REQUIRES_NEW();
    }

    @Test
    void REQUIRED_NESTED() {
        demoService.REQUIRED_NESTED();
    }

    @Test
    void REQUIRED_NOT_SUPPORTED() {
        demoService.REQUIRED_NOT_SUPPORTED();
    }

    @Test
    void REQUIRED_SUPPORTS() {
        demoService.REQUIRED_SUPPORTS();
    }

    @Test
    void REQUIRED_NEVER() {
        demoService.REQUIRED_NEVER();
    }

    @Test
    void REQUIRED_MANDATORY() {
        demoService.REQUIRED_MANDATORY();
    }
}