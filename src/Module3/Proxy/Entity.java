package Module3.Proxy;

public class Entity {

    private int id;
    private String component1;
    private String component2;

    public Entity(int id, String component2, String component1) {
        this.id = id;
        this.component2 = component2;
        this.component1 = component1;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", component1='" + component1 + '\'' +
                ", component2='" + component2 + '\'' +
                '}';
    }
}
