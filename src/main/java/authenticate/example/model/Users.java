package authenticate.example.model;

/**
 * Users
 */
public class Users {
    private String id;
    private String name;

    public Users(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}