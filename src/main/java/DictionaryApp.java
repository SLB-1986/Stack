import java.util.HashMap;
import java.util.Map;

// Dictionary console application using HashMap
public class DictionaryApp {
    private Map<String, String> dictionary; // using the Map as <String, String>

    public DictionaryApp() {
        dictionary = new HashMap<>(); // the dictionary is used as a HashMap
    }

    public void addDefinition(String word, String definition) {
        dictionary.put(word, definition); // adding data in Map
    }

    public String getDefinition(String word) {
        return dictionary.get(word); //accessing a corresponding data from the Map elements
    }

    public void listAllWords() {
        for (String word : dictionary.keySet()) { // using the MapClass by calling a keySet
            System.out.println(word);
        }
    }

    public boolean isEmpty() {
        return dictionary.isEmpty();// using the MapClass by calling the boolean isEmpty
    }
}