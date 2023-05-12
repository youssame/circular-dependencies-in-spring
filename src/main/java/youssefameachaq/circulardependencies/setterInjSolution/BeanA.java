package youssefameachaq.circulardependencies.setterInjSolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private BeanB circB;

    @Autowired
    public void setCircB(BeanB circB) {
        this.circB = circB;
    }

    public BeanB getCircB() {
        return this.circB;
    }
}
