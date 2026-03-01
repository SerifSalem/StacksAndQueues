package Lecture._3_TDDExample;

import java.util.ArrayList;

/* NameChecker1 - This class stores a list of predefined names and provides
 * a method to check whether a given name exists in the list.
 */
public class NameChecker2 {

    // ArrayList to store the names
    private ArrayList<String> names;

    // Constructor - Initializes the list and adds sample names.
    public NameChecker2() {
        // Create the ArrayList object
        names = new ArrayList<>();
        // Add names to the list
        names.add("ali"); names.add("sara"); names.add("john"); names.add("diana");
    }

    // nameExists - This method checks whether the given name exists in the list.
    public boolean nameExists(String name) {

        // Convert the input to lowercase once
        name = name.toLowerCase();

        // Case-sensitive comparison
        return names.contains(name);
    }
}