import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public static void serializeUserToJson(User user) {
        JSON jsonParser = new JSON();
        String json = jsonParser.serializeUser(user);
        System.out.println("Serialized JSON:\n" + json);
    }

    public static void processUserJson(String json) {
        JSON jsonParser = new JSON();
        User user = jsonParser.deserializeUser(json);
        // Perform further processing with the user object
        String userName = user.getName();
        System.out.println("User Name: " + userName); // Accessing the user number and printing it
    }

    public String serializeUser(User user) {
        try {
            return this.objectMapper.writeValueAsString(user);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public User deserializeUser(String jsonRepresentation) {
        try {
            return (User) this.objectMapper.readValue(jsonRepresentation, User.class);
        } catch (Exception e) {
            e.printStackTrace();
            return new User("");
        }
    }

}
