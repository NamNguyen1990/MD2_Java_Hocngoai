package quanlytinh;

import java.util.ArrayList;
import java.util.List;

public class ManagePerson {
    List<Person> people = new ArrayList<>();

    public ManagePerson() {
    }

    public void add(Person person) {
        people.add(person);
    }
    public void printAll() {
        for (Person p: people) {
            System.out.println(p);
        }
    }



}
