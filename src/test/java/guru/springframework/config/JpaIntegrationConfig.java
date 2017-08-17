package guru.springframework.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by El-Feky on 8/16/17.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("guru.springframework")
public class JpaIntegrationConfig {
}
