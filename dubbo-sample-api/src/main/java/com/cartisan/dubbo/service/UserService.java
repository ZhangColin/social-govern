package com.cartisan.dubbo.service;

import java.util.Collection;

/**
 * @author colin
 */
public interface UserService {
    boolean save(User user);

    boolean remove(Long userId);

    Collection<User> findAll();
}
