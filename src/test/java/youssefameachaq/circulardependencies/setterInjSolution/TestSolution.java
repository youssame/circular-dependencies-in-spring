package youssefameachaq.circulardependencies.setterInjSolution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = { TestConfig.class })
class TestSolution {
    @Autowired
    ApplicationContext context;

    @Test
    public void givenBean_whenSetterInjection_thenItWorks() {
        BeanA circA = new BeanA();
        circA.setCircB(new BeanB());

        Assertions.assertEquals("Message !", circA.getCircB().getMessage());
    }
}