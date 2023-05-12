package youssefameachaq.circulardependencies.setterInjSolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private BeanA circA;

    @Autowired
    public void setCircA(BeanA circA) {
        this.circA = circA;
    }

    public String getMessage() {
        return "Message !";
    }
}
