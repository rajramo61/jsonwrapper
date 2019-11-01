import com.fasterxml.jackson.annotation.*;

import java.util.List;

/**
 * @author Rajesh Dwivedi
 * Date: 11/1/19
 */


public class InitialJson {
    private List<Fruit> fruits;

    @JsonProperty("Fruits")
    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "InitialJson{" +
                "fruits=" + fruits +
                '}';
    }
}
