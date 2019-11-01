import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Rajesh Dwivedi
 * Date: 11/1/19
 */
public class FinalJson {
    private InitialJson listOfFruits;

    @JsonProperty("List Fruits")
    public InitialJson getListOfFruits() {
        return listOfFruits;
    }

    public void setListOfFruits(InitialJson listOfFruits) {
        this.listOfFruits = listOfFruits;
    }
}
