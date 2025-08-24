import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class interview2 {

    public static String sortAndGroupListOfProperties(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                List<Person> people = new ArrayList<>();
                people.add(parsePersonString(line));
            }
        } catch (Exception e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close(); // Close the reader to release resources
                } catch (IOException e) {
                    System.err.println("Error closing reader: " + e.getMessage());
                }
            }
        }
        return ""; // Return an empty string or appropriate result
    }

    private static Person parsePersonString(String personString) {
        String[] parts = personString.split(",");
        String id = parts[0].split("=")[1];
        String name = parts[1].split("=")[1];
        String city = parts[2].split("=")[1];
        String state = parts[3].split("=")[1];
        return new Person(id, name, city, state);
    }

    public static void main(String[] arg) {
        String str = "id=123,name=Sean Williams,city=Portland,state=Oregon";
        String st1 = "id=189,name=Sachin Dixit,city=Atlanta,state=Georgia";
        String st2 = "id=123,name=Sean Williams,city=Portland,state=Oregon";
        String st3 = "id=10267,name=Richard Albe,city=Miami,state=Florida";
        String st4 = "id=46235,name=Dorothy Cline,city=Portland,state=Oregon";

        List<Person> people = new ArrayList<>();
        people.add(parsePersonString(str));
        people.add(parsePersonString(st1));
        people.add(parsePersonString(st2));
        people.add(parsePersonString(st3));
        people.add(parsePersonString(st4));
        Collections.sort(people);

        for (Person p : people) {
            System.out.println(p.city + "-" + p.state + "-" + p.name + "-" + p.id + "\n\n\n");
        }

    }

}

class Person implements Comparable<Person> {
    int id;
    String name;
    String city;
    String state;

    public Person(String id, String name, String city, String state) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.city = city;
        this.state = state;
    }

    // Getters for all attributes
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public int compareTo(Person other) {
        this.state.compareTo(other.state);
        this.city.compareTo(other.city);
        this.name.compareTo(other.name);
        return Integer.compare(this.id, other.id);
    }

}