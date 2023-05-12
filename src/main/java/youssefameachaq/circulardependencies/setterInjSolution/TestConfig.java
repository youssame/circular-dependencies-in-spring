package youssefameachaq.circulardependencies.setterInjSolution;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "youssefameachaq.circulardependencies.lazySolution" })
public class TestConfig {
}
