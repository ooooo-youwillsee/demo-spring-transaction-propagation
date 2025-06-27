package com.ooooo.demo.service;

import com.ooooo.demo.entity.User;
import com.ooooo.demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 模拟业务系统
 *
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */
@Slf4j
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED(User user, boolean throwException) {
        insertUser(user, throwException);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void REQUIRES_NEW(User user, boolean throwException) {
        insertUser(user, throwException);
    }

    @Transactional(propagation = Propagation.NESTED)
    public void NESTED(User user, boolean throwException) {
        insertUser(user, throwException);
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void NOT_SUPPORTED(User user, boolean throwException) {
        insertUser(user, throwException);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void SUPPORTS(User user, boolean throwException) {
        insertUser(user, throwException);
    }

    @Transactional(propagation = Propagation.NEVER)
    public void NEVER(User user, boolean throwException) {
        insertUser(user, throwException);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public void MANDATORY(User user, boolean throwException) {
        insertUser(user, throwException);
    }

    private void insertUser(User user, boolean throwException) {
        userMapper.insert(user);
        log.info("insert user {}", user);
        if (throwException) {
            throw new RuntimeException(user.toString());
        }
    }
}
