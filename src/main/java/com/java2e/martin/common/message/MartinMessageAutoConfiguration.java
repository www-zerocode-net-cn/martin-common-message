package com.java2e.martin.common.message;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author 狮少
 * @version 1.0
 * @date 2020/9/27
 * @describtion MartinMessageAutoConfiguration
 * @since 1.0
 */
@Slf4j
@Configuration
@EnableAsync
@AllArgsConstructor
@ConditionalOnWebApplication
@ConditionalOnProperty(
        prefix = "martin.message",
        name = {"enabled"},
        havingValue = "true",
        matchIfMissing = true
)
@ComponentScan(basePackages = {"com.java2e.martin.common.message", "com.java2e.martin.common.core"})
public class MartinMessageAutoConfiguration {
}
