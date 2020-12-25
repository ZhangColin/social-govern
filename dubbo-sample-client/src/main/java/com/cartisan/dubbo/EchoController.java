package com.cartisan.dubbo;

import com.cartisan.dubbo.service.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author colin
 */
@RestController
public class EchoController {
    @Reference
    private EchoService echoService;

    @GetMapping("echo")
    public String echo(String message) {
        return echoService.echo(message);
    }
}
