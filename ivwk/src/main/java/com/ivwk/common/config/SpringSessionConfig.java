package com.ivwk.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(prefix = "ivwk", name = "spring-session-open", havingValue = "true")
public class SpringSessionConfig {

}
