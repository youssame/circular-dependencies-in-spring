package youssefameachaq.circulardependencies.problem;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestProblem {
    @Test
    public void givenBean_whenConstructorInjection_thenItFails() {
        // It's an empty test, we just want the context to load
    }
}