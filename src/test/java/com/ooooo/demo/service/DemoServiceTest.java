package com.ooooo.demo.service;

import com.ooooo.demo.entity.User;
import com.ooooo.demo.mapper.UserMapper;
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
class DemoServiceTest {

    @Autowired
    private DemoService demoService;

    @Autowired
    private UserMapper userMapper;

    @BeforeEach
    void beforeEach() {
        // 删除所有的数据，避免对测试造成干扰
        userMapper.delete(null);
    }

    /**
     * 结论：不会插入数据, 会抛出异常
     * org.springframework.transaction.UnexpectedRollbackException: Transaction rolled back because it has been
     * marked as rollback-only
     */
    @Test
    void REQUIRED_REQUIRED() {
        demoService.REQUIRED_REQUIRED();
    }

    /**
     * 结论：会插入 111 数据
     */
    @Test
    void REQUIRED_REQUIRES_NEW() {
        demoService.REQUIRED_REQUIRES_NEW();
        List<User> users = userMapper.selectList(null);
        assertThat(users).hasSize(1);
        assertThat(users.get(0).getName()).isEqualTo("111");
    }

    /**
     * 结论：会插入 111 数据
     */
    @Test
    void REQUIRED_NESTED() {
        demoService.REQUIRED_NESTED();
        List<User> users = userMapper.selectList(null);
        assertThat(users).hasSize(1);
        assertThat(users.get(0).getName()).isEqualTo("111");
    }

    /**
     * 结论：会插入 111 数据, 222 数据
     */
    @Test
    void REQUIRED_NOT_SUPPORTED() {
        demoService.REQUIRED_NOT_SUPPORTED();
    }

    /**
     * 结论：不会插入数据, 会抛出异常
     * org.springframework.transaction.UnexpectedRollbackException: Transaction rolled back because it has been
     * marked as rollback-only
     */
    @Test
    void REQUIRED_SUPPORTS() {
        demoService.REQUIRED_SUPPORTS();
    }

    /**
     * 结论：会插入 111 数据
     */
    @Test
    void REQUIRED_NEVER() {
        demoService.REQUIRED_NEVER();
    }

    /**
     * 结论：不会插入数据, 会抛出异常
     * org.springframework.transaction.UnexpectedRollbackException: Transaction rolled back because it has been
     * marked as rollback-only
     */
    @Test
    void REQUIRED_MANDATORY() {
        demoService.REQUIRED_MANDATORY();
    }
}