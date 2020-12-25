package com.cartisan.dubbo.service;

import java.util.Map;

/**
 * @author colin
 */
public interface RestService {
    String param(String param);

    String params(int a, String b);

    String headers(String header, String header2, Integer param);

    String form(String form);

    User requestBodyMap(Map<String, Object> data, String param);

    Map<String, Object> requestBodyUser(User user);
}
