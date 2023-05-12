package youssefameachaq.circulardependencies.postConstructSolution;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    @Autowired
    private BeanB circB;

    @PostConstruct
    public void init() {
        circB.setCircA(this);
    }

    public BeanB getCircB() {
        return circB;
    }
}
