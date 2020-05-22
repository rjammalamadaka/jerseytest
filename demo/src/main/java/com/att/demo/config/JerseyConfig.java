package com.att.demo.config;

import com.att.demo.service.HelloService;
import com.att.demo.service.ReverseService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        
        register(HelloService.class);
        register(ReverseService.class);
    }
}