package youssefameachaq.circulardependencies.postConstructSolution;

import org.springframework.stereotype.Component;

@Component
public class BeanB {

    private BeanA circA;

    private String message = "Hi!";

    public void setCircA(BeanA circA) {
        this.circA = circA;
    }

    public String getMessage() {
        return message;
    }
}