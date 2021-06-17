package ForTask2;

import java.util.*;

public class PhoneBook {
    private final HashMap <String, ArrayList<Integer>> entries = new HashMap<>();

    public List<Integer> get(String findingSurname){
        return entries.get(findingSurname);
    }

    public void add (String name, int phoneNumber) {
        if (entries.get(name) != null){
            if (entries.get(name).contains(phoneNumber)) {
                System.out.println("This entry already exist!");
            } else
                entries.get(name).add(phoneNumber);
        } else {
            entries.put(name, new ArrayList<>() {{add(phoneNumber);}});}
    }


    @Override
    public String toString() {
        String s = "PhoneBook" +
                entries;
        return s;
    }
}
