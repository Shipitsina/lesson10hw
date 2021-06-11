package ForTask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PhoneBook {
    static private List <Entry> entries = new ArrayList<>(Arrays.asList(new Entry("ivanov", 4520),
            new Entry("petrov",6830), new Entry("ivanov",9001)
    ));


    public void add (Entry newEntry) {
        entries.add(newEntry);
    }

    public static void sort(){
        Collections.sort(entries);
    }

    public void get(String findingSurname){
        for (Entry e:
             entries) {
            if (findingSurname.equals(e.getSurname())) System.out.println(e.getSurname()+" " + e.getPhoneNumber());
        }
    }
}
