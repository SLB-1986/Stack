// User class implementing Comparable
public class User implements Comparable<User> {
    private String name; // user as defined in main ""

    // default constructor required for JSOn deserialization
    public User() {
    }

    public User(String name) {
        this.name = name; // constructor
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name; // getter
    }

    @Override
    public int compareTo(User otherUser) {
        return this.name.compareTo(otherUser.getName());
    }
}