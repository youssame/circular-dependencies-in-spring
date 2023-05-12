package youssefameachaq.circulardependencies.lazySolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private BeanB circB;

    @Autowired
    public BeanA(BeanB circB) {
        this.circB = circB;
    }
}
