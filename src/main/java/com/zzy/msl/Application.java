package com.zzy.msl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import com.zzy.msl.config.ServiceProperties;

/**
 * 服务启动程序。
 */
@ComponentScan
@EnableAutoConfiguration
@EnableConfigurationProperties(ServiceProperties.class)
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        final SpringApplication app = new SpringApplication(Application.class);
        final Environment env = app.run(args).getEnvironment();
        LOGGER.info("Application start profile is {}", env.getProperty("spring.profiles.active"));
    }
}
