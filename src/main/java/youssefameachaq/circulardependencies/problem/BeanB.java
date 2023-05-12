package youssefameachaq.circulardependencies.problem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private BeanA circA;

    @Autowired
    public BeanB(BeanA circA) {
        this.circA = circA;
    }
}
