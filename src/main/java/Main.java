import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Assignments:
 * Write a class that simulates a stack
 * and a FIFO (first in first out) queue using generics and arrays.
 *
 * For the previous classes add the following operations: add, remove, get, list and isEmpty.
 * Create a User class that implements Comparable.
 *
 * Write a class that demonstrates how sorting works on an array of Users.
 * Using a HashMap collection implementation, create a dictionary console application.
 *
 * Read the word definitions from a JSON file on disk.
 * Chose the JSON structure and class model that best suites your approach.
 *
 * Write a method that can determine whether two lists are equal or not.
 * The lists will be considered equal if they contain the same elements, regardless of their order.
 */

// Sorting an array of Users,
// and in the next line I create two instances of the User class (user1 and user2) with different names.
// Then, we call the compareUsers method, passing the two User objects as arguments.
// The compareUsers method internally calls the compareTo method of the User class to compare the names of the users.
// Finally, based on the comparison result, we print whether user1 comes before user2, comes after user2, or if they are equal.
public class Main {
    public static void main(String[] args) {

        System.out.println("With this method I demonstrate the usage of the Stack class:");

        User[] users = {
                new User("First User"),
                new User("Second User"),
                new User("Third User"),
                new User("Other User"),
                new User("This User")
        };

        Arrays.sort(users);

        for (User user : users) {
            System.out.println(user.getName());
        }

        User user1 = new User("Name as User");
        User user2 = new User("You as User");

        int result = ListEquality.compareUsers(user1, user2);
        if (result < 0) {
            System.out.println(user1.getName() + " comes before " + user2.getName());
        } else if (result > 0) {
            System.out.println(user1.getName() + " comes after " + user2.getName());
        } else {
            System.out.println(user1.getName() + " and " + user2.getName() + " are equal");
        }

        System.out.println("---------------------");
        System.out.println("With this method I demonstrate the usage of the Stack class:");

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.list(); // Display the elements in the stack

        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        int topElement = stack.get();
        System.out.println("Top element: " + topElement);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty); // isEmpty here will be returned as "true" or "false"

        System.out.println("---------------------");
        System.out.println("With this method I demonstrate the usage of the Queue class:");

        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue elements are: ");
        queue.list(); // Display the elements in the queue

        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        int frontElement = queue.get();
        System.out.println("Front element: " + frontElement);

        System.out.println("Queue elements after removal:");
        queue.list();

//        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty); // isEmpty here will be returned as "true" or "false"

        System.out.println("---------------------");
        System.out.println("With this method I demonstrate the usage of the ListEquality class:");

        List<Integer> list1 = new ArrayList<>(); // creating a list1 with some values of type int to be compared with a similar list2
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>(); // list2
        list2.add(1);
        list2.add(2);
        list2.add(3);

        boolean isEqual = ListEquality.areListsEqual(list1, list2);
        // If list one and list two are equal will return true, otherwise is false
        System.out.println("Are the lists equal? " + isEqual); // isEqual here will be returned as "true" or "false"

        System.out.println("---------------------");
        System.out.println("With this method I demonstrate the usage of the DictionaryApp class:");

        DictionaryApp dictionaryApp = new DictionaryApp();

        dictionaryApp.addDefinition("apple", "noun\n" +
                "A quick stamp of the foot used in fencing as a feint to produce an opening.\n" +
                "A stroke on the opponent's foil or sword designed to notify him that the bout is to begin.\n" +
                "The stamping of the foot during ceremonial salutes prior to the bout. See salute.");
        dictionaryApp.addDefinition("car", "noun\n" +
                "An automobile.\n" +
                "A vehicle, such as a streetcar, that runs on rails.\n" +
                "A boxlike enclosure for passengers and freight on a conveyance.");
        dictionaryApp.addDefinition("book", "noun\n" +
                "A set of written, printed, or blank pages fastened along one side and encased between protective covers.\n" +
                "An e-book or other electronic resource structured like a book.\n" +
                "A printed or written literary work.");
        dictionaryApp.addDefinition("human", "noun\n" +
                "A member of the primate genus Homo, especially a member of the species Homo sapiens, distinguished from other apes by a large brain and the capacity for speech.\n" +
                "A person.\n" +
                "adjective\n" +
                "Of, relating to, or characteristic of humans.");

        String appleDefinition = dictionaryApp.getDefinition("apple");
        System.out.println("Definition of 'apple': " + appleDefinition);

        dictionaryApp.listAllWords();

//        boolean isEmpty = dictionaryApp.isEmpty();
        System.out.println("Is the dictionary empty? " + isEmpty); // isEmpty here will be returned as "true" or "false"

        System.out.println("---------------------");
        System.out.println("With this methods I demonstrate the usage of the JSON for User class:");

        System.out.println("Serializing and deserializing using JSON:");

        User user = new User("Vlad Dracul");
        JSON.serializeUserToJson(user);

        String json = "{\"name\":\"Vlad Dracul, is Dracula\"}";
        JSON.processUserJson(json);
        String json0 = "{\"name\":\"First User, is on the zero position\"}";
        JSON.processUserJson(json0);
        String json1 = "{\"name\":\"Second User, is on the first position\"}";
        JSON.processUserJson(json1);
        String json2 = "{\"name\":\"Third User, is on the second position\"}";
        JSON.processUserJson(json2);
        String json3 = "{\"name\":\"Other User, is on other position\"}";
        JSON.processUserJson(json3);
        String json4 = "{\"name\":\"This User, is on this position\"}";
        JSON.processUserJson(json4);
        System.out.println("---------------------");

        System.out.println("With this methods I demonstrate the usage of the XML for User class:");

        System.out.println("Marshaling using XML:");
        System.out.println("---------------------");

//        User user3 = new User("New User");
//        XML xmlUser = new XML();
//
//        xmlUser.marshalUser(user);
//        xmlUser.marshalUser(user1);
//        xmlUser.marshalUser(user2);
//        xmlUser.marshalUser(user3);
//
//        User unmarshaledUser = xmlUser.unmarshalUser();
//        System.out.println("Unmarshaled User Name: " + unmarshaledUser.getName() + ".");

        System.out.println("serialize Json");
        JSON gson = new JSON();
        System.out.println(gson.serializeUser(user));

        System.out.println("deserialize Json");
        User myUser = gson.deserializeUser("{\"name\":\"Vlad Dracul\"}");
        System.out.println(myUser.getName());

    }
}