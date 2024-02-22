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
    private ServiceA serviceA;

    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_REQUIRED() {
        serviceA.REQUIRED(new User("111"), false);
        try {
            serviceA.REQUIRED(new User("222"), true);
        } catch (Exception ignored) {
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_REQUIRES_NEW() {
        serviceA.REQUIRED(new User("111"), false);
        try {
            serviceA.REQUIRES_NEW(new User("222"), true);
        } catch (Exception ignored) {
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_NESTED() {
        serviceA.REQUIRED(new User("111"), false);
        try {
            serviceA.NESTED(new User("222"), true);
        } catch (Exception ignored) {
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_NOT_SUPPORTED() {
        serviceA.REQUIRED(new User("111"), false);
        try {
            serviceA.NOT_SUPPORTED(new User("222"), true);
        } catch (Exception ignored) {
        }
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_SUPPORTS() {
        serviceA.REQUIRED(new User("111"), false);
        try {
            serviceA.SUPPORTS(new User("222"), true);
        } catch (Exception ignored) {
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_NEVER() {
        serviceA.REQUIRED(new User("111"), false);
        try {
            serviceA.NEVER(new User("222"), true);
        } catch (Exception ignored) {
        }
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void REQUIRED_MANDATORY() {
        serviceA.REQUIRED(new User("111"), false);
        try {
            serviceA.MANDATORY(new User("222"), true);
        } catch (Exception ignored) {
        }
    }

}
