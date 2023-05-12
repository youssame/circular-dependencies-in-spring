package youssefameachaq.circulardependencies.lazySolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private BeanA circA;

    @Autowired
    public BeanB(@Lazy BeanA circA) {
        this.circA = circA;
    }
}
