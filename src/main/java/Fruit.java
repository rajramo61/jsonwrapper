/**
 * @author Rajesh Dwivedi
 * Date: 11/1/19
 */
public class Fruit {
    private String name;
    private boolean organic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getOrganic() {
        return organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", organic=" + organic +
                '}';
    }
}
