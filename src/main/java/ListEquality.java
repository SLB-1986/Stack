import java.util.ArrayList;
import java.util.List;

// Checking the equality of 2 different lists
public class ListEquality {
    // Comparing two ArrayLists <L> as list1 and list2 if are equal or not.
    // This will return true if the lists contain the same elements in the same order, and false otherwise.
    public static <L> boolean areListsEqual(List<L> list1, List<L> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        List<L> tempList1 = new ArrayList<>(list1);
        List<L> tempList2 = new ArrayList<>(list2);

        for (L element : tempList1) {
            if (tempList2.contains(element)) {
                tempList2.remove(element);
            } else {
                return false;
            }
        }
        return tempList2.isEmpty(); // Check if tempList2 is empty after removing all matching elements;
    }

    public static int compareUsers(User user1, User user2) {
        return user1.compareTo(user2);
    }
}