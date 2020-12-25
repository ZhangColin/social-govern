package com.cartisan.dubbo;

import com.cartisan.dubbo.service.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author colin
 */
@Service
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String message) {
        return "[echo] Hello, " + message;
    }
}
