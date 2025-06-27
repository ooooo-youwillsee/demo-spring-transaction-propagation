package com.ooooo.demo.service;

import com.ooooo.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */
@Service
public class DemoService {

    @Autowired
    private UserService userService;

    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_REQUIRED() {
        userService.REQUIRED(new User("111"), false);
        try {
            userService.REQUIRED(new User("222"), true);
        } catch (Exception ignored) {
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_REQUIRES_NEW() {
        userService.REQUIRED(new User("111"), false);
        try {
            userService.REQUIRES_NEW(new User("222"), true);
        } catch (Exception ignored) {
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_NESTED() {
        userService.REQUIRED(new User("111"), false);
        try {
            userService.NESTED(new User("222"), true);
        } catch (Exception ignored) {
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_NOT_SUPPORTED() {
        userService.REQUIRED(new User("111"), false);
        try {
            userService.NOT_SUPPORTED(new User("222"), true);
        } catch (Exception ignored) {
        }
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_SUPPORTS() {
        userService.REQUIRED(new User("111"), false);
        try {
            userService.SUPPORTS(new User("222"), true);
        } catch (Exception ignored) {
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_NEVER() {
        userService.REQUIRED(new User("111"), false);
        try {
            userService.NEVER(new User("222"), true);
        } catch (Exception ignored) {
        }
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_MANDATORY() {
        userService.REQUIRED(new User("111"), false);
        try {
            userService.MANDATORY(new User("222"), true);
        } catch (Exception ignored) {
        }
    }

}
