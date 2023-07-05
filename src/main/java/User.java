// User class implementing Comparable
public class User implements Comparable<User> {
    private String name; // user as defined in main ""

    public User() {
    } // default constructor

    public User(String name) {
        this.name = name; // constructor
    }

    public String getName() {
        return name; // getter
    }

    @Override
    public int compareTo(User otherUser) {
        return this.name.compareTo(otherUser.getName());
    }
}