package org.debugroom.sample.spring.cloud.stream.kafka.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan("org.debugroom.sample.spring.cloud.stream.kafka.app.web")
@Configuration
public class MvcConfig implements WebMvcConfigurer {
}
