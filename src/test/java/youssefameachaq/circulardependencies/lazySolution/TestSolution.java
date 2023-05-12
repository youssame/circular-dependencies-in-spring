package youssefameachaq.circulardependencies.lazySolution;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = { TestConfig.class })
class TestSolution {
    @Test
    public void givenBean_whenConstructorInjection_thenItFails() {
        // It's an empty test, we just want the context to load
    }
}